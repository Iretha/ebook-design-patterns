# GoF Design Patterns (23)

A design pattern is reusable solution of a commonly occurring problem (usually in software design). 

Design Patterns got very popular when the book "Design Patterns: Elements of Reusable Object-Oriented Software (1994)" 
was published. The book was written by Erich Gamma, Richard Helm, Ralph Johnson, and John Vlissides (known as the "Gang of Four" / GoF).
The book is divided into two parts, with the first two chapters exploring the capabilities and pitfalls of 
object-oriented programming, and the remaining chapters describing 23 classic software design patterns.

Design patterns were originally grouped into the categories: 
- creational patterns 
- structural patterns  
- behavioral patterns

## [GoF Creational Design Patterns (5)](https://github.com/Iretha/ebook-design-patterns/blob/master/src/com/smdev/gof/creational)

### Summary
Creational Design Patterns have to deal with object creation/ instantiation. They reduce complexity and hide 
from client how the object is created. The client is entirely decoupled from the actual initialization process
and the implementation could be easily replaced if necessary.

### Consider applying creational patterns when:
- A system should be independent of how its objects and products are created.
- A set of related objects is designed to be used together.
- Hiding the implementations of a class library or product, revealing only their interfaces.
- Constructing different representation of independent complex objects.
- A class wants its subclass to implement the object it creates.
- The class instantiations are specified at run-time.
- There must be a single instance and client can access this instance at all times.
- Instance should be extensible without being modified.

### [GoF Creational Design Patterns with Explanation & Examples](https://github.com/Iretha/ebook-design-patterns/blob/master/src/com/smdev/gof/creational)

## Structural Design Patterns (7)
## Behavioral Design Patterns (11)