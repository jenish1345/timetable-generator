# TimeTable Generator

A comprehensive Java-based timetable generation system with intelligent scheduling and constraint management.

## Features

✓ Menu-driven, user-friendly console interface
✓ Configurable working days, periods, and subjects
✓ Subject-to-teacher mapping
✓ Intelligent random timetable generation with constraints:
  - Maximum repetitions per day (configurable)
  - No consecutive repetition of same subject
  - Even distribution of subjects across the week
  - Automatic break/lunch period insertion
✓ Clean tabular display format
✓ Timetable regeneration option
✓ Export timetable to text file
✓ Full input validation
✓ Object-oriented design with modular classes

## Project Structure

```
TimeTableGenerator/
├── src/
│   ├── Main.java          - Entry point and menu system
│   ├── Subject.java       - Subject entity class
│   ├── Teacher.java       - Teacher entity class
│   └── TimeTable.java     - Core timetable generation logic
└── README.md              - This file
```

## Requirements

- Java Development Kit (JDK) 8 or higher
- No external dependencies required

## Compilation

Navigate to the project directory and compile all Java files:

```bash
cd TimeTableGenerator/src
javac *.java
```

## Running the Program

After compilation, run the main class:

```bash
java Main
```

## Usage Guide

### 1. Setup and Generate New Timetable

- Enter number of working days (1-7)
- Enter number of periods per day (1-12)
- Set maximum repetitions of same subject per day
- Enter number of subjects and their names
- Enter number of teachers and their names
- Map each subject to a teacher
- Timetable is automatically generated and displayed

### 2. Regenerate Timetable

- Regenerates the timetable with same parameters but different random arrangement
- Useful if you want a different schedule layout

### 3. Export Timetable

- Saves the current timetable to a text file
- Enter desired filename (without extension)
- File is saved in the current directory

### 4. Exit

- Closes the application

## Example Session

```
Enter number of working days per week (1-7): 5
Enter number of periods per day (1-12): 6
Enter max repetitions of same subject per day (1-6): 2
Enter number of subjects: 4

Enter subject names:
Subject 1: Mathematics
Subject 2: Science
Subject 3: English
Subject 4: History

Enter number of teachers: 3

Enter teacher names:
Teacher 1: Mr. Smith
Teacher 2: Ms. Johnson
Teacher 3: Dr. Brown

[Map subjects to teachers...]

✓ Timetable generated successfully!
```

## Key Features Explained

### Constraint Management

1. **Maximum Repetitions**: Prevents any subject from appearing more than the specified number of times per day
2. **No Consecutive Repetition**: Ensures the same subject doesn't appear in consecutive periods
3. **Even Distribution**: Distributes subjects evenly across the week based on total available slots
4. **Automatic Breaks**: Inserts a break period at the middle of the day (when periods > 4)

### Object-Oriented Design

- **Main**: Handles user interface and menu navigation
- **Subject**: Encapsulates subject data and teacher assignment
- **Teacher**: Manages teacher information and subject associations
- **TimeTable**: Core logic for generation, display, and export

### Input Validation

- Range validation for numeric inputs
- Empty string prevention for names
- Exception handling for invalid data types
- User-friendly error messages

## Extending the Project

The modular design allows easy extensions:

- Add multiple class support
- Implement teacher availability constraints
- Add room/venue management
- Create GUI interface
- Add database persistence
- Implement more complex scheduling algorithms

## Technical Details

- Uses `Random` class for randomization
- `ArrayList` for dynamic collections
- 2D array for timetable storage
- File I/O for export functionality
- Proper encapsulation and OOP principles

## License

Free to use for educational purposes.
