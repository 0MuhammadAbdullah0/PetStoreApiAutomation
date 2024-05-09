# REST Assured API Testing Automation Framework

This project is an automation framework for testing the Open Source PetStore Swagger API using REST Assured. It incorporates TestNG annotations, data-driven testing, a hybrid approach, POM (Page Object Model) structure, Maven's `pom.xml` for dependency management, Allure reports for comprehensive test reporting, and Jenkins for Continuous Integration (CI).

## Setup Instructions

1. **Clone the Repository:**
   ```
   git clone https://github.com/your-username/petstore-rest-assured.git
   ```

2. **Install Dependencies:**
   Navigate to the project directory and execute:
   ```
   mvn clean install
   ```

3. **Allure Report Setup:**
   To generate Allure reports, ensure you have Allure installed. Execute tests with Allure listener:
   ```
   mvn clean test allure:report
   ```

4. **Jenkins Integration:**
   Configure Jenkins to pull the project from your repository and execute the Maven build script (`pom.xml`). Ensure Jenkins has access to necessary dependencies and configurations.



## Features

- **TestNG Annotations:** Utilizes TestNG annotations for test orchestration and execution.
- **Data-Driven Testing:** Supports data-driven testing with external data sources such as Excel, CSV, etc.
- **Hybrid Approach:** Implements a hybrid framework combining modular and data-driven approaches.
- **POM Structure:** Follows the Page Object Model for better code maintainability and readability.
- **POM.xml:** Utilizes Maven's `pom.xml` for dependency management and build automation.
- **Allure Reports:** Generates detailed and visually appealing Allure reports for test results analysis.
- **Jenkins Integration:** Integrated with Jenkins for Continuous Integration (CI) to automate the build and testing process.

## Usage

1. **Writing Tests:**
   Write your test cases in TestNG test classes under `src/test/java/com/yourcompany/petstore/tests/`.

2. **Data-Driven Testing:**
   Store test data in external files such as Excel, CSV, or JSON format under `src/test/resources/data/`.

3. **Executing Tests:**
   Execute tests using Maven:
   ```
   mvn clean test
   ```

4. **Viewing Reports:**
   Access Allure reports generated after test execution. Reports are stored in `target/allure-report/`.
   ![image](https://github.com/0MuhammadAbdullah0/PetStoreApiAutomation/assets/96330180/c0b01bad-6100-4a80-9463-db2d4f9e86d9)


6. **CI/CD Pipeline:**
   Integrate with Jenkins to automate test execution and report generation as part of your CI/CD pipeline.

## Contribution

Contributions are welcome! If you find any issues or have suggestions for improvement, feel free to create a pull request.
