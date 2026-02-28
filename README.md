## 1. Online Food Ordering System

### Description

This project is developed using core Java and demonstrates OOP concepts like abstraction, inheritance, polymorphism and encapsulation.

### Classes Used

**FoodItem (Abstract Class)**

* Attributes: id, name, price
* Private variables with getters and setters
* Abstract method: calculateDiscount()

**VegItem (Subclass of FoodItem)**

* Implements calculateDiscount()
* Gives 10% discount

**NonVegItem (Subclass of FoodItem)**

* Implements calculateDiscount()
* Gives 5% discount

**Order Class**

* Contains a List of FoodItem
* Method: calculateTotalBill()
* Stores both VegItem and NonVegItem in same list (polymorphism)

### Concepts Used

* Abstraction → FoodItem abstract class
* Inheritance → VegItem and NonVegItem extend FoodItem
* Polymorphism → List<FoodItem>
* Encapsulation → Private variables with getters and setters

## 2. Student Management System (JDBC)

### Description

This is a console-based Java application that performs CRUD operations on a Student table using JDBC.

Only PreparedStatement is used for all database operations. Statement is not used anywhere.

### Database Table

Student(
id INT PRIMARY KEY,
name VARCHAR(50),
marks DOUBLE
)

### Functionalities

1. Insert student
2. Update student marks
3. Delete student
4. Fetch all students

The program is menu driven and runs in a loop until the user exits.


These two projects helped me understand OOP concepts and how to connect Java with a database using JDBC and PreparedStatement.
