#Factory method Design pattern

Factory pattern is used to create instances for classes. The creation of an object is not exposed to the client and the client uses the same common interface to create a new type of object. The core idea behind the static factory method is to create and return instances wherein the details of the class module are hidden from the user.

In a nutshell, a superclass will specify all the standard and generic behaviors and then delegates the creation details to the subclasses which are supplied by the client.

#How to implement in short 

A class having a static factory method will take some arguments and based on the arguments it will create an object which is inherited from a common interface based on the arguments passed to method.

#Why factory method pattern 
Some time our application or framework will not know that what kind of object it has to create at run-time it knows only the interface or abstract class and as we know we can not create an object of interface or abstract class so the main problem is framework knows when it has to create but don’t know what kind of object.

Whenever we create an object using new() we violate the principle of programming for interface rather than implementation which eventually results in inflexible code and is difficult to change in maintenance. By using the Factory design pattern in Java we get rid of this problem.

Another problem we can face is class needs to contain objects of other classes or class hierarchies within it; this can be very easily achieved by just using the new keyword and the class constructor. The problem with this approach is that it is a very hard-coded approach to create objects as this creates a dependency between the two classes.

#When to use the Factory design pattern in Java

- Static Factory methods are common in frameworks where library code needs to create objects of types which may be sub classed by applications using the framework.        
- Some or all concrete products can be created in multiple ways, or we want to leave open the option that in the future there may be new ways to create the concrete product.
- Factory method is used when Products don't need to know how they are created.
- We  can use factory pattern where we have to create an object of any one of sub-classes depending on the data provided

#Practical use 

jdk `valueOf()` method,framework such as Spring, Struts and Apache
