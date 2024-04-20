# Design-Patterns

## [SOLID Design Patterns](https://github.com/omrawal/Design-Patterns/tree/main/1_SOLID_Design_Patterns)

  ### 1. [Single Responsibility Principle](https://github.com/omrawal/Design-Patterns/tree/main/1_SOLID_Design_Patterns/1.01_Single_Responsibility_Principle)
  A class should have one and only one responsibility.
  
  ### 2. [Open Close Principle](https://github.com/omrawal/Design-Patterns/tree/main/1_SOLID_Design_Patterns/1.02_Open_Close_Principle)
  A class should be open for extension but closed for modification.
  
  ### 3. [Liskov's Substitution Principle](https://github.com/omrawal/Design-Patterns/tree/main/1_SOLID_Design_Patterns/1.03_Liskov_Substitution_Principle)
  A child should be able to do everything that its parent class can do.
  
  ### 4. [Interface Segregation Principle](https://github.com/omrawal/Design-Patterns/tree/main/1_SOLID_Design_Patterns/1.04_Interface_Segregation_Principle)
  Interfaces should not enforce the implementation of unnecessary methods.

  ### 5. [Dependency Inversion Principle](https://github.com/omrawal/Design-Patterns/tree/main/1_SOLID_Design_Patterns/1.05_Dependency_Inversion_Principle)
  High-level Modules should not depend on low-level modules. Both should depend on Abstraction. Abstraction should not depend on details.
  There should be no restriction on details for performing any action.


# Gamma Categorization for Design Patterns

## 2. [Creational Patterns](https://github.com/omrawal/Design-Patterns/tree/main/2_Creational_Design_Patterns) [Deals with Creation of Objects]

  ### 2.1. [Builder](https://github.com/omrawal/Design-Patterns/tree/main/2_Creational_Design_Patterns/2.01_Builder)
  Allows the creation of an object piece by piece. This helps avoid lengthy parameters in the constructor.
  
  ### 2.2. [Factory Method](https://github.com/omrawal/Design-Patterns/tree/main/2_Creational_Design_Patterns/2.02_Factory)
  Defines an interface for creating objects, but allows subclasses to alter the type of objects that will be created.
   Abstract Factory
    Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

  ### 2.3. [Prototype](https://github.com/omrawal/Design-Patterns/tree/main/2_Creational_Design_Patterns/2.03_Prototype)
  Creates new objects by cloning an existing object, which serves as a prototype for the new object to be created.
  
  ### 2.4. [Singleton](https://github.com/omrawal/Design-Patterns/tree/main/2_Creational_Design_Patterns/2.04_Singleton)
  Ensures that a class has only one instance and provides a global point of access to that instance.

## 3. [Structural Patterns](https://github.com/omrawal/Design-Patterns/tree/main/3_Structural_Design_Patterns) [Deals with the structure of objects when they grow in size]

  ### 3.1. Adapter
  Allows incompatible interfaces to work together by converting the interface of one class into another interface that a client expects.
  
  ### 3.2. Bridge
  Decouples an abstraction from its implementation, so that the two can vary independently.
  
  ### 3.3. Composite
  Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly.
  
  ### Decorator
  Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
  
  ### Facade
  Provides a unified interface to a set of interfaces in a subsystem, simplifying the use of the subsystem for clients.
  
  ### Flyweight
  Uses sharing to support large numbers of fine-grained objects efficiently, providing a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory.
  
  ### Proxy
  Provides a surrogate or placeholder for another object to control access to it.

## 4. [Behavioral Patterns]() [Deals with the interaction between the objects and their behaviour]

  ### Chain of Responsibility
  Allows multiple objects to handle a request without the sender needing to know which object will handle it, and the objects are linked in a chain.
  
  ### Command
  Encapsulates a request as an object, thereby allowing for parameterization of clients with queues, requests, and operations.
  
  ### Interpreter
  Interprets sentences in a language and represents them as abstract syntax trees, allowing for the execution of these sentences.
  
  ### Iterator
  Provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.
  
  ### Mediator
  Defines an object that encapsulates how a set of objects interact, promoting loose coupling by keeping objects from referring to each other explicitly.
  
  ### Memento
  Captures and externalizes an object's internal state so that the object can be restored to this state later, without violating encapsulation.
  
  ### Observer
  Defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.
  
  ### State
  Allows an object to alter its behavior when its internal state changes, wrapping the state-specific behavior in separate classes and delegating the behavior to these classes.
  
  ### Strategy
  Defines a family of algorithms, encapsulates each one, and makes them interchangeable, allowing the algorithm to vary independently from the clients that use it.

  ### Template Method
  Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
  
  ### Visitor
  Represents an operation to be performed on the elements of an object structure, allowing new operations to be added without modifying the structures of the elements themselves.
