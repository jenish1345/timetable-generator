# TimeTable Generator - Web Application

A beautiful, modern, and fully functional web-based timetable generator with an intuitive user interface.

## 🌟 Features

✅ **Modern UI/UX Design**
- Beautiful gradient design
- Responsive layout (works on mobile, tablet, desktop)
- Smooth animations and transitions
- Icon-based navigation
- Professional color scheme

✅ **Complete Functionality**
- Step-by-step wizard interface
- Configurable working days (1-7)
- Configurable periods per day (1-12)
- Maximum repetitions per day setting
- Subject and teacher management
- Subject-to-teacher mapping
- Intelligent timetable generation

✅ **Smart Scheduling**
- No consecutive repetition of same subject
- Even distribution across the week
- Configurable max repetitions per day
- Automatic break period insertion
- Random generation with constraints

✅ **Export & Print**
- Print-friendly layout
- PDF export capability
- Clean printable format

✅ **User-Friendly**
- Input validation
- Clear error messages
- Back navigation
- Regenerate option
- Start over functionality

## 🚀 How to Use

### Option 1: Direct Open (Recommended)
Simply double-click `index.html` to open in your browser!

### Option 2: Local Server
```bash
# Using Python 3
cd TimeTableWebApp
python3 -m http.server 8000

# Then open: http://localhost:8000
```

### Option 3: Live Server (VS Code)
1. Install "Live Server" extension in VS Code
2. Right-click on `index.html`
3. Select "Open with Live Server"

## 📖 User Guide

### Step 1: Setup Configuration
1. Enter number of working days (1-7)
2. Enter number of periods per day (1-12)
3. Set max repetitions per day
4. Enter number of subjects
5. Enter number of teachers
6. Check/uncheck "Add Break Period"
7. Click "Next: Add Subjects"

### Step 2: Add Subjects
1. Enter names for all subjects
2. Click "Next: Add Teachers"

### Step 3: Add Teachers
1. Enter names for all teachers
2. Click "Next: Map Subjects"

### Step 4: Map Subjects to Teachers
1. Select a teacher for each subject from dropdown
2. Click "Generate Timetable"

### Step 5: View & Manage Timetable
- View the generated timetable
- See teacher assignments
- Click "Regenerate" for different arrangement
- Click "Print" or "Export PDF" to save
- Click "Start Over" to create new timetable

## 🎨 Features Breakdown

### Visual Design
- Gradient purple header
- Card-based layout
- Hover effects on table cells
- Color-coded buttons
- Font Awesome icons
- Responsive grid system

### Functionality
- **No External Dependencies**: Works offline (except Font Awesome CDN)
- **Pure JavaScript**: No frameworks required
- **CSS Grid & Flexbox**: Modern layout techniques
- **Print Optimization**: Special print styles included

### Smart Algorithm
- Shuffles subject pool for randomness
- Checks daily repetition limits
- Prevents consecutive same subjects
- Distributes subjects evenly
- Handles break periods intelligently

## 📱 Responsive Design

The application is fully responsive and works on:
- 📱 Mobile phones (320px+)
- 📱 Tablets (768px+)
- 💻 Laptops (1024px+)
- 🖥️ Desktops (1200px+)

## 🎯 Quick Test

Use these sample values for quick testing:

```
Working Days: 5
Periods per Day: 6
Max Repetitions: 2
Number of Subjects: 4
Number of Teachers: 3

Subjects:
1. Mathematics
2. Science
3. English
4. History

Teachers:
1. Mr. Smith
2. Ms. Johnson
3. Dr. Brown

Mapping:
- Mathematics → Mr. Smith
- Science → Ms. Johnson
- English → Dr. Brown
- History → Mr. Smith
```

## 🛠️ Technical Details

### Technologies Used
- **HTML5**: Semantic markup
- **CSS3**: Modern styling with Grid & Flexbox
- **JavaScript (ES6+)**: Pure vanilla JS
- **Font Awesome 6**: Icon library

### Browser Support
- ✅ Chrome (latest)
- ✅ Firefox (latest)
- ✅ Safari (latest)
- ✅ Edge (latest)
- ✅ Opera (latest)

### File Structure
```
TimeTableWebApp/
├── index.html          # Main HTML file
├── styles.css          # All styling
├── script.js           # All functionality
└── README.md           # This file
```

## 🎨 Customization

### Change Colors
Edit the CSS variables in `styles.css`:
```css
:root {
    --primary-color: #4a90e2;
    --secondary-color: #6c757d;
    --success-color: #28a745;
    /* ... more colors */
}
```

### Change Days
Edit the DAYS array in `script.js`:
```javascript
const DAYS = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'];
```

### Modify Constraints
Adjust the generation logic in `generateTimetableLogic()` function in `script.js`

## 📄 License

Free to use for educational and commercial purposes.

## 🤝 Support

For issues or questions, please refer to the code comments or modify as needed.

## ✨ Future Enhancements

Possible additions:
- Multiple class sections
- Room allocation
- Teacher availability windows
- Subject prerequisites
- Database integration
- User accounts
- Save/load timetables
- Excel export
- Email sharing
- Dark mode

---

**Enjoy creating perfect timetables! 📅✨**
