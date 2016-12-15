## Java-TestNg-Appium-Android-Basic

This code is provided on an "AS-IS” basis without warranty of any kind, either express or implied, including without limitation any implied warranties of condition, uninterrupted use, merchantability, fitness for a particular purpose, or non-infringement. Your tests and testing environments may require you to modify this framework. Issues regarding this framework should be submitted through GitHub. For questions regarding Sauce Labs integration, please see the Sauce Labs documentation at https://wiki.saucelabs.com/. This framework is not maintained by Sauce Labs Support.

### Environment Setup

1. Global Dependencies
    * [Install Maven](https://maven.apache.org/install.html)
    * Or Install Maven with [Homebrew](http://brew.sh/)
    ```
    $ brew install maven
    ```
2. TestObject Credentials
    * Add your TestObject API Key and the Suite Number on line 19 as indicated
    
3. Project Dependencies
   * Check that Packages are available
	```
	$ cd Java-TestNg-Appium-Android-Basic
	$ mvn test-compile
	```
	* You may also want to run the command below to check for outdated dependencies. Please be sure to verify and review updates before editing your pom.xml file. The updated packages may or may not be compatible with your code.
	```
	$ mvn versions:display-dependency-updates
	```
4. Application
   * Application can be downloaded by clicking [here](http://saucelabs.com/example_files/ContactManager.apk)
    
### Running Tests
   * Note: Suite must be created and devices selected before running tests.

   #####Execute Suite
	```
	$ mvn test
	```
### Advice/Troubleshooting
1. It may be useful to use a Java IDE such as IntelliJ or Eclipse to help troubleshoot potential issues. 

### Resources
##### [TestObject TestNG Documentation](https://help.testobject.com/docs/tools/appium/setups/watcher-setup/testng/)

##### [Appium Documentation](http://appium.io/slate/en/master/)

##### [TestNg Documentation](http://testng.org/javadocs/index.html)

##### [Java Documentation](https://docs.oracle.com/javase/7/docs/api/)

##### Stack Overflow:
* [Related Stack Overflow Threads](http://stackoverflow.com/questions/27355003/advise-on-hierarchy-for-element-locators-in-selenium-webdriver)
