import java.util.ArrayList;

/**
 * Teacher class - Represents a teacher in the timetable
 * Contains teacher name and list of subjects they teach
 */
public class Teacher {
    private String name;
    private ArrayList<Subject> subjects;
    
    /**
     * Constructor to create a teacher
     * @param name The name of the teacher
     */
    public Teacher(String name) {
        this.name = name;
        this.subjects = new ArrayList<>();
    }
    
    /**
     * Get the teacher name
     * @return Teacher name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set the teacher name
     * @param name New teacher name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get list of subjects taught by this teacher
     * @return ArrayList of subjects
     */
    public ArrayList<Subject> getSubjects() {
        return subjects;
    }
    
    /**
     * Add a subject to teacher's teaching list
     * @param subject Subject to be added
     */
    public void addSubject(Subject subject) {
        if (!subjects.contains(subject)) {
            subjects.add(subject);
        }
    }
    
    /**
     * Remove a subject from teacher's teaching list
     * @param subject Subject to be removed
     */
    public void removeSubject(Subject subject) {
        subjects.remove(subject);
    }
    
    /**
     * Check if teacher teaches a specific subject
     * @param subject Subject to check
     * @return true if teacher teaches the subject
     */
    public boolean teachesSubject(Subject subject) {
        return subjects.contains(subject);
    }
    
    @Override
    public String toString() {
        return name + " (Teaches: " + subjects.size() + " subjects)";
    }
}
