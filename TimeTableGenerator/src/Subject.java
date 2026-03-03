/**
 * Subject class - Represents a subject in the timetable
 * Contains subject name and assigned teacher
 */
public class Subject {
    private String name;
    private Teacher teacher;
    
    /**
     * Constructor to create a subject
     * @param name The name of the subject
     */
    public Subject(String name) {
        this.name = name;
        this.teacher = null;
    }
    
    /**
     * Get the subject name
     * @return Subject name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Set the subject name
     * @param name New subject name
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * Get the assigned teacher
     * @return Teacher object
     */
    public Teacher getTeacher() {
        return teacher;
    }
    
    /**
     * Assign a teacher to this subject
     * @param teacher Teacher to be assigned
     */
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    /**
     * Get display string with subject and teacher name
     * @return Formatted string
     */
    public String getDisplayString() {
        if (teacher != null) {
            return name + "\n(" + teacher.getName() + ")";
        }
        return name;
    }
    
    @Override
    public String toString() {
        return name + (teacher != null ? " - " + teacher.getName() : "");
    }
}
