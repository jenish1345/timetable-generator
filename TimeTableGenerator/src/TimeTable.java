import java.util.*;
import java.io.*;

/**
 * TimeTable class - Core class for generating and managing timetables
 * Handles timetable generation logic with constraints
 */
public class TimeTable {
    private int workingDays;
    private int periodsPerDay;
    private ArrayList<Subject> subjects;
    private ArrayList<Teacher> teachers;
    private int maxRepetitionsPerDay;
    private Subject[][] timetable; // [day][period]
    private Random random;
    private static final String[] DAYS = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    
    /**
     * Constructor to initialize timetable parameters
     */
    public TimeTable(int workingDays, int periodsPerDay, ArrayList<Subject> subjects, 
                     ArrayList<Teacher> teachers, int maxRepetitionsPerDay) {
        this.workingDays = workingDays;
        this.periodsPerDay = periodsPerDay;
        this.subjects = subjects;
        this.teachers = teachers;
        this.maxRepetitionsPerDay = maxRepetitionsPerDay;
        this.timetable = new Subject[workingDays][periodsPerDay];
        this.random = new Random();
    }
    
    /**
     * Generate the timetable with all constraints
     */
    public void generateTimetable() {
        // Clear existing timetable
        for (int day = 0; day < workingDays; day++) {
            for (int period = 0; period < periodsPerDay; period++) {
                timetable[day][period] = null;
            }
        }
        
        // Calculate total slots and required distribution
        int totalSlots = workingDays * periodsPerDay;
        int slotsPerSubject = totalSlots / subjects.size();
        int extraSlots = totalSlots % subjects.size();
        
        // Create a pool of subjects to be scheduled
        ArrayList<Subject> subjectPool = new ArrayList<>();
        for (Subject subject : subjects) {
            // Add each subject the calculated number of times
            for (int i = 0; i < slotsPerSubject; i++) {
                subjectPool.add(subject);
            }
        }
        
        // Distribute extra slots
        for (int i = 0; i < extraSlots; i++) {
            subjectPool.add(subjects.get(i % subjects.size()));
        }
        
        // Shuffle the pool for randomness
        Collections.shuffle(subjectPool, random);
        
        // Fill the timetable with constraints
        int poolIndex = 0;
        for (int day = 0; day < workingDays; day++) {
            ArrayList<Subject> usedInDay = new ArrayList<>();
            HashMap<Subject, Integer> dayCount = new HashMap<>();
            
            for (int period = 0; period < periodsPerDay; period++) {
                // Check for break/lunch period (add at middle of day)
                if (period == periodsPerDay / 2 && periodsPerDay > 4) {
                    timetable[day][period] = null; // Break period
                    continue;
                }
                
                Subject selectedSubject = null;
                int attempts = 0;
                int maxAttempts = subjectPool.size();
                
                // Try to find a suitable subject
                while (attempts < maxAttempts && poolIndex < subjectPool.size()) {
                    Subject candidate = subjectPool.get(poolIndex);
                    
                    // Check constraints
                    int currentCount = dayCount.getOrDefault(candidate, 0);
                    boolean consecutiveRepeat = (period > 0 && timetable[day][period - 1] == candidate);
                    
                    if (currentCount < maxRepetitionsPerDay && !consecutiveRepeat) {
                        selectedSubject = candidate;
                        poolIndex++;
                        break;
                    }
                    
                    poolIndex++;
                    attempts++;
                }
                
                // If no suitable subject found, pick any remaining
                if (selectedSubject == null && poolIndex < subjectPool.size()) {
                    selectedSubject = subjectPool.get(poolIndex);
                    poolIndex++;
                }
                
                // Assign subject to slot
                if (selectedSubject != null) {
                    timetable[day][period] = selectedSubject;
                    dayCount.put(selectedSubject, dayCount.getOrDefault(selectedSubject, 0) + 1);
                }
            }
        }
    }
    
