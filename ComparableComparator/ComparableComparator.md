**Comparable vs Comparator**

Java provides two interfaces to sort objects using data members of the class: 
1. Comparable
2. Comparator 

** Using Comparable Interface**

A comparable object is capable of comparing itself with another object. 

The class itself must implements the java.lang.Comparable interface to compare its instances. 

public int compareTo(Object obj){ }

Comparable interface used for natural sorting these is the reason all wrapper classes and string class implementing this comparator 
and overriding compareTo(Object obj) method.

So in String and all wrapper classes compareTo(Object  obj) method is implemented in such way that it will sort all objects.


Consider a Movie class that has members like, rating, name, year. Suppose we wish to sort a list of Movies based on year of release. 
We can implement the Comparable interface with the Movie class, and we override the method compareTo() of Comparable interface. 

```
class Movie implements Comparable<Movie> 
{ 
    private double rating; 
    private String name; 
    private int year; 
	
	// Used to sort movies by year 
    public int compareTo(Movie m) 
    { 
        return this.year - m.year; 
    } 
}
```

Now, suppose we want sort movies by their rating and names also. When we make a collection element comparable(by having it implement Comparable),
we get only one chance to implement the compareTo() method. The solution is using Comparator.

** Using Comparator Interface**

Unlike Comparable, Comparator is external to the element type we are comparing. It’s a separate class. 
We create multiple separate classes (that implement Comparator) to compare by different members.

Collections class has a second sort() method and it takes Comparator. The sort() method invokes the compare() to sort objects.

To compare movies by Rating, we need to do 3 things :
1. Create a class that implements Comparator (and thus the compare() method that does the work previously done by compareTo()).
2. Make an instance of the Comparator class.
3. Call the overloaded sort() method, giving it both the list and the instance of the class that implements Comparator.


```
// Class to compare Movies by ratings 
class RatingCompare implements Comparator<Movie> 
{ 
    public int compare(Movie m1, Movie m2) 
    { 
        if (m1.getRating() < m2.getRating()) return -1; 
        if (m1.getRating() > m2.getRating()) return 1; 
        else return 0; 
    } 
} 
  
// Class to compare Movies by name 
class NameCompare implements Comparator<Movie> 
{ 
    public int compare(Movie m1, Movie m2) 
    { 
        return m1.getName().compareTo(m2.getName()); 
    } 
} 
  
```

***Summary***

Comparable is meant for objects with natural ordering which means the object itself must know how it is to be ordered. 
For example Roll Numbers of students. 

Whereas, Comparator interface sorting is done through a separate class.

Logically, Comparable interface compares "this" reference with the object specified and Comparator in Java compares two different class objects provided.

If any class implements Comparable interface in Java then collection of that object either List or Array can be sorted automatically by using 
Collections.sort() or Arrays.sort() method and objects will be sorted based on there natural order defined by CompareTo method.

***To summarize, if sorting of objects needs to be based on natural order then use Comparable whereas if you sorting needs to be done on attributes of different objects, then use Comparator in Java.***

