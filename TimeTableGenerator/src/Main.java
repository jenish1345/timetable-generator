import java.util.*;

/**
 * Main class - Entry point for the TimeTable Generator application
 * Handles the menu-driven interface and user interactions
 */
public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static TimeTable timeTable;
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║   WELCOME TO TIMETABLE GENERATOR      ║");
        System.out.println("╔════════════════════════════════════════╗\n");
        
        boolean exit = false;
        
        while (!exit) {
            displayMainMenu();
            int choice = getValidIntInput("Enter your choice: ", 1, 4);
            
            switch (choice) {
                case 1:
                    setupAndGenerateTimetable();
                    break;
                case 2:
                    regenerateTimetable();
                    break;
                case 3:
                    exportTimetable();
                    break;
                case 4:
                    System.out.println("\nThank you for using TimeTable Generator!");
                    exit = true;
                    break;
            }
        }
        
        scanner.close();
    }
    
    /**
     * Display the main menu options
     */
    private static void displayMainMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("MAIN MENU");
        System.out.println("=".repeat(40));
        System.out.println("1. Setup and Generate New Timetable");
        System.out.println("2. Regenerate Timetable");
        System.out.println("3. Export Timetable to File");
        System.out.println("4. Exit");
        System.out.println("=".repeat(40));
    }
    
    /**
     * Setup timetable parameters and generate initial timetable
     */
    private static void setupAndGenerateTimetable() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("TIMETABLE SETUP");
        System.out.println("=".repeat(40));
        
        // Get basic parameters
        int workingDays = getValidIntInput("Enter number of working days per week (1-7): ", 1, 7);
        int periodsPerDay = getValidIntInput("Enter number of periods per day (1-12): ", 1, 12);
        int maxRepetitionsPerDay = getValidIntInput("Enter max repetitions of same subject per day (1-" + periodsPerDay + "): ", 1, periodsPerDay);
        
        // Get subjects
        int numSubjects = getValidIntInput("Enter number of subjects: ", 1, 20);
        ArrayList<Subject> subjects = new ArrayList<>();
        
        System.out.println("\nEnter subject names:");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            String subjectName = scanner.nextLine().trim();
            while (subjectName.isEmpty()) {
                System.out.print("Subject name cannot be empty. Try again: ");
                subjectName = scanner.nextLine().trim();
            }
            subjects.add(new Subject(subjectName));
        }
        
        // Get teachers
        int numTeachers = getValidIntInput("\nEnter number of teachers: ", 1, 50);
        ArrayList<Teacher> teachers = new ArrayList<>();
        
        System.out.println("\nEnter teacher names:");
        for (int i = 0; i < numTeachers; i++) {
            System.out.print("Teacher " + (i + 1) + ": ");
            String teacherName = scanner.nextLine().trim();
            while (teacherName.isEmpty()) {
                System.out.print("Teacher name cannot be empty. Try again: ");
                teacherName = scanner.nextLine().trim();
            }
            teachers.add(new Teacher(teacherName));
        }
        
        // Map subjects to teachers
        mapSubjectsToTeachers(subjects, teachers);
        
        // Create and generate timetable
        timeTable = new TimeTable(workingDays, periodsPerDay, subjects, teachers, maxRepetitionsPerDay);
        timeTable.generateTimetable();
        
        System.out.println("\n✓ Timetable generated successfully!\n");
        timeTable.displayTimetable();
    }
    
    /**
     * Map subjects to teachers
     */
    private static void mapSubjectsToTeachers(ArrayList<Subject> subjects, ArrayList<Teacher> teachers) {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("MAP SUBJECTS TO TEACHERS");
        System.out.println("=".repeat(40));
        
        for (Subject subject : subjects) {
            System.out.println("\nSubject: " + subject.getName());
            System.out.println("Available teachers:");
            for (int i = 0; i < teachers.size(); i++) {
                System.out.println((i + 1) + ". " + teachers.get(i).getName());
            }
            
            int teacherIndex = getValidIntInput("Select teacher (1-" + teachers.size() + "): ", 1, teachers.size()) - 1;
            Teacher selectedTeacher = teachers.get(teacherIndex);
            
            subject.setTeacher(selectedTeacher);
            selectedTeacher.addSubject(subject);
            
            System.out.println("✓ " + subject.getName() + " assigned to " + selectedTeacher.getName());
        }
    }
    
    /**
     * Regenerate the existing timetable
     */
    private static void regenerateTimetable() {
        if (timeTable == null) {
            System.out.println("\n✗ No timetable exists. Please setup a new timetable first.");
            return;
        }
        
        System.out.println("\nRegenerating timetable...");
        timeTable.generateTimetable();
        System.out.println("✓ Timetable regenerated successfully!\n");
        timeTable.displayTimetable();
    }
    
    /**
     * Export timetable to a text file
     */
    private static void exportTimetable() {
        if (timeTable == null) {
            System.out.println("\n✗ No timetable exists. Please setup a new timetable first.");
            return;
        }
        
        System.out.print("\nEnter filename (without extension): ");
        String filename = scanner.nextLine().trim();
        if (filename.isEmpty()) {
            filename = "timetable";
        }
        
        if (timeTable.exportToFile(filename + ".txt")) {
            System.out.println("✓ Timetable exported successfully to " + filename + ".txt");
        } else {
            System.out.println("✗ Failed to export timetable.");
        }
    }
    
    /**
     * Get valid integer input within a range
     */
    private static int getValidIntInput(String prompt, int min, int max) {
        int value;
        while (true) {
            System.out.print(prompt);
            try {
                value = Integer.parseInt(scanner.nextLine().trim());
                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.println("✗ Please enter a number between " + min + " and " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("✗ Invalid input. Please enter a valid number.");
            }
        }
    }
}
