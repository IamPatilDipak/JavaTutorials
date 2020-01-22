**What is an abstract class, and when should it be used?**

**Answer**

Abstract classes are classes that contain one or more abstract methods. An abstract method is a method that is declared, 
but contains no implementation. Abstract classes may not be instantiated, and require subclasses to provide implementations for the abstract methods. 
Let's look at an example of an abstract class, and an abstract method.
Suppose we were modeling the behavior of animals, by creating a class hierachy that started with a base class called Animal. 
Animals are capable of doing different things like flying, digging and walking, but there are some common operations as well like eating and sleeping. 
Some common operations are performed by all animals, but in a different way as well. 
When an operation is performed in a different way, it is a good candidate for an abstract method (forcing subclasses to provide a custom implementation). 
Let's look at a very primitive Animal base class, which defines an abstract method for making a sound (such as a dog barking, a cow mooing, or a pig oinking). 

```
public abstract Animal
{
   public void eat(Food food)
   {
        // do something with food.... 
   }

   public void sleep(int hours)
   {
        try
	{
		// 1000 milliseconds * 60 seconds * 60 minutes * hours
		Thread.sleep ( 1000 * 60 * 60 * hours);
	}
	catch (InterruptedException ie) { /* ignore */ } 
   }

   public abstract void makeNoise();
}
```

Note that the abstract keyword is used to denote both an abstract method, and an abstract class. 
Now, any animal that wants to be instantiated (like a dog or cow) must implement the makeNoise method - 
otherwise it is impossible to create an instance of that class. 
Let's look at a Dog and Cow subclass that extends the Animal class.

```
public Dog extends Animal
{
   public void makeNoise() { System.out.println ("Bark! Bark!"); }
}

public Cow extends Animal
{
   public void makeNoise() { System.out.println ("Moo! Moo!"); }
}
```

Now you may be wondering why not declare an abstract class as an interface, 
and have the Dog and Cow implement the interface. Sure you could - but you'd also need to implement the eat and sleep methods. 
By using abstract classes, you can inherit the implementation of other (non-abstract) methods. 
You can't do that with interfaces - an interface cannot provide any method implementations.


**When to use abstract class and interface in Java**

Here are some guidelines on when to use an abstract class and when to use interfaces in Java:

1. An abstract class is good if you think you will plan on using inheritance since 
   it provides a common base class implementation to derived classes.
   
2. An abstract class is also good if you want to be able to declare non-public members. 
   In an interface, all methods must be public.
   
3. If you think you will need to add methods in the future, then an abstract class is a better choice. 
   Because if you add new method headings to an interface, then all of the classes that already implement 
   that interface will have to be changed to implement the new methods. That can be quite a hassle.
  
4. Use a abstract class **when you want to share code among several closely related classes (Animal - with fields name, age...)**

**Summary** :- The purpose of an abstract class is to provide a common definition of a base class that multiple derived classes can share.
  
5. Interfaces are a good choice when you think that the API will not change for a while.

6. Interface is just the declaration of methods of an class, it is not the implementation.

7. In an Interface, **we define what kind of operation an object can perform.** These operatios are defined by the interface that implement the class.

8. **Interface form a contract between the class and the outside world**, and this contract is enforced at build time by the compiler.

9. Interfaces are also good when you want to have something similar to multiple inheritance, since you can implement multiple interfaces.

10. By introducing interfaces into your program, you are realy introduce points of variation at which you can plug in different implementations for that 
    interface. An interfaces primary purpose is abstraction, decoupling the "What" from the how.
	
11. NOTE: Since Java 8 interfaces can contain default methods. In other words methods with implementation. The keyword default is used (mostly for backwards 
    compatability), and static methods as well before Java 8 that was not possible.

12. NOTE: Since Java 9 an interfaces can also contain private methods (commonly used when two default methods in an interface share common code)

13. Use an interface **when you expect that unrelated classes will implement your interface. For example, the intefaces Comparable and Clonable are implemented by many unrelated classes **.

14. You want to specify behavior pf a particular data type, but you are not concerned about who implements its behavior.

15. The Collections API is an excellent example, we have the List interface and ArrayList and LinkedList implementations.

**Abstract Class**

1. An abstract class can extend only one class or one abstract class at a time
2. An abstract class can extend another concrete (regular) class or abstract class
3. An abstract class can have both abstract and concrete methods
4. In abstract class keyword “abstract” is mandatory to declare a method as an abstract
5. An abstract class can have protected and public abstract methods
6. An abstract class can have static, final or static final variable with any access specifier

**Interface**

1. An interface can extend any number of interfaces at a time
2. An interface can only extend another interface
3. An interface can have only abstract methods
4. In an interface keyword “abstract” is optional to declare a method as an abstract
5. An interface can have only have public abstract methods
6. Interface can only have public static final (constant) variable
