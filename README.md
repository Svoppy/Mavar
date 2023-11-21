"Mavar" Tea house
Final Project
“Software Design Patterns” course
 
Group: SE-2224

Team members: Dias Kazikhanov, 
Dias Isenov 

Teaching Assistant: Arailym Bakenova 


Astana, 2023
Project Overview

 The final project for the "Software Design Patterns" course will try to design a comprehensive reservation system for a tea house. The key goals of the project are to show the practical application of design patterns and to produce a user-friendly, flexible, and maintained reservation system. The project includes several major components:

The Project's Concept:
 The project is focused on the development and deployment of a tea house reservation system. Customers can make table reservations, purchase food and drinks, select payment options, and receive notifications. This solution will improve the client experience and streamline operations at the tea house.

Work Purpose:
 The goal of this project is to apply various design patterns to a real-world issue. It provides students with an opportunity to comprehend and efficiently apply design patterns. In addition, the project intends to develop a functioning and user-friendly tea house reservation system.

Objectives of the Work:
 The objectives of this project are as follows:
In a real-world setting, implement and demonstrate various design patterns such as Singleton, Observer, Decorator, Factory, and Adapter.
Create an easy-to-use Command Line Interface (CLI) for customers to utilize while reserving tables and ordering things from the menu.
Create a pricing strategy that is adaptable to different table kinds (standard and VIP).
Multiple payment options, including internet payment via an adaptor, are supported.

UML:





Main body: 
 This project effectively leverages a collection of design patterns to develop a versatile and adaptable tea house reservation system. Its core features, each employing appropriate patterns, contribute to its overall functionality.
 The ReservationManager class, adhering to the Singleton pattern, oversees table reservations. It maintains a comprehensive list of available tables, including Standard and VIP options, enabling customers to select the desired table type. Additionally, a Factory pattern facilitates dynamic table creation.


 The Observer pattern empowers the Customer and RestaurantStaff classes to act as observers of the reservation system. Upon a reservation being made, both customers and restaurant staff receive timely notifications. This pattern streamlines communication between system components, ensuring seamless information exchange.
 
 The FoodAndDrinkDecorator class serves as a reservation decorator, enriching the reservation process. It allows customers to order food and drinks simultaneously during the reservation process, enhancing flexibility while maintaining the integrity of the core Table classes.

 The Menu class presents a comprehensive menu showcasing various items accompanied by their respective prices. It displays the menu to customers, enabling them to select items for their orders.

 The PricingStrategy pattern is implemented by the StandardTablePricing and VipTablePricing classes, defining pricing logic for standard and VIP tables. This approach fosters flexibility for future expansion with diverse pricing strategies.


 The PaymentAdapter pattern is embodied by the OnlinePaymentAdapter class, functioning as an adapter for online payment processing. Customers can choose between online or cash payments, with the adapter pattern facilitating seamless integration of various payment gateways.

 The TeaHouseCLI class provides a user-friendly CLI, empowering customers to interact seamlessly with the reservation system. It allows customers to select table types, order items from the menu, and complete payments, simplifying user interaction. 


 Website (http://mavar.mydurable.com)
It is worth noting that we have developed a website for this project that acts as a sort of face and marketing for our goods. We express the mood and decor of our teahouse, as well as crucial restaurant information, in it.










Conclusion:
The project's success lies in its effective utilization of design patterns. The Singleton, Observer, Decorator, Factory, and Adapter patterns have been employed to create a modular and scalable software architecture. Additionally, the CLI provides a user-friendly interface for customers to reserve tables and place orders from the menu. The pricing strategy and payment adapter patterns enable effortless customization of pricing and support for diverse payment methods, further enhancing the system's flexibility. However, balancing the incorporation of multiple design patterns to maintain code maintainability and clarity presented a challenge throughout the project. Future improvements may involve expanding the feature set to include reservations for specific times and dates, enhancing the menu, and refining the user interface for both customers and staff.






































































































































