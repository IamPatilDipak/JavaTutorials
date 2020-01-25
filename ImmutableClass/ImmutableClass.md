** How to create Immutable class in Java? **

Immutable class means once an object is created, we can not change its content.
In Java, all the wrapper classes (like Integer, Boolean, Double, etc) and String class is immutable.

Following are the characteristics:
1. The class must be declared as ***final*** , so that child classes cannot be created.
2. Data memebers in the class must be declared ***final*** ,so that we can not change the value of it after object creation.
3. A parameterized constructor which accepts data
4. Getter method for all private variables
5. No setters, so that no one can get a chance to alter value of instance variable. 