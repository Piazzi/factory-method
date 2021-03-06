<div align="center">
  <h1> FACTORY METHOD </h1>
</div>

# Code

Simple project representing the factory method design pattern. For this one, i made a application which consists in opening and exiting multiple games.
<br></br>


# Resume


The Factory Method design pattern solves problems like: 

- How can an object be created so that subclasses can redefine which class to instantiate?
- How can a class defer instantiation to subclasses?

The Factory Method design pattern describes how to solve such problems:

- Define a separate operation (factory method) for creating an object.
- Create an object by calling a factory method.

This enables writing of subclasses to change the way an object is created (to redefine which class to instantiate).
See also the UML class diagram below.


![image](https://user-images.githubusercontent.com/40416044/144236697-81a057c4-9716-4b17-8613-b61316a57501.png)

# Definition



In class-based programming, the factory method pattern is a creational pattern that uses factory methods to deal with the problem of creating objects without having to specify the exact class of the object that will be created. This is done by creating objects by calling a factory method—either specified in an interface and implemented by child classes, or implemented in a base class and optionally overridden by derived classes—rather than by calling a constructor.

Source: <a href="https://en.wikipedia.org/wiki/Factory_method_pattern"> Wikipedia </a> | <a href="https://refactoring.guru/pt-br/design-patterns/factory-method"> Refactoring Guru </a>
