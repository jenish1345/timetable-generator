# 📅 TimeTable Generator

<div align="center">

![TimeTable Generator](https://img.shields.io/badge/TimeTable-Generator-blue?style=for-the-badge)
![Version](https://img.shields.io/badge/version-1.0.0-green?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-orange?style=for-the-badge)
![Status](https://img.shields.io/badge/status-active-success?style=for-the-badge)

**A beautiful, interactive web application for generating school/college timetables with smart scheduling algorithms**

[🚀 Live Demo](https://jenish1345.github.io/timetable-generator/) | [📖 Documentation](#documentation) | [🐛 Report Bug](https://github.com/jenish1345/timetable-generator/issues) | [✨ Request Feature](https://github.com/jenish1345/timetable-generator/issues)

![TimeTable Generator Preview](https://via.placeholder.com/800x400/667eea/ffffff?text=TimeTable+Generator+Preview)

</div>

---

## 🌟 Features

### 🎨 Beautiful User Interface
- **Modern Design** - Gradient purple theme with smooth animations
- **Progress Indicator** - Visual step-by-step progress tracking
- **Interactive Notifications** - Real-time feedback for user actions
- **Loading Animations** - Professional loading states
- **Responsive Design** - Works perfectly on mobile, tablet, and desktop

### 🧠 Smart Scheduling
- **No Consecutive Repetitions** - Same subject won't appear back-to-back
- **Even Distribution** - Subjects spread evenly across the week
- **Configurable Constraints** - Set maximum repetitions per day
- **Automatic Breaks** - Intelligent break period insertion
- **Random Generation** - Different layouts each time

### ⚡ User-Friendly
- **Step-by-Step Wizard** - Easy 5-step process
- **Input Validation** - Prevents errors with smart validation
- **Instant Regeneration** - Don't like the layout? Regenerate instantly
- **Export Options** - Print or save as PDF
- **Zero Installation** - Just open and use in your browser

---

## 🚀 Quick Start

### Option 1: Use Online (Recommended)
Simply visit: **[https://jenish1345.github.io/timetable-generator/](https://jenish1345.github.io/timetable-generator/)**

### Option 2: Run Locally
```bash
# Clone the repository
git clone https://github.com/jenish1345/timetable-generator.git

# Navigate to the web app folder
cd timetable-generator/TimeTableWebApp

# Open in browser
open index.html
# or double-click index.html
```

---

## 📖 How to Use

### Step 1: Setup Configuration
Configure your basic parameters:
- **Working Days**: Number of days per week (1-7)
- **Periods per Day**: Number of class periods (1-12)
- **Max Repetitions**: Maximum times a subject can appear per day
- **Number of Subjects**: Total subjects to schedule
- **Number of Teachers**: Total teachers available
- **Add Break**: Enable/disable automatic break period

### Step 2: Add Subjects
Enter names for all your subjects:
- Mathematics
- Science
- English
- History
- etc.

### Step 3: Add Teachers
Enter names for all your teachers:
- Mr. Smith
- Ms. Johnson
- Dr. Brown
- etc.

### Step 4: Map Subjects to Teachers
Assign each subject to a teacher using the dropdown menus.

### Step 5: Generate & View
Click "Generate Timetable" and view your beautiful schedule!

**Additional Actions:**
- 🔄 **Regenerate** - Create a new random arrangement
- 📄 **Export PDF** - Save as PDF file
- 🖨️ **Print** - Print directly
- 🔁 **Start Over** - Create a new timetable from scratch

---

## 🎯 Use Cases

Perfect for:
- 🏫 Schools & Colleges
- 📚 Training Centers
- 👨‍🏫 Teachers & Educators
- 👨‍🎓 Students
- 📅 Course Planners
- 🎓 Educational Institutions
- 📖 Coaching Classes
- 🏢 Workshop Organizers

---

## 💻 Technology Stack

<div align="center">

| Technology | Purpose |
|------------|---------|
| ![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white) | Structure |
| ![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat&logo=css3&logoColor=white) | Styling & Animations |
| ![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=black) | Logic & Interactivity |
| ![Font Awesome](https://img.shields.io/badge/Font_Awesome-339AF0?style=flat&logo=fontawesome&logoColor=white) | Icons |

</div>

**Key Features:**
- ✅ Pure Vanilla JavaScript (No frameworks)
- ✅ CSS Grid & Flexbox for layouts
- ✅ CSS Animations for smooth transitions
- ✅ Responsive design with media queries
- ✅ No backend required
- ✅ Works offline after first load

---

## 🎨 Screenshots

<details>
<summary>Click to view screenshots</summary>

### Welcome Screen
![Welcome Screen](https://via.placeholder.com/600x400/667eea/ffffff?text=Welcome+Screen)

### Setup Configuration
![Setup](https://via.placeholder.com/600x400/667eea/ffffff?text=Setup+Configuration)

### Generated Timetable
![Timetable](https://via.placeholder.com/600x400/667eea/ffffff?text=Generated+Timetable)

### Mobile View
![Mobile](https://via.placeholder.com/300x600/667eea/ffffff?text=Mobile+View)

</details>

---

## 📂 Project Structure

```
timetable-generator/
├── TimeTableWebApp/          # Main web application
│   ├── index.html            # Main application page
│   ├── START_HERE.html       # Welcome/landing page
│   ├── styles.css            # All styling and animations
│   ├── script.js             # Application logic
│   ├── README.md             # Web app documentation
│   ├── COMPLETE_GUIDE.md     # Comprehensive user guide
│   ├── FEATURES_SHOWCASE.md  # Feature descriptions
│   └── VISUAL_GUIDE.txt      # Visual walkthrough
│
├── TimeTableGenerator/       # Java console version (bonus)
│   ├── src/                  # Java source files
│   │   ├── Main.java
│   │   ├── Subject.java
│   │   ├── Teacher.java
│   │   └── TimeTable.java
│   └── README.md             # Java version docs
│
├── README.md                 # This file
├── LICENSE                   # MIT License
└── .gitignore               # Git ignore rules
```

---

## 🔧 Configuration Options

### Basic Settings
| Parameter | Range | Default | Description |
|-----------|-------|---------|-------------|
| Working Days | 1-7 | 5 | Number of days per week |
| Periods per Day | 1-12 | 6 | Number of class periods |
| Max Repetitions | 1-12 | 2 | Max times subject appears per day |
| Subjects | 1-20 | 4 | Total number of subjects |
| Teachers | 1-50 | 3 | Total number of teachers |

### Advanced Features
- ✅ Automatic break period insertion
- ✅ Consecutive repetition prevention
- ✅ Even subject distribution
- ✅ Random generation algorithm
- ✅ Teacher-subject mapping

---

## 🎓 Algorithm Details

### Scheduling Algorithm
The timetable generator uses a smart constraint-based algorithm:

1. **Subject Pool Creation**
   - Calculates even distribution based on total slots
   - Creates a pool of subjects to be scheduled

2. **Constraint Checking**
   - Validates maximum repetitions per day
   - Prevents consecutive same subjects
   - Ensures break period placement

3. **Random Distribution**
   - Shuffles subject pool for randomness
   - Fills timetable while respecting constraints
   - Handles edge cases gracefully

4. **Optimization**
   - Even distribution across the week
   - Fair allocation to all subjects
   - Realistic scheduling patterns

---

## 🌐 Browser Support

| Browser | Version | Status |
|---------|---------|--------|
| Chrome | Latest | ✅ Fully Supported |
| Firefox | Latest | ✅ Fully Supported |
| Safari | Latest | ✅ Fully Supported |
| Edge | Latest | ✅ Fully Supported |
| Opera | Latest | ✅ Fully Supported |

**Requirements:**
- Modern browser with JavaScript enabled
- No plugins or extensions needed
- Works offline after first load

---

## 📱 Responsive Design

The application is fully responsive and works on:
- 📱 Mobile phones (320px+)
- 📱 Tablets (768px+)
- 💻 Laptops (1024px+)
- 🖥️ Desktops (1200px+)

---

## 🤝 Contributing

Contributions are welcome! Here's how you can help:

1. **Fork the Project**
2. **Create your Feature Branch**
   ```bash
   git checkout -b feature/AmazingFeature
   ```
3. **Commit your Changes**
   ```bash
   git commit -m 'Add some AmazingFeature'
   ```
4. **Push to the Branch**
   ```bash
   git push origin feature/AmazingFeature
   ```
5. **Open a Pull Request**

### Contribution Ideas
- 🎨 UI/UX improvements
- 🐛 Bug fixes
- 📝 Documentation updates
- ✨ New features
- 🌍 Translations
- ♿ Accessibility improvements

---

## 🐛 Known Issues

Currently, there are no known issues. If you find a bug, please [report it](https://github.com/jenish1345/timetable-generator/issues).

---

## 🗺️ Roadmap

### Version 1.1 (Planned)
- [ ] Multiple class sections support
- [ ] Room/venue allocation
- [ ] Teacher availability windows
- [ ] Subject prerequisites
- [ ] Dark mode theme

### Version 2.0 (Future)
- [ ] Save/load timetables
- [ ] User accounts
- [ ] Cloud sync
- [ ] Excel export
- [ ] Email sharing
- [ ] Mobile app version

---

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2026 Antony Jenish

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

---

## 👨‍💻 Author

**Antony Jenish**
- GitHub: [@jenish1345](https://github.com/jenish1345)
- Project: [TimeTable Generator](https://github.com/jenish1345/timetable-generator)

---

## 🙏 Acknowledgments

- Font Awesome for the beautiful icons
- Inspiration from various scheduling systems
- The open-source community

---

## 📞 Support

If you have any questions or need help:

- 🐛 Issues: [GitHub Issues](https://github.com/jenish1345/timetable-generator/issues)
- 💬 Discussions: [GitHub Discussions](https://github.com/jenish1345/timetable-generator/discussions)
- ⭐ Star the project if you find it helpful!

---

## ⭐ Show Your Support

If you found this project helpful, please give it a ⭐ on GitHub!

[![Star on GitHub](https://img.shields.io/github/stars/jenish1345/timetable-generator?style=social)](https://github.com/jenish1345/timetable-generator)

---

## 📊 Project Stats

![GitHub repo size](https://img.shields.io/github/repo-size/jenish1345/timetable-generator)
![GitHub code size](https://img.shields.io/github/languages/code-size/jenish1345/timetable-generator)
![GitHub last commit](https://img.shields.io/github/last-commit/jenish1345/timetable-generator)
![GitHub issues](https://img.shields.io/github/issues/jenish1345/timetable-generator)
![GitHub pull requests](https://img.shields.io/github/issues-pr/jenish1345/timetable-generator)

---

<div align="center">

**Made with ❤️ by Antony Jenish**

**[⬆ Back to Top](#-timetable-generator)**

</div>
