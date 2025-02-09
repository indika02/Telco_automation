# Telco Apps Automation Framework

## Overview
Telco Automation Projects is a test automation framework developed for five telecom applications. It is built using Selenium WebDriver with Java, Cucumber for BDD (Behavior-Driven Development), and TestNG for test execution. The framework is designed to ensure efficient and scalable test automation for telecom-based applications.

## Features
- **Selenium WebDriver** for UI automation
- **Cucumber BDD** for test case readability and maintainability
- **TestNG** for test execution and reporting
- **Page Object Model (POM)** for structured and reusable test scripts
- **Data-driven testing** using external data sources (e.g., Excel, JSON, or database)
- **Parallel Execution** support via TestNG
- **Cross-browser testing** Chrome,Firefox

## Prerequisites
Ensure the following are installed on your system:

1. **Java Development Kit (JDK) 11 or later**
   - Download: [https://www.oracle.com/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
   - Verify installation:
     ```sh
     java -version
     ```
2. **Apache Maven** (for dependency management)
   - Download: [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi)
   - Verify installation:
     ```sh
     mvn -version
     ```
3. **IntelliJ IDEA / Eclipse** (for IDE)
4. **Selenium WebDriver** (included in Maven dependencies)
5. **Cucumber and TestNG** (managed via Maven dependencies)
6. **App-specific test data** (to be provided based on the telco applications being tested)

## Project Setup

### 1. Clone the Repository
```sh
git clone https://github.com/your-repository/telco-automation.git
cd telco-automation
```

### 2. Install Dependencies
Ensure Maven downloads required dependencies:
```sh
mvn clean install
```

### 3. Configure WebDriver
- Place the appropriate WebDriver binaries (ChromeDriver, GeckoDriver, etc.) in the `drivers` folder.
- Set the system property in `./config/config.properties`:
  ```properties
  browser=chrome
  operator=[operator]
  ```

### 4. Run Tests
- **Run tests**
  ```sh
  mvn clean install 
  ```

### 5. Generate Reports
- **Cucumber Reports**
  ```sh
  Reports are available in `target/cucumber-reports/index.html`.
  ```
  
- **TestNG Reports**
  Reports can be found in `target/surefire-reports/index.html`.

## Technologies Used
- **Selenium WebDriver**
- **Java**
- **Cucumber**
- **TestNG**
- **Apache Maven**
- **Extent Reports / Cucumber Reports**
