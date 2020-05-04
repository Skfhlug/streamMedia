# Design/Code Review 3
​
## Project:Stream Media
​
### Developer: Jeanne d'Arc Uwimana
​
#### Reviewer: Suparin Fhlug

|Category|Criteria|Rating/Comments|
|--------|---------|---------------|
|**Project Overview**|| |
||Which planned functionality has been met? |Most of important functions are working good. User can add questions. Admin can add, edit, delete data from database. |
|| What planned functionality has not been met? ||
||Describe the GitHub history and what it demonstrates about the project progress during the semester.|Jeanne is working follow the project plan. She work and commit her work 4-6 days/week |
||Describe how peer and instructor feedback/recommendations were incorporated into the project.|It seems project is 90% done. Important parts are working fine. |
||Other comments/notes?||
|**JSPs**|| |
||Evaluate the JSPs for templating, business logic, data validation, overall look and feel.| JSPs for this project are organized well and easy to understand. It is easy to find the code and class.|
||Other comments/notes?| |
|**Java code quality**|Evaluate the code quality for the following and identify specific areas for improvement (class, method or line number) <li>single-purpose methods <li>well-structured project <li>descriptive naming of packages, classes, methods, variables <li>classes appropriately-sized  (no monster classes) <li> CPD (copy paste detection, meaning are the same lines of code repeated?) <li>are there candidates for super/subclass relationships, abstract classes, interfaces? <li>are any values hard-coded that should be in a properties file? <li>proper exception handling <li>proper error reporting to the user <li> code documentation |<li>Medthods in these project are easy to understand and not too complicated.</li><li>The project was organized very well, easy to find classes.</li><li>classes, packages, methods named reasonable. It is related to the functions.</li><li>The classes have good size, not too small or too big. I don't see any monster classes.</li><li>Code are not look much different, but they are not exactly the same</li><li>I don't see any hard code in this project.</li><li>There are error pages and the validation input </li><li>There are no comment or code detail in some classes.</li>|Other comments/notes?| |
|**Logging**|Evaluate the use of logging, for example:<li>appropriate use of logging statements in the code for error logging and debugging <li>logging levels used - info, debug, error <li> no occurrences of  System.out.printlns or printStackTrace() <li> logging works on AWS deploy||Other comments/notes?| There are @Log4j2 in many classes|
|**Unit Tests**|Evaluate the unit tests, for example: <li>tests are truly a unit test rather than a high level functional test <li>test data is appropriately cleaned up or handled <li> there is full coverage of methods that perform business logic or utility functions <li>redundant code is eliminated by using set up and tear down methods, i.e., @Before, @After
||Other comments/notes?| <li>There are mathods for testing add, edit, delete, and search function.</li><li>There are cleanedb sql file to clean the test</li><li>There are tests for all entities </li><li>There are @BeforeEach in every classes</li>|
|**Security**|Evaluate authentication/authorization:| |
||Is it implemented correctly and working locally as well as on AWS?
||Other comments/notes?| There is login function for admin, and limit other user access.|
|**Web Service/API integration**|Evaluate the service/api integration, for example: <li> Which service/api is implemented? <li>How is  error handling of the service implemented? For example, what happens if the service is not available?|She have API function to get Genre and APIMovie data|
||Other comments/notes?| |
|**Independent research topic**| What is the independent research topic?| |
||Is the independent research topic/technique implemented in the project?| |
||Other comments/notes?| |
|**Deployment**| Has the application been successfully deployed to AWS?| |
||Is the hosted application fully functioning?| |
||Other comments/notes?| |
  
