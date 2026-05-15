# ValuEnable QA Automation Assignment

## Task 1: Manual Testing

The project includes manual testing artifacts and supporting documents inside the `test-data` folder.

### Included Files
- `JobListings.xlsx` → Contains all identified job listings and additional details.
- `TestCases.xlsx` → Contains executed manual test cases with Pass/Fail status.

---

## Scope Covered

The manual testing assignment covers:

- Careers page validation
- Job listing verification
- Apply link verification
- Responsive testing (tablet/mobile view)
- UI and usability validation

---

## Observations Identified

- The provided `career.html` URL returned a 404 page.
- The working careers page was available under `/careers`.
- Apply links redirected to a Google Form with restricted access.
- Tablet view showed text alignment and layout issues.

---

## Folder Structure

```bash
test-data/
├── JobListings.xlsx
└── TestCases.xlsx
```

---

# Task 2: Test Automation

A scalable and maintainable Java-based Test Automation Framework developed for the ValuEnable QA Assignment using Selenium WebDriver, TestNG, and Maven following the Page Object Model (POM) design pattern.

The framework automates the following workflow:

Open “Get in Touch” form
Submit the form successfully
Validate error handling for invalid email input

The project is designed using reusable components and automation best practices.

🚀 Project Overview

This framework includes:

Selenium WebDriver automation
TestNG execution
Page Object Model (POM)
Explicit waits
Reusable utility methods
Maven build management
Assertion validations
Clean and maintainable structure
👨‍💻 About Me

Hi, My name is Umesh Kute.

I have experience in:

Automation Testing using Selenium WebDriver
API Testing using Postman
Java Programming
TestNG Framework Design
Manual Testing
🔗 Author
GitHub: https://github.com/qa-Umesh
LinkedIn: https://www.linkedin.com/in/-umesh-
Email: umeshkute453@gmail.com
🛠️ Tech Stack
Technology	Usage
Java	Programming Language
Selenium WebDriver	UI Automation
TestNG	Test Framework
Maven	Build Tool
📁 Framework Structure
src
 ├── test/java
 │    ├── com.valuenable.pages
 │    ├── com.valuenable.tests
 │    ├── com.valuenable.utils
 │    ├── com.valuenable.constants
 │    └── com.valuenable.enums
 │
 ├── Screenshots
 └── test-data
✅ Features
Page Object Model (POM) architecture
Modular and reusable framework
Explicit waits implementation
Assertion validations
Clean and maintainable code structure
Separate positive and negative test scenarios
⚙️ Prerequisites

Before running the project, ensure the following tools are installed:

Java 11 or above
Maven
Git
Google Chrome Browser
📥 Installation & Setup
Step 1: Clone Repository
git clone https://github.com/qa-Umesh/ValuEnable_Assignment.git
Step 2: Navigate to Project Folder
cd ValuEnable_Assignment
▶️ Execute Automation Tests

Run the following command to execute the automation suite:

mvn clean test

OR execute testng.xml directly from the IDE.

📊 Console Output

The framework prints execution status in the console.

Example:
Tests run: 2
Failures: 0
BUILD SUCCESS
📸 Screenshots

Execution screenshots and console output screenshots are included in the submission.

🌐 GitHub Repository

Repository Link:

👉 https://github.com/qa-Umesh/ValuEnable_Assignment

📌 Assignment Coverage
Automated Scenarios Covered

✅ Successful form submission
✅ Invalid email validation test

📌 Notes
This framework was developed specifically for the ValuEnable QA Assignment.
The framework focuses on readability, maintainability, and automation best practices.
Manual testing observations were documented based on the current website behavior.
The provided assignment URLs differed from the current website structure and findings were documented accordingly.
