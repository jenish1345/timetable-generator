// Global variables
let config = {
    workingDays: 5,
    periodsPerDay: 6,
    maxRepetitions: 2,
    addBreak: true
};

let subjects = [];
let teachers = [];
let timetable = [];

const DAYS = ['Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday', 'Sunday'];

// Navigation functions
function showSection(sectionId) {
    document.querySelectorAll('.section').forEach(section => {
        section.classList.remove('active');
    });
    document.getElementById(sectionId).classList.add('active');
}

function goBack(sectionId) {
    showSection(sectionId);
}

// Step 1: Proceed to subjects
function proceedToSubjects() {
    // Get configuration values
    config.workingDays = parseInt(document.getElementById('workingDays').value);
    config.periodsPerDay = parseInt(document.getElementById('periodsPerDay').value);
    config.maxRepetitions = parseInt(document.getElementById('maxRepetitions').value);
    config.addBreak = document.getElementById('addBreak').checked;
    
    const numSubjects = parseInt(document.getElementById('numSubjects').value);
    
    // Validate inputs
    if (!config.workingDays || !config.periodsPerDay || !config.maxRepetitions || !numSubjects) {
        alert('Please fill in all fields!');
        return;
    }
    
    if (config.maxRepetitions > config.periodsPerDay) {
        alert('Max repetitions cannot exceed periods per day!');
        return;
    }
    
    // Generate subject input fields
    const container = document.getElementById('subjectsContainer');
    container.innerHTML = '';
    
    for (let i = 0; i < numSubjects; i++) {
        const div = document.createElement('div');
        div.className = 'input-item';
        div.innerHTML = `
            <label>Subject ${i + 1}:</label>
            <input type="text" id="subject${i}" placeholder="Enter subject name" required>
        `;
        container.appendChild(div);
    }
    
    showSection('subjectsSection');
}

// Step 2: Proceed to teachers
function proceedToTeachers() {
    const numSubjects = parseInt(document.getElementById('numSubjects').value);
    subjects = [];
    
    // Collect subject names
    for (let i = 0; i < numSubjects; i++) {
        const subjectName = document.getElementById(`subject${i}`).value.trim();
        if (!subjectName) {
            alert(`Please enter name for Subject ${i + 1}`);
            return;
        }
        subjects.push({
            name: subjectName,
            teacher: null
        });
    }
    
    // Generate teacher input fields
    const numTeachers = parseInt(document.getElementById('numTeachers').value);
    const container = document.getElementById('teachersContainer');
    container.innerHTML = '';
    
    for (let i = 0; i < numTeachers; i++) {
        const div = document.createElement('div');
        div.className = 'input-item';
        div.innerHTML = `
            <label>Teacher ${i + 1}:</label>
            <input type="text" id="teacher${i}" placeholder="Enter teacher name" required>
        `;
        container.appendChild(div);
    }
    
    showSection('teachersSection');
}

// Step 3: Proceed to mapping
function proceedToMapping() {
    const numTeachers = parseInt(document.getElementById('numTeachers').value);
    teachers = [];
    
    // Collect teacher names
    for (let i = 0; i < numTeachers; i++) {
        const teacherName = document.getElementById(`teacher${i}`).value.trim();
        if (!teacherName) {
            alert(`Please enter name for Teacher ${i + 1}`);
            return;
        }
        teachers.push({
            name: teacherName,
            subjects: []
        });
    }
    
    // Generate mapping interface
    const container = document.getElementById('mappingContainer');
    container.innerHTML = '';
    
    subjects.forEach((subject, index) => {
        const div = document.createElement('div');
        div.className = 'mapping-item';
        
        let optionsHTML = '<option value="">-- Select Teacher --</option>';
        teachers.forEach((teacher, tIndex) => {
            optionsHTML += `<option value="${tIndex}">${teacher.name}</option>`;
        });
        
        div.innerHTML = `
            <h3><i class="fas fa-book"></i> ${subject.name}</h3>
            <select id="mapping${index}" required>
                ${optionsHTML}
            </select>
        `;
        container.appendChild(div);
    });
    
    showSection('mappingSection');
}

// Step 4: Generate timetable
function generateTimetable() {
    // Collect mappings
    for (let i = 0; i < subjects.length; i++) {
        const teacherIndex = document.getElementById(`mapping${i}`).value;
        if (teacherIndex === '') {
            alert(`Please assign a teacher to ${subjects[i].name}`);
            return;
        }
        subjects[i].teacher = teachers[teacherIndex];
        teachers[teacherIndex].subjects.push(subjects[i]);
    }
    
    // Generate the timetable
    generateTimetableLogic();
    
    // Display the timetable
    displayTimetable();
    
    showSection('timetableSection');
}

