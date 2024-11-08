# Automation Testing with Selenium, TestNG, Cucumber, Page Object Model (POM),Allure-report, Appium, and Android Emulator

This assingment implements automated UI testing for a mobile application using Selenium, TestNG, Cucumber, BDD framework, Page Object Model (POM), Appium, and an Android Emulator. The tests are designed to run against a mobile application on an Android Emulator, providing a scalable, maintainable, and efficient approach to automated mobile testing.

## Setup Instructions

### Prerequisites

1. **Java 17+**: Ensure Java is installed and the `JAVA_HOME` environment variable is set properly.
2. **Maven**: Ensure Maven is installed. You can verify this by running `mvn -v` in the terminal.
3. **Android Emulator**: Set up Android Studio with an Android emulator.
4. **Appium**: Install Appium for mobile automation.
5. **Selenium**: Ensure the required Selenium WebDriver dependencies are included in the Maven configuration.
6. **TestNG**: Install TestNG framework for running tests.
7. **Cucumber**: Install Cucumber libraries to support the BDD approach.

### 1. Clone the Repository
Clone the repository from GitHub:

```bash
git clone https://github.com/your-repo/automation-testing-project.git
cd automation-testing-project
```

### 2. Install Dependencies
Run the following Maven command to install the necessary dependencies:

```bash
mvn clean install
```

This command will install all required dependencies as defined in the `pom.xml` file.

### 3. Set Up Android Emulator
If you're testing on an Android Emulator:

1. Install [Android Studio](https://developer.android.com/studio).
2. Create an Android Emulator through the AVD Manager (Android Virtual Device).
3. Start the Android Emulator.

### 4. Start Appium Server
Launch the Appium server to begin interaction with the mobile device:

```bash
appium
```

Ensure that the Appium server is running on the default port (4723) or configure it in your Appium setup.

### 5. Run the Tests
You can run the tests using Maven:

```bash
mvn test
```

Alternatively, if you're using TestNG, you can run the tests directly from the command line:

```bash
mvn clean test -DsuiteXmlFile=testng.xml
```

This will trigger TestNG to run your tests.

## Automation Strategy

### Tools & Frameworks Used

- **Maven**: For managing project dependencies and builds.
- **Java**: Programming language for implementing tests.
- **Selenium WebDriver**: For interacting with web and mobile application elements.
- **Appium**: For automating mobile tests on Android Emulator.
- **TestNG**: For running and managing test execution.
- **Cucumber & Gherkin**: For implementing Behavior-Driven Development (BDD) approach and writing tests in plain English.
- **Page Object Model (POM)**: To enhance the maintainability and scalability of the tests.

### Approach

1. **Page Object Model (POM)**: 
   - I created reusable page classes that encapsulate the interactions with the UI components.
   - This modular approach makes it easier to maintain tests, as the changes to UI elements are limited to the page object classes.

2. **Behavior-Driven Development (BDD)**: 
   - I implemented BDD using Cucumber with Gherkin syntax for writing user stories in plain English.
   - This makes the tests more understandable for non-technical stakeholders.
   - Cucumber scenarios were mapped to step definitions, where Appium was used to interact with the mobile application.

3. **TestNG**: 
   - TestNG was used to run and manage test execution. It provides parallel test execution, test grouping, and easy test reporting.
   - TestNG also integrates with the Maven build lifecycle, allowing for easy integration into CI/CD pipelines.

4. **Appium & Android Emulator**: 
   - Appium was used to interact with the Android Emulator.
   - Desired capabilities were configured to communicate with the Android Emulator and run tests on the desired mobile app version.

### Challenges & Solutions

- **Challenge 1: Setting up Appium with the Android Emulator**
  - Initial challenge was configuring the Android Emulator with Appium.
  - Solution: Ensured that the emulator was running and verified the ADB connection with the command `adb devices`. Configured the correct device capabilities in the Appium setup.

- **Challenge 2: Managing Page Objects with Dynamic Content**
  - Some pages had dynamic content (e.g., buttons, popups) that required precise synchronization.
  - Solution: Used explicit waits (`WebDriverWait`) to ensure elements were present and visible before interacting with them.

- **Challenge 3: Integrating Cucumber with Appium**
  - Cucumber step definitions had to integrate seamlessly with Appium for mobile interactions.
  - Solution: Carefully mapped Gherkin steps to Appium actions, ensuring that elements were found and interacted with correctly.

- **Challenge 4: Test Parallelization**
  - Running tests in parallel was a requirement for faster execution.
  - Solution: Configured TestNG to run tests in parallel, ensuring that the tests were executed across multiple devices or emulators simultaneously.

## Expected Output

Once the tests are executed, you should see the following expected behaviors:

1. **Console Output**:
   - TestNG will provide detailed logs showing whether each test passed or failed.
   - ![Screenshot 2024-11-08 151215](https://github.com/user-attachments/assets/c5cdd474-b35a-45b6-8a31-3dc718cc7699)

  

2. **Appium Logs**:
   - Logs showing communication between the Appium server and the Android Emulator will be visible in the console.
     ![Screenshot 2024-11-08 151358](https://github.com/user-attachments/assets/3809ba57-e29f-4c4f-9958-6d7dcb872ef5)

3. **TestNG Report**:
   - After the tests complete, a TestNG report will be generated in the `/allure-report` directory.
   - The report will display a summary of test results, including which tests passed, failed, and the execution time.
     ![Screenshot 2024-11-06 204820](https://github.com/user-attachments/assets/571b8c5c-0771-4ccb-9ccc-ccd82c4e8fe2)



