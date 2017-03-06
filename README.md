# simple_cart

simple cart project for calculating cost of items in basket. Using core java API's very simple online cart is implemented.

#External Jars used
log4j-api-2.8.1.jar
log4j-core-2.8.1.jar

#JDK Version
1.7 or 1.8

#Working summary
The interface IPurchase is exposed to client and contains methods for purchasing the items from online shop.
+Class Purchase implements actual methods for interface IPurchase. 
Class Item is a POJO object with setter and getter methods for variables itemcode,itemname,quantity and price.
Class ItemTest is like client entering the products to cart and getting total cost of items in cart.

#Runnig the Application
download the jar file CartApp.jar from this location src\CartAPP.jar 
and issue the command java -jar CartAPP.jar
