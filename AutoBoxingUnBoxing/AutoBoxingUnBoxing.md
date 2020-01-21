Converting a **primitive data type** into an object of the corresponding **wrapper** class is called **autoboxing**. 

For example, converting int to Integer or converting long to Long object.

Java compiler applies autoboxing when a primitive value is:

- Passed as a parameter to a method that expects an object of the corresponding wrapper class. 
  For example a method with Integer argument can be called by passing int, java compiler will do the conversion of int to Integer.
  
- Assigned to a variable of the corresponding wrapper class. For example, assigning a Long object to long variable.



Converting an object of a **wrapper** type to its corresponding **primitive data type** is called **unboxing**.

Java compiler applies unboxing when an object of a wrapper class is: 

- Passed as a parameter to a method that expects a value of the corresponding primitive type.

- Assigned to a variable of the corresponding primitive type.