// Core timetable generation logic
function generateTimetableLogic() {
    timetable = [];
    
    // Initialize empty timetable
    for (let day = 0; day < config.workingDays; day++) {
        timetable[day] = [];
        for (let period = 0; period < config.periodsPerDay; period++) {
            timetable[day][period] = null;
        }
    }
    
    // Calculate distribution
    const totalSlots = config.workingDays * config.periodsPerDay;
    const breakPeriod = config.addBreak && config.periodsPerDay > 4 ? Math.floor(config.periodsPerDay / 2) : -1;
    const availableSlots = breakPeriod >= 0 ? totalSlots - config.workingDays : totalSlots;
    
    const slotsPerSubject = Math.floor(availableSlots / subjects.length);
    const extraSlots = availableSlots % subjects.length;
    
    // Create subject pool
    let subjectPool = [];
    subjects.forEach((subject, index) => {
        const slots = slotsPerSubject + (index < extraSlots ? 1 : 0);
        for (let i = 0; i < slots; i++) {
            subjectPool.push(subject);
        }
    });
    
    // Shuffle the pool
    subjectPool = shuffleArray(subjectPool);
    
    // Fill timetable with constraints
    let poolIndex = 0;
    for (let day = 0; day < config.workingDays; day++) {
        let dayCount = {};
        
        for (let period = 0; period < config.periodsPerDay; period++) {
            // Add break period
            if (period === breakPeriod) {
                timetable[day][period] = { name: 'BREAK', teacher: null, isBreak: true };
                continue;
            }
            
            // Find suitable subject
            let selectedSubject = null;
            let attempts = 0;
            const maxAttempts = subjectPool.length;
            
            while (attempts < maxAttempts && poolIndex < subjectPool.length) {
                const candidate = subjectPool[poolIndex];
                const currentCount = dayCount[candidate.name] || 0;
                const previousSubject = period > 0 ? timetable[day][period - 1] : null;
                const isConsecutive = previousSubject && !previousSubject.isBreak && previousSubject.name === candidate.name;
                
                if (currentCount < config.maxRepetitions && !isConsecutive) {
                    selectedSubject = candidate;
                    poolIndex++;
                    break;
                }
                
                poolIndex++;
                attempts++;
            }
            
            // Assign subject
            if (selectedSubject) {
                timetable[day][period] = selectedSubject;
                dayCount[selectedSubject.name] = (dayCount[selectedSubject.name] || 0) + 1;
            }
        }
    }
}

// Display timetable
function displayTimetable() {
    const container = document.getElementById('timetableDisplay');
    
    let html = '<table class="timetable">';
    
    // Header row
    html += '<thead><tr><th>Period</th>';
    for (let day = 0; day < config.workingDays; day++) {
        html += `<th>${DAYS[day]}</th>`;
    }
    html += '</tr></thead><tbody>';
    
    // Period rows
    for (let period = 0; period < config.periodsPerDay; period++) {
        html += `<tr><td class="period-header">Period ${period + 1}</td>`;
        
        for (let day = 0; day < config.workingDays; day++) {
            const slot = timetable[day][period];
            
            if (slot && slot.isBreak) {
                html += '<td class="break-cell"><i class="fas fa-coffee"></i> BREAK</td>';
            } else if (slot) {
                html += `<td>
                    <div class="subject-cell">${slot.name}</div>
                    <div class="teacher-name">${slot.teacher.name}</div>
                </td>`;
            } else {
                html += '<td>-</td>';
            }
        }
        
        html += '</tr>';
    }
    
    html += '</tbody></table>';
    container.innerHTML = html;
    
    // Display teacher assignments
    displayTeacherAssignments();
}

// Display teacher assignments
function displayTeacherAssignments() {
    const container = document.getElementById('teacherAssignments');
    
    let html = '<h3><i class="fas fa-users"></i> Teacher Assignments</h3>';
    html += '<div class="teacher-list">';
    
    teachers.forEach(teacher => {
        html += `<div class="teacher-card">
            <h4><i class="fas fa-chalkboard-teacher"></i> ${teacher.name}</h4>
            <ul>`;
        
        teacher.subjects.forEach(subject => {
            html += `<li>${subject.name}</li>`;
        });
        
        html += '</ul></div>';
    });
    
    html += '</div>';
    container.innerHTML = html;
}

// Regenerate timetable
function regenerateTimetable() {
    generateTimetableLogic();
    displayTimetable();
}

// Export to PDF (print functionality)
function exportToPDF() {
    window.print();
}

// Print timetable
function printTimetable() {
    window.print();
}

// Start over
function startOver() {
    if (confirm('Are you sure you want to start over? All data will be lost.')) {
        subjects = [];
        teachers = [];
        timetable = [];
        showSection('setupSection');
    }
}

// Utility function to shuffle array
function shuffleArray(array) {
    const newArray = [...array];
    for (let i = newArray.length - 1; i > 0; i--) {
        const j = Math.floor(Math.random() * (i + 1));
        [newArray[i], newArray[j]] = [newArray[j], newArray[i]];
    }
    return newArray;
}

// Initialize on page load
document.addEventListener('DOMContentLoaded', function() {
    showSection('setupSection');
});
