# 📅 TimeTable Generator

<div align="center">

![TimeTable Generator](https://img.shields.io/badge/TimeTable-Generator-blue?style=for-the-badge)
![Version](https://img.shields.io/badge/version-1.0.0-green?style=for-the-badge)
![License](https://img.shields.io/badge/license-MIT-orange?style=for-the-badge)
![Status](https://img.shields.io/badge/status-active-success?style=for-the-badge)

**A beautiful, interactive web application for generating school/college timetables with smart scheduling algorithms**

[🚀 Live Demo](https://jenish1345.github.io/timetable-generator/) | [📖 Documentation](#-documentation) | [🐛 Report Bug](https://github.com/jenish1345/timetable-generator/issues) | [✨ Request Feature](https://github.com/jenish1345/timetable-generator/issues)

<img src="https://raw.githubusercontent.com/jenish1345/timetable-generator/main/.github/preview.gif" alt="TimeTable Generator Demo" width="800"/>

*Generate professional timetables in seconds with our intelligent scheduling system*

</div>

---

## 📋 Table of Contents

- [Features](#-features)
- [Quick Start](#-quick-start)
- [How to Use](#-how-to-use)
- [Use Cases](#-use-cases)
- [Technology Stack](#-technology-stack)
- [Screenshots](#-screenshots)
- [Project Structure](#-project-structure)
- [Configuration Options](#-configuration-options)
- [Algorithm Details](#-algorithm-details)
- [Browser Support](#-browser-support)
- [Installation Guide](#-installation-guide)
- [Contributing](#-contributing)
- [Roadmap](#️-roadmap)
- [FAQ](#-faq)
- [License](#-license)
- [Author](#-author)
- [Support](#-support)

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

### Responsive Features
- ✅ Touch-friendly interface for mobile devices
- ✅ Adaptive layouts for different screen sizes
- ✅ Optimized font sizes and spacing
- ✅ Mobile-first design approach
- ✅ Swipe gestures support (coming soon)

---

## 💾 Installation Guide

### Prerequisites
- A modern web browser (Chrome, Firefox, Safari, Edge)
- Git (for cloning the repository)
- No additional software required!

### Local Installation

#### Method 1: Direct Download
1. Download the ZIP file from [GitHub](https://github.com/jenish1345/timetable-generator/archive/refs/heads/main.zip)
2. Extract the ZIP file
3. Navigate to `TimeTableWebApp` folder
4. Double-click `index.html` or `START_HERE.html`

#### Method 2: Git Clone
```bash
# Clone the repository
git clone https://github.com/jenish1345/timetable-generator.git

# Navigate to the project
cd timetable-generator

# Open the web app
cd TimeTableWebApp
open index.html  # macOS
start index.html # Windows
xdg-open index.html # Linux
```

#### Method 3: Using a Local Server
```bash
# Using Python 3
cd TimeTableWebApp
python3 -m http.server 8000

# Using Node.js (with http-server)
npx http-server TimeTableWebApp -p 8000

# Using PHP
cd TimeTableWebApp
php -S localhost:8000

# Then open: http://localhost:8000
```

---

## 🎯 Key Highlights

<div align="center">

| Feature | Description | Status |
|---------|-------------|--------|
| 🎨 Modern UI | Beautiful gradient design with animations | ✅ Live |
| 🧠 Smart Algorithm | Constraint-based scheduling | ✅ Live |
| 📱 Responsive | Works on all devices | ✅ Live |
| 🔄 Regenerate | Instant new layouts | ✅ Live |
| 📄 Export | PDF & Print support | ✅ Live |
| 🌙 Dark Mode | Coming soon | 🔜 Planned |
| 💾 Save/Load | Coming soon | 🔜 Planned |
| 🌍 Multi-language | Coming soon | 🔜 Planned |

</div>

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

### Version 1.1 (Planned - Q2 2026)
- [ ] Multiple class sections support
- [ ] Room/venue allocation
- [ ] Teacher availability windows
- [ ] Subject prerequisites
- [ ] Dark mode theme
- [ ] Conflict detection and resolution
- [ ] Custom color themes

### Version 2.0 (Future - Q4 2026)
- [ ] Save/load timetables to local storage
- [ ] User accounts and authentication
- [ ] Cloud sync across devices
- [ ] Excel/CSV export
- [ ] Email sharing functionality
- [ ] Mobile app version (iOS & Android)
- [ ] Multi-language support
- [ ] Advanced analytics and reports

### Version 3.0 (Vision - 2027)
- [ ] AI-powered optimization
- [ ] Collaborative editing
- [ ] Integration with school management systems
- [ ] Automated conflict resolution
- [ ] Resource allocation (labs, equipment)
- [ ] Student preference consideration

---

## ❓ FAQ

<details>
<summary><b>Is this free to use?</b></summary>
<br>
Yes! This project is completely free and open-source under the MIT License. You can use it for personal or commercial purposes.
</details>

<details>
<summary><b>Do I need to install anything?</b></summary>
<br>
No installation required! Just open the website in your browser and start using it. For offline use, you can download the files and run them locally.
</details>

<details>
<summary><b>Can I use this for multiple classes?</b></summary>
<br>
Currently, the app generates one timetable at a time. Multi-class support is planned for version 1.1. You can generate separate timetables for each class.
</details>

<details>
<summary><b>How does the algorithm work?</b></summary>
<br>
The algorithm uses constraint-based scheduling with random distribution. It ensures no consecutive repetitions, even distribution, and respects maximum repetitions per day. See the <a href="#-algorithm-details">Algorithm Details</a> section for more info.
</details>

<details>
<summary><b>Can I save my timetable?</b></summary>
<br>
Currently, you can export to PDF or print. Save/load functionality is planned for version 2.0. For now, you can bookmark or save the PDF.
</details>

<details>
<summary><b>Is my data stored anywhere?</b></summary>
<br>
No! All data stays in your browser. Nothing is sent to any server. Your privacy is 100% protected.
</details>

<details>
<summary><b>Can I contribute to this project?</b></summary>
<br>
Absolutely! Contributions are welcome. Check the <a href="#-contributing">Contributing</a> section for guidelines.
</details>

<details>
<summary><b>Does it work offline?</b></summary>
<br>
Yes! After the first load, the app works offline (except for Font Awesome icons which need internet).
</details>

---

## 🎓 Educational Value

This project is perfect for:
- **Students** learning web development
- **Teachers** understanding scheduling algorithms
- **Developers** exploring constraint-based programming
- **Schools** implementing custom scheduling solutions

### Learning Outcomes
- HTML5 semantic markup
- CSS3 animations and transitions
- Vanilla JavaScript (no frameworks)
- Algorithm design and optimization
- Responsive web design
- User experience (UX) principles

---

## 🔒 Security & Privacy

- ✅ **No Data Collection** - We don't collect any personal information
- ✅ **No Tracking** - No analytics or tracking scripts
- ✅ **No Cookies** - We don't use cookies
- ✅ **Client-Side Only** - Everything runs in your browser
- ✅ **Open Source** - Code is transparent and auditable
- ✅ **No Registration** - Use without creating an account

---

## 🌍 Browser Compatibility

Tested and verified on:

| Browser | Desktop | Mobile | Tablet |
|---------|---------|--------|--------|
| Chrome | ✅ 90+ | ✅ 90+ | ✅ 90+ |
| Firefox | ✅ 88+ | ✅ 88+ | ✅ 88+ |
| Safari | ✅ 14+ | ✅ 14+ | ✅ 14+ |
| Edge | ✅ 90+ | ✅ 90+ | ✅ 90+ |
| Opera | ✅ 76+ | ✅ 76+ | ✅ 76+ |

---

## 🚀 Performance

- ⚡ **Fast Loading** - Less than 1 second load time
- 🎯 **Lightweight** - Total size under 100KB
- 🔄 **Instant Generation** - Timetables generated in milliseconds
- 📱 **Mobile Optimized** - Smooth performance on all devices
- 💾 **Low Memory** - Minimal resource usage

---

## 🎨 Customization

Want to customize the look and feel?

### Change Colors
Edit `styles.css` and modify the CSS variables:
```css
:root {
    --primary-color: #4a90e2;  /* Change to your color */
    --secondary-color: #6c757d;
    --success-color: #28a745;
}
```

### Change Days
Edit `script.js` and modify the DAYS array:
```javascript
const DAYS = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'];
```

### Add Your Logo
Add your logo image and update `index.html`:
```html
<img src="your-logo.png" alt="Your School Logo">
```

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

Need help? We're here for you!

### 💬 Get Help
- 🐛 **Bug Reports**: [GitHub Issues](https://github.com/jenish1345/timetable-generator/issues)
- 💡 **Feature Requests**: [GitHub Issues](https://github.com/jenish1345/timetable-generator/issues)
- 💬 **Discussions**: [GitHub Discussions](https://github.com/jenish1345/timetable-generator/discussions)
- ⭐ **Star the project** if you find it helpful!

### 📚 Resources
- [Complete User Guide](TimeTableWebApp/COMPLETE_GUIDE.md)
- [Feature Showcase](TimeTableWebApp/FEATURES_SHOWCASE.md)
- [Visual Guide](TimeTableWebApp/VISUAL_GUIDE.txt)

### 🤝 Community
Join our growing community of users and contributors!
- Share your timetables
- Suggest improvements
- Help others
- Report bugs

---

## 🏆 Achievements

<div align="center">

![GitHub stars](https://img.shields.io/github/stars/jenish1345/timetable-generator?style=social)
![GitHub forks](https://img.shields.io/github/forks/jenish1345/timetable-generator?style=social)
![GitHub watchers](https://img.shields.io/github/watchers/jenish1345/timetable-generator?style=social)

</div>

---

## 💖 Support the Project

If you find this project useful, consider:

- ⭐ **Starring** the repository
- 🐛 **Reporting** bugs and issues
- 💡 **Suggesting** new features
- 🔀 **Contributing** code improvements
- 📢 **Sharing** with others
- 📝 **Writing** about it

---

## 📜 Changelog

### Version 1.0.0 (Current)
- ✅ Initial release
- ✅ Basic timetable generation
- ✅ Interactive UI with animations
- ✅ Progress indicator
- ✅ Export to PDF
- ✅ Print functionality
- ✅ Responsive design
- ✅ Smart scheduling algorithm

---

## 🔗 Related Projects

Looking for more educational tools?
- [Exam Scheduler](https://github.com/jenish1345) - Coming soon
- [Attendance Tracker](https://github.com/jenish1345) - Coming soon
- [Grade Calculator](https://github.com/jenish1345) - Coming soon

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
