# Quick Start Guide

## Compile and Run (One-liner)

```bash
cd TimeTableGenerator/src && javac *.java && java Main
```

## Or use the provided scripts:

```bash
# Compile
./TimeTableGenerator/compile.sh

# Run
./TimeTableGenerator/run.sh
```

## Sample Input for Quick Testing

Here's a sample input sequence you can use to quickly test the program:

```
Choice: 1
Working days: 5
Periods per day: 6
Max repetitions per day: 2
Number of subjects: 4

Subject names:
- Mathematics
- Science
- English
- History

Number of teachers: 3

Teacher names:
- Mr. Smith
- Ms. Johnson
- Dr. Brown

Subject-Teacher Mapping:
- Mathematics → Teacher 1 (Mr. Smith)
- Science → Teacher 2 (Ms. Johnson)
- English → Teacher 3 (Dr. Brown)
- History → Teacher 1 (Mr. Smith)
```

The timetable will be generated and displayed automatically!

## Menu Options

1. **Setup and Generate New Timetable** - Create a new timetable from scratch
2. **Regenerate Timetable** - Generate a new random arrangement with same parameters
3. **Export Timetable to File** - Save timetable to a text file
4. **Exit** - Close the application

## Tips

- For a standard school week, use 5 working days
- Typical periods per day: 6-8
- Max repetitions of 2 per day works well for most cases
- The program automatically adds a break period in the middle of the day
- You can regenerate as many times as you want to get different arrangements
- Export feature creates a nicely formatted text file you can print or share
