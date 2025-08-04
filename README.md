
# 🔐 Janitri Login Page Automation – QA Internship Assignment

This repository contains an automated test suite for the **Janitri Dashboard Login Page**, developed as part of the **QA Internship Assignment**.  
The automation framework uses **Java, Selenium WebDriver, TestNG**, and follows the **Page Object Model (POM)** design pattern.

---

## 🚀 Objective

Automate and validate the UI behavior of the login page at:  
🔗 [https://dev-dash.janitri.in/](https://dev-dash.janitri.in/)

---

## 🛠 Tech Stack

- **Java** (JDK 8+)
- **Selenium WebDriver**
- **TestNG** (for test management)
- **Maven** (for build and dependency management)
- **Page Object Model (POM)**

---

## 📂 Project Structure

```

Janitri-Login-Test/
├── src/
│   └── test/
│       ├── java/
│       │   ├── base/
│       │   │   └── Basetest.java
│       │   ├── pages/
│       │   │   └── LoginPage.java
│       │   └── tests/
│       │       └── LoginTest.java
├── testng.xml
├── pom.xml
└── README.md

````

---

## ✅ Automated Test Cases

| Test Name                            | Description |
|-------------------------------------|-------------|
| `testValidLogin()`                  | Verifies the login button is disabled when fields are empty |
| `testPasswordMaskedButton()`        | Validates password masking and toggle behavior |
| `testInvalidLoginShowsErrorMessage()` | Checks if appropriate error message is shown on invalid credentials |
| `testPresenceOfAllElements()`       | Verifies presence of all key login page UI elements (username, password, button, eye icon) |

---

## 🧪 How to Run the Tests

### 1. Clone this Repository

```bash
git clone https://github.com/Utkarshso/Janitri-Login-Test.git
cd Janitri-Login-Test
````

### 2. Install Maven Dependencies

Make sure Maven and Java are installed. Then:

```bash
mvn clean install
```

### 3. Run the Tests via TestNG

```bash
mvn test -DsuiteXmlFile=testng.xml
```

Or, use your IDE (right-click on `testng.xml` > Run as TestNG Suite)

---

## 🖥 Setup Notes

* Make sure `chromedriver` is correctly installed and its path is set in `Basetest.java`
* Chrome browser should be available on your system
* This project assumes tests run in **headful (non-headless)** mode for UI visibility

---


