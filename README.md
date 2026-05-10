# AdNabu QA Automation Assignment

A scalable and maintainable **Java-based Test Automation Framework** developed for the **AdNabu QA Engineer Assignment** using **Selenium WebDriver**, **TestNG**, and **Maven** following the **Page Object Model (POM)** design pattern.

The framework automates the following e-commerce workflow:

- Search for a product
- Add product to cart successfully

The project is designed with reusable components, utility classes, reporting, logging, screenshots, and GitHub Actions integration following automation testing best practices.

---

# 🚀 Project Overview

This framework includes:

- Selenium WebDriver automation
- TestNG test execution
- Page Object Model (POM)
- Explicit waits (No hardcoded sleeps)
- Reusable utility methods
- Extent Reports integration
- Screenshot capture on failures
- Log4j logging
- Maven build management
- GitHub Actions CI integration

---

# 👨‍💻 About Me

Hi, My name is **Umesh Kute**.

I have experience in:
- Automation Testing using Selenium WebDriver
- API Testing using Postman
- Java Programming
- TestNG Framework Design

---

# 🔗 Author

- GitHub: https://github.com/qa-Umesh
- LinkedIn: https://www.linkedin.com/in/-umesh-
- Email: umeshkute453@gmail.com

---

# 🛠️ Tech Stack

| Technology | Usage |
|---|---|
| Java | Programming Language |
| Selenium WebDriver | UI Automation |
| TestNG | Test Framework |
| Maven | Build Tool |
| Extent Reports | Reporting |
| Log4j | Logging |
| GitHub Actions | CI/CD |
| Apache POI | Excel Handling |

---

# 📁 Framework Structure

```text
src
 ├── test/java
 │    ├── com.adnabu.pages
 │    ├── com.adnabu.tests
 │    ├── com.adnabu.utils
 │    ├── com.adnabu.listeners
 │    ├── com.adnabu.constants
 │    └── com.adnabu.pojo
 │
 ├── test/resources
 │    └── log4j2.xml
 │
 ├── screenshots
 ├── Reports
 └── logs
✅ Features
Page Object Model (POM) architecture
Modular and reusable framework
Explicit waits implementation
Screenshot capture on failures
Extent HTML Reports
Logging using Log4j
Maven Surefire execution
GitHub Actions integration
Clean and maintainable code structure
⚙️ Prerequisites

Before running the project, ensure you have installed:

Java 11 or above
Maven
Git
Chrome Browser
📥 Installation & Setup
Clone Repository
git clone https://github.com/qa-Umesh/Assignment_AdNabu.git
cd Assignment_AdNabu
▶️ Run Tests

Execute the automation suite using:

mvn clean test -Dbrowser=chrome -Disheadless=true
📊 Test Reports

The framework generates Extent HTML Reports after execution.

You can view the latest published report here:

https://qa-umesh.github.io/Assignment_AdNabu/Report.html

📸 Screenshots

Failure screenshots are automatically captured inside:

/screenshots/
📝 Logging

Execution logs are generated inside:

/logs/automation.log
🤖 GitHub Actions Integration

This project is integrated with GitHub Actions for automated execution.

The workflow:

Executes tests automatically
Generates Extent Reports
Publishes reports to GitHub Pages
🌐 GitHub Repository

Repository Link:

https://github.com/qa-Umesh/Assignment_AdNabu

📌 Assignment Coverage
Automated Scenario Covered

✅ Search product successfully
✅ Add product to cart successfully

📌 Notes
This framework was developed specifically for the AdNabu QA Assignment.
The framework focuses on readability, maintainability, and automation best practices.
No hardcoded waits (Thread.sleep) are used in the framework.
Reports are automatically published using GitHub Pages for easy access.