    /**
     * Display the timetable in a formatted table
     */
    public void displayTimetable() {
        System.out.println("\n" + "═".repeat(80));
        System.out.println("GENERATED TIMETABLE");
        System.out.println("═".repeat(80));
        
        // Calculate column width
        int colWidth = 15;
        
        // Print header
        System.out.print(String.format("%-12s", "Period"));
        for (int day = 0; day < workingDays; day++) {
            System.out.print("│ " + String.format("%-" + colWidth + "s", DAYS[day]));
        }
        System.out.println("│");
        System.out.println("─".repeat(80));
        
        // Print each period
        for (int period = 0; period < periodsPerDay; period++) {
            System.out.print(String.format("%-12s", "Period " + (period + 1)));
            
            for (int day = 0; day < workingDays; day++) {
                Subject subject = timetable[day][period];
                String display;
                
                if (subject == null) {
                    display = "BREAK";
                } else {
                    display = subject.getName();
                    // Truncate if too long
                    if (display.length() > colWidth) {
                        display = display.substring(0, colWidth - 2) + "..";
                    }
                }
                
                System.out.print("│ " + String.format("%-" + colWidth + "s", display));
            }
            System.out.println("│");
        }
        
        System.out.println("═".repeat(80));
        
        // Display teacher assignments
        displayTeacherAssignments();
    }
    
    /**
     * Display teacher assignments summary
     */
    private void displayTeacherAssignments() {
        System.out.println("\nTEACHER ASSIGNMENTS:");
        System.out.println("─".repeat(40));
        for (Teacher teacher : teachers) {
            System.out.print(teacher.getName() + ": ");
            ArrayList<Subject> teacherSubjects = teacher.getSubjects();
            for (int i = 0; i < teacherSubjects.size(); i++) {
                System.out.print(teacherSubjects.get(i).getName());
                if (i < teacherSubjects.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
        System.out.println("─".repeat(40));
    }
    
    /**
     * Export timetable to a text file
     * @param filename Name of the file to export to
     * @return true if export successful, false otherwise
     */
    public boolean exportToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("═".repeat(80));
            writer.println("TIMETABLE EXPORT");
            writer.println("Generated on: " + new Date());
            writer.println("═".repeat(80));
            writer.println();
            
            // Write timetable
            int colWidth = 15;
            writer.print(String.format("%-12s", "Period"));
            for (int day = 0; day < workingDays; day++) {
                writer.print("| " + String.format("%-" + colWidth + "s", DAYS[day]));
            }
            writer.println("|");
            writer.println("─".repeat(80));
            
            for (int period = 0; period < periodsPerDay; period++) {
                writer.print(String.format("%-12s", "Period " + (period + 1)));
                
                for (int day = 0; day < workingDays; day++) {
                    Subject subject = timetable[day][period];
                    String display = (subject == null) ? "BREAK" : subject.getName();
                    
                    if (display.length() > colWidth) {
                        display = display.substring(0, colWidth - 2) + "..";
                    }
                    
                    writer.print("| " + String.format("%-" + colWidth + "s", display));
                }
                writer.println("|");
            }
            
            writer.println("═".repeat(80));
            writer.println();
            
            // Write teacher assignments
            writer.println("TEACHER ASSIGNMENTS:");
            writer.println("─".repeat(40));
            for (Teacher teacher : teachers) {
                writer.print(teacher.getName() + ": ");
                ArrayList<Subject> teacherSubjects = teacher.getSubjects();
                for (int i = 0; i < teacherSubjects.size(); i++) {
                    writer.print(teacherSubjects.get(i).getName());
                    if (i < teacherSubjects.size() - 1) {
                        writer.print(", ");
                    }
                }
                writer.println();
            }
            writer.println("─".repeat(40));
            
            return true;
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
            return false;
        }
    }
    
    /**
     * Get the timetable array
     * @return 2D array of subjects
     */
    public Subject[][] getTimetable() {
        return timetable;
    }
}
