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
   1. `groupId`, `artifactID`, `version`, `properties`, `dependencies`
3. Create/update driver class to accept arguments in main constructor 
   1. Have arguments control browser desired and set up driver options(configurations)
   2. Create a cleanup method
   3. Create driver getter method
4. Create a test class to place main class and run driver with "validations"

<h3>Pros</h3>
- Multiple browser and development language support
- Headless browsers
- Simpler architecture that directly talks to browser

<h3>Cons</h3>
- WebDriver Cannot Readily Support New Browsers
- It does not have a built-in command for automatic generation of test results