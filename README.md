# Design-Patterns
A comprehensive repository of Design Patterns 

# Gamma Categorization for Design Patterns

## 1. Creational Patterns

  ### 1.1. Builder
  Separates the construction of a complex object from its representation, allowing the same construction process to create various representations.
  
  ### 1.2. Factory Method
  Defines an interface for creating objects, but allows subclasses to alter the type of objects that will be created.
  
  ### 1.3. Abstract Factory
  Provides an interface for creating families of related or dependent objects without specifying their concrete classes.

  ### 1.4. Prototype
  Creates new objects by cloning an existing object, which serves as a prototype for the new object to be created.
  
  ### 1.5. Singleton
  Ensures that a class has only one instance and provides a global point of access to that instance.

## 2. Structural Patterns

  ### Adapter
  Allows incompatible interfaces to work together by converting the interface of one class into another interface that a client expects.
  
  ### Bridge
  Decouples an abstraction from its implementation, so that the two can vary independently.
  
  ### Composite
  Composes objects into tree structures to represent part-whole hierarchies, allowing clients to treat individual objects and compositions of objects uniformly.
  
  ### Decorator
  Attaches additional responsibilities to an object dynamically, providing a flexible alternative to subclassing for extending functionality.
  
  ### Facade
  Provides a unified interface to a set of interfaces in a subsystem, simplifying the use of the subsystem for clients.
  
  ### Flyweight
  Uses sharing to support large numbers of fine-grained objects efficiently, providing a way to use objects in large numbers when a simple repeated representation would use an unacceptable amount of memory.
  
  ### Proxy
  Provides a surrogate or placeholder for another object to control access to it.

## 3. Behavioral Patterns

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
