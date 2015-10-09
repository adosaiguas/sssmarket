# sssmarket
Example Assignment – Super Simple Stock Market

#Requirements

* Provide working source code that will:-
  * For a given stock, 
    * Given any price as input, calculate the dividend yield
    * Given any price as input, calculate the P/E Ratio
    * Record a trade, with timestamp, quantity of shares, buy or sell indicator and 
    * Calculate Volume Weighted Stock Price based on trades in past 15 minutes
  * Calculate the GBCE All Share Index using the geometric mean of prices for all stocks traded price

#Constraints & Notes

* Written in one of these languages: Java, C#, C++, Python
* No database or GUI is required, all data need only be held in memory
* No prior knowledge of stock markets or trading is required – all formulas are provided below.

#How to use:
This is a maven project, so you can run these 2 goals:
* mvn test -> to execute the unit tests.
* mvn package -> to generate the executable jar.

To run the program just run:
* java -jar target/sssmarket-0.0.1-SNAPSHOT.jar

#Classes
* com.jpmorgan.example.assignments.sssmarket.App -> Just a sample app using the main classes Stock and GBCE
* com.jpmorgan.example.assignments.sssmarket.GBCE -> Class used to calculate the All Share Index
* com.jpmorgan.example.assignments.sssmarket.Stock -> Class used to manage the operations against the stocks
* com.jpmorgan.example.assignments.sssmarket.Trade -> Just a bean representing each trade

#Packages
* com.jpmorgan.example.assignments.sssmarket -> The main project package
* com.jpmorgan.example.assignments.sssmarket.enums -> Package containing some enums needed 
