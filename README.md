# TestMon

Instructions for Mac OS
1. Git Clone https://github.com/DuarteMiragaia/TestMon.git
2. Go to the Project root folder "com.googleproject"
3. Type mvn -v (ensure maven is intalled)
4. If not (install Maven, ensure env variables are currectly setup)
export M2_HOME=/YOUPATH/apache-maven
export PATH=$PATH:$M2_HOME/bin
5. Repeat step 3
6. Replace on "YOURPATH" in line 21 of stepFile/Home.java
7. To run the tests type "mvn test"
8. All tests run successfully

Note: Cucumber was used in this project to simplify the test cases definition. Page object pattern was not used to ensure this was built in 4hours. Not related but I've used cucumber to add an extra brightness to this project.

Test Cases:
1. Navigate to Google Home Page and check Search box is displayed
2. Navigate to Google Home Page and check Search box is displayed
3. Navigate to Google Home Page and clicks on Gmail link
