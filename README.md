# selenium_java
Document and test out selenium using java. Will have different branches for each stage to show progress and have notes at each stage.

<h1>Running</h1>
1. Set up environment variable for chromediver path

<h1>Procedure</h1>
<h2>Pre-reqs & environment set up(Mac- ios)</h2>

1. Install JAVA JDK - set JAVA_HOME
2. Install Homebrew
3. Install maven
4. Install XCode
5. Install the latest chrome or preferred internet browser.
6. Download browser driver (ie: chromedriver).

<h2>Programing</h2>
1. Create project structure.
2. Create pom.xml file to import required dependency libraries.
   1. `<project xmlns="http://maven.apache.org/POM/4.0.0">`
   2. `groupId`, `artifactID`, `version`, `properties`, `dependencies`
3. Create/update driver class to accept arguments in main constructor 
   1. Have arguments control browser desired and set up driver options(configurations)
   2. Create a cleanup method
   3. Create driver getter method
   4. Add TestNg annotations for after suite behavior
      1. `@BeforeSuite`, `@AfterSuite`
4. Create a runner xml to indicate what test will be executed
   1. `<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">`
   2. `suite`, `test`, `classes`, `class`
5. Create/update the test class to place test conditions with annotations 
   1. `@BeforeClass`, `@Test` 
6. Add assertions to test 
   1. `Assert`, `Verify`
7. Turn listeners on for the run configuration to get reports generated

<h3>Pros</h3>
- Multiple browser and development language support
- Headless browsers
- Simpler architecture that directly talks to browser

<h3>Cons</h3>
- WebDriver Cannot Readily Support New Browsers
- It does not have a built-in command for automatic generation of test results