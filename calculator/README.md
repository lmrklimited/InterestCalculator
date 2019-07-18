# About the project

This is spring boot starter web application which exposes restful endpoints which can be used to calculate the interest for the passed in amount. 

The interest rate 
0 - 1000 = 1%
1000 - 5000 = 2%
5000 and above = 3%

The above interest rate is configured in the ENUM with all the required attributes. The same could be configured in the database and can be read through spring JPA with a simple entity class which would get values from DB with simple spring repositories. 

CalculatorController exposes the GET /interest/{amount} as a restful endpoint which injects the CalculatorService to get the interest calculated from the values configured in InterestRate enum. 


How to Run the jar:

the compiled version of the code is in the target folder which can be created by running the command 

mvn package

once the jar is created it can be started by running below cammand from project home

java -jar target/calculator-0.0.1-SNAPSHOT.jar

once the application is started the same can be accessed from the browser with

http://localhost:8080/interest/6400 

which will return 132.00

value in the URL can be changed to any value, if  you give 400 for example which will give 4.00
