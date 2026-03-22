# Contributing to TimeTable Generator

First off, thank you for considering contributing to TimeTable Generator! 🎉

It's people like you that make TimeTable Generator such a great tool.

## 📋 Table of Contents

- [Code of Conduct](#code-of-conduct)
- [How Can I Contribute?](#how-can-i-contribute)
- [Getting Started](#getting-started)
- [Development Process](#development-process)
- [Style Guidelines](#style-guidelines)
- [Commit Messages](#commit-messages)
- [Pull Request Process](#pull-request-process)

## 📜 Code of Conduct

This project and everyone participating in it is governed by our Code of Conduct. By participating, you are expected to uphold this code.

### Our Standards

- ✅ Be respectful and inclusive
- ✅ Welcome newcomers and help them learn
- ✅ Focus on what is best for the community
- ✅ Show empathy towards other community members
- ❌ No harassment, trolling, or insulting comments
- ❌ No political or religious discussions

## 🤝 How Can I Contribute?

### Reporting Bugs

Before creating bug reports, please check the existing issues to avoid duplicates.

**When reporting a bug, include:**
- Clear and descriptive title
- Steps to reproduce the issue
- Expected behavior
- Actual behavior
- Screenshots (if applicable)
- Browser and OS information
- Any error messages

**Example:**
```
Title: Timetable not generating with 7 working days

Steps to reproduce:
1. Set working days to 7
2. Add 5 subjects
3. Click generate
4. Error appears

Expected: Timetable should generate
Actual: Error message "Cannot generate"
Browser: Chrome 120
OS: Windows 11
```

### Suggesting Features

Feature suggestions are welcome! Please provide:
- Clear description of the feature
- Why it would be useful
- How it should work
- Any examples or mockups

### Code Contributions

1. **Bug Fixes** - Fix existing issues
2. **New Features** - Add new functionality
3. **Documentation** - Improve docs
4. **Tests** - Add test coverage
5. **Performance** - Optimize code
6. **UI/UX** - Improve design

## 🚀 Getting Started

### Prerequisites

- Git
- A modern web browser
- Text editor (VS Code recommended)
- Basic knowledge of HTML, CSS, JavaScript

### Setup Development Environment

1. **Fork the repository**
   ```bash
   # Click the "Fork" button on GitHub
   ```

2. **Clone your fork**
   ```bash
   git clone https://github.com/YOUR_USERNAME/timetable-generator.git
   cd timetable-generator
   ```

3. **Add upstream remote**
   ```bash
   git remote add upstream https://github.com/jenish1345/timetable-generator.git
   ```

4. **Create a branch**
   ```bash
   git checkout -b feature/your-feature-name
   ```

5. **Make your changes**
   - Edit files in `TimeTableWebApp/`
   - Test thoroughly

6. **Test locally**
   ```bash
   cd TimeTableWebApp
   open index.html
   ```

## 💻 Development Process

### Project Structure

```
TimeTableWebApp/
├── index.html          # Main application
├── styles.css          # All styling
├── script.js           # All logic
└── START_HERE.html     # Landing page
```

### Making Changes

1. **Keep changes focused** - One feature/fix per PR
2. **Test thoroughly** - Test on multiple browsers
3. **Update documentation** - Update README if needed
4. **Follow style guide** - Match existing code style
5. **Add comments** - Explain complex logic

### Testing Checklist

Before submitting, test:
- ✅ All browsers (Chrome, Firefox, Safari, Edge)
- ✅ Mobile devices (responsive design)
- ✅ Different screen sizes
- ✅ All features work correctly
- ✅ No console errors
- ✅ Performance is good

## 🎨 Style Guidelines

### HTML

```html
<!-- Use semantic HTML -->
<section class="timetable-section">
    <h2>Generated Timetable</h2>
    <table class="timetable">
        <!-- content -->
    </table>
</section>

<!-- Use meaningful class names -->
<div class="input-item">
    <label>Subject Name:</label>
    <input type="text" id="subject1">
</div>
```

### CSS

```css
/* Use CSS variables for colors */
:root {
    --primary-color: #4a90e2;
}

/* Use meaningful class names */
.timetable-container {
    padding: 20px;
}

/* Group related styles */
.btn {
    padding: 12px 30px;
    border-radius: 8px;
}

/* Add comments for complex styles */
/* Smooth animation for section transitions */
.section {
    animation: fadeIn 0.5s ease-in;
}
```

### JavaScript

```javascript
// Use descriptive variable names
const workingDays = 5;
const periodsPerDay = 6;

// Add comments for complex logic
/**
 * Generate timetable with constraints
 * @param {Array} subjects - List of subjects
 * @param {Array} teachers - List of teachers
 */
function generateTimetable(subjects, teachers) {
    // Implementation
}

// Use const/let instead of var
const subjects = [];
let currentStep = 1;

// Use arrow functions when appropriate
const shuffleArray = (array) => {
    // Implementation
};
```

## 📝 Commit Messages

Follow conventional commits format:

```
type(scope): subject

body (optional)

footer (optional)
```

### Types

- `feat`: New feature
- `fix`: Bug fix
- `docs`: Documentation changes
- `style`: Code style changes (formatting)
- `refactor`: Code refactoring
- `perf`: Performance improvements
- `test`: Adding tests
- `chore`: Maintenance tasks

### Examples

```bash
feat(ui): add dark mode toggle button

fix(algorithm): prevent consecutive subject repetition

docs(readme): update installation instructions

style(css): improve button hover animations

refactor(script): simplify timetable generation logic

perf(render): optimize table rendering performance
```

## 🔄 Pull Request Process

### Before Submitting

1. ✅ Update your branch with latest main
   ```bash
   git fetch upstream
   git rebase upstream/main
   ```

2. ✅ Test all changes thoroughly

3. ✅ Update documentation if needed

4. ✅ Ensure no console errors

5. ✅ Check code style matches project

### Submitting PR

1. **Push your branch**
   ```bash
   git push origin feature/your-feature-name
   ```

2. **Create Pull Request on GitHub**
   - Go to your fork on GitHub
   - Click "New Pull Request"
   - Select your branch
   - Fill in the template

3. **PR Template**
   ```markdown
   ## Description
   Brief description of changes

   ## Type of Change
   - [ ] Bug fix
   - [ ] New feature
   - [ ] Documentation update
   - [ ] Performance improvement

   ## Testing
   - [ ] Tested on Chrome
   - [ ] Tested on Firefox
   - [ ] Tested on Safari
   - [ ] Tested on mobile
   - [ ] No console errors

   ## Screenshots (if applicable)
   Add screenshots here

   ## Checklist
   - [ ] Code follows style guidelines
   - [ ] Self-reviewed code
   - [ ] Commented complex code
   - [ ] Updated documentation
   - [ ] No breaking changes
   ```

4. **Wait for Review**
   - Maintainers will review your PR
   - Address any feedback
   - Make requested changes
   - Be patient and respectful

### After PR is Merged

1. **Delete your branch**
   ```bash
   git branch -d feature/your-feature-name
   git push origin --delete feature/your-feature-name
   ```

2. **Update your fork**
   ```bash
   git checkout main
   git pull upstream main
   git push origin main
   ```

## 🎯 Good First Issues

New to the project? Look for issues labeled:
- `good first issue` - Easy issues for beginners
- `help wanted` - Issues that need help
- `documentation` - Documentation improvements

## 💡 Feature Requests

Have an idea? Create an issue with:
- Clear title
- Detailed description
- Use cases
- Benefits
- Possible implementation

## 🐛 Bug Reports

Found a bug? Create an issue with:
- Descriptive title
- Steps to reproduce
- Expected vs actual behavior
- Screenshots
- Browser/OS info
- Error messages

## 📚 Resources

- [HTML MDN Docs](https://developer.mozilla.org/en-US/docs/Web/HTML)
- [CSS MDN Docs](https://developer.mozilla.org/en-US/docs/Web/CSS)
- [JavaScript MDN Docs](https://developer.mozilla.org/en-US/docs/Web/JavaScript)
- [Git Documentation](https://git-scm.com/doc)

## 🙏 Thank You!

Your contributions make this project better for everyone. Thank you for taking the time to contribute!

---

**Questions?** Feel free to ask in [GitHub Discussions](https://github.com/jenish1345/timetable-generator/discussions)

**Need Help?** Check out our [README](README.md) or open an issue

---

<div align="center">

**Happy Contributing! 🎉**

Made with ❤️ by the TimeTable Generator community

</div>
