Java Inner Class or nested class is a class i.e. declare inside the class or interface.
We use inner classes to logically group classes and interfaces in one place so that it can be more readable and maintainable.
Additionally, it can access all the members of outer class including private data members and methods.

Nested Inner class can access any private instance variable of outer class. 
Like any other instance variable, we can have access modifier private, protected, public and default modifier.

We can’t have static method in a nested inner class because an inner class is implicitly associated with an object of its outer class 
so it cannot define any static method for itself.

**Method Local inner classes**

Inner class can be declared within a method of an outer class. 

**Like class, interface can also be nested and can have access specifiers.**



**Static Nested Class**

A static inner class is a nested class which is a static member of the outer class. 
It can be accessed without instantiating the outer class, using other static members. 
Just like static members, a static nested class does not have access to the instance variables and methods of the outer class. 


**Advantage of java inner classes**

There are basically three advantages of inner classes in java. They are as follows:
1) Nested classes represent a special type of relationship that is it can access all the members (data members and methods) of outer class including private.
2) Nested classes are used to develop more readable and maintainable code because it logically group classes and interfaces in one place only.
3) Code Optimization: It requires less code to write.

**Anonymous inner classes**

Anonymous inner classes are declared without any name at all. They are created in two ways.
a) As subclass of specified type

```
class Demo { 
   void show() { 
      System.out.println("i am in show method of super class"); 
   } 
} 
class Flavor1Demo { 
  
   //  An anonymous class with Demo as base class 
   static Demo d = new Demo() { 
       void show() { 
           super.show(); 
           System.out.println("i am in Flavor1Demo class"); 
       } 
   }; 
   public static void main(String[] args){ 
       d.show(); 
   } 
}
```

b) As implementer of the specified interface

```
class Flavor2Demo { 
  
    // An anonymous class that implements Hello interface 
    static Hello h = new Hello() { 
        public void show() { 
            System.out.println("i am in anonymous class"); 
        } 
    }; 
  
    public static void main(String[] args) { 
        h.show(); 
    } 
} 
  
interface Hello { 
void show();
}
```