# AdNabu QA Automation Assignment

A scalable and maintainable **Java-based Test Automation Framework** developed for the **AdNabu QA Engineer Assignment** using **Selenium WebDriver**, **TestNG**, and **Maven** following the **Page Object Model (POM)** design pattern.

The framework automates the following e-commerce workflow:

- Search for a product
- Add product to cart successfully

The project is designed with reusable components, reporting, logging, screenshots, and GitHub Actions integration following automation best practices.

---

# 🚀 Project Overview

This framework includes:

- Selenium WebDriver automation
- TestNG execution
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
```

---

# ✅ Features

- Page Object Model (POM) architecture
- Modular and reusable framework
- Explicit waits implementation
- Screenshot capture on failures
- Extent HTML Reports
- Logging using Log4j
- Maven Surefire execution
- GitHub Actions integration
- Clean and maintainable code structure

---

# ⚙️ Prerequisites

Before running the project, ensure the following tools are installed:

- Java 11 or above
- Maven
- Git
- Google Chrome Browser

---

# 📥 Installation & Setup

## Step 1: Clone Repository

```bash
git clone https://github.com/qa-Umesh/Assignment_AdNabu.git
```

---

## Step 2: Navigate to Project Folder

```bash
cd Assignment_AdNabu
```

---

# ▶️ Execute Automation Tests

Run the following command to execute the automation suite:

```bash
mvn clean test -Dbrowser=chrome -Disheadless=true
```

---

# 📊 Test Reports

The framework generates Extent HTML Reports after execution.

You can view the latest published report here:

👉 https://qa-umesh.github.io/Assignment_AdNabu/Report.html

---

# 📸 Screenshots

Failure screenshots are automatically captured inside:

```text
/screenshots/
```

---

# 📝 Logging

Execution logs are generated inside:

```text
/logs/automation.log
```

---

# 🤖 GitHub Actions Integration

This project is integrated with GitHub Actions for automated execution.

The workflow:
- Executes automation tests
- Generates Extent Reports
- Publishes reports to GitHub Pages automatically

---

# 🌐 GitHub Repository

Repository Link:

👉 https://github.com/qa-Umesh/Assignment_AdNabu

---

# 📌 Assignment Coverage

## Automated Scenario Covered

✅ Search product successfully  
✅ Add product to cart successfully

---

# 📌 Notes

- This framework was developed specifically for the AdNabu QA Assignment.
- The framework focuses on readability, maintainability, and automation best practices.
- No hardcoded waits (`Thread.sleep`) are used in the framework.
- Reports are automatically published using GitHub Pages for easy access.
