# Payment Gateway System
• Overview:
The Payment Gateway System is designed to simulate a flexible and extensible payment processing system that supports multiple payment methods. It utilizes various design patterns to ensure clean architecture, flexibility, and ease of maintenance.

• Key Features:
(1) Multiple Payment Methods: The system supports different payment methods, including Credit Card, PayPal, and Crypto, implemented using the Strategy Pattern.
(2) Factory Pattern: The Factory Method Pattern is used to dynamically create payment method objects based on user input. This allows easy extensibility for adding new payment methods.
(3) Adapter Pattern: An adapter (PayPalAPIAdapter) is used to integrate an external PayPal service into the system, ensuring it adheres to the PaymentMethod interface.
(4) Transaction Logging: The system logs all transactions and maintains a history of processed transactions using the Singleton Pattern (Logger class).

• Architecture:
Design Patterns Used:
• Factory Method Pattern:
The PaymentFactory class is responsible for creating different payment method objects based on input. The concrete PaymentFactoryMethods class defines the creation logic for specific payment types like Credit Card, PayPal, and Crypto.
• Adapter Pattern:
The PayPalAPIAdapter is used to adapt an external PayPal service, ensuring it implements the PaymentMethod interface. This allows seamless integration of external services without changing the core payment system.


# Coffee Shop System
• Overview:
The Coffee Shop System simulates a coffee ordering system, where users can select different types of coffee and customize their orders by adding various ingredients such as milk, cream, caramel, or chocolate. The system is designed using object-oriented principles and design patterns to ensure flexibility and extensibility.

• Key Features:
(1) Coffee Types: The system supports multiple types of coffee, including Espresso, Latte, Americano, Cappuccino, etc. These coffee types are implemented using the Factory Method Pattern, allowing easy addition of new coffee types.
(2) Decorator Pattern: The Decorator Pattern is used to dynamically add customizations to a base coffee (e.g., Milk, Cream, Caramel, or Chocolate). Each decorator wraps a Coffee object and enhances its behavior without modifying the original object.
(3) Factory Method Pattern: The Factory Method Pattern is used to create different types of coffee objects (e.g., EspressoFactory, LatteFactory, etc.), promoting separation of concerns and making it easy to add new types of coffee.

• Architecture:
Design Patterns Used:
• Factory Method Pattern:
The abstract class CoffeeFactory defines the method for creating coffee objects. Concrete factory classes like EspressoFactory, LatteFactory, and AmericanoFactory implement this method to return different coffee objects. This pattern allows for easy expansion of new coffee types without modifying the core logic.
• Decorator Pattern:
The CoffeeDecorator class acts as a base decorator, wrapping a Coffee object and modifying its behavior. Decorators like MilkDecorator, ChocolateDecorator, CaramelDecorator, and CreamDecorator extend the CoffeeDecorator` class to add specific ingredients to the coffee. This pattern enables dynamic customization of a coffee order.
