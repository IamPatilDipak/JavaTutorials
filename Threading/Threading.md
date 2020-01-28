A ***Process*** is a unit of execution that has its own memory space.

Each instance of Java Virtual Machine(JVM) runs as a process( this is not true for all JVM  implementations, but for most of them).
When we run Java Console Application or Java FX, we are kicking off a process.

Many people uses the terms process and application intechangeably. If one Java application is running and we run another one, each
application has its own memory space of ***heap***. The first Java application can not access the heap that belongs to second application.
The heap is not shared between them. They each have their own.

A ***thread*** is a unit of execution within a process. Each process can have multiple threads.

In Java, every process (or application) has at least one thread, the ***main thread*** (for UI appplications, this is called the 
***JavaFX application thread***). In fact, just about every Java process also has multiple system threads that handle tasks like
memory management and I/O.

Creating a thread does not require as many resources as creating a process. Every thread created by a process shares the process's 
memory and files. This can create problems.

In addition to the process's memory, or heap, each thread has what's called a ***thread stack***, which is the memory that only that
thread can access.

***Why would we want to use multiple threads in our aplication? Why not just stick with the main thread?***

There are two main reasons:

1. First of all, we sometimes want to perform a task that's going to take a long time. For example, we might wamt to query a database,
   or we might want to fetch data from somewhere on the internet. We could do this on the main thread, but the code within each main thread
   execute in linear fashion. The main thread won't be able to do anything else while it's waiting for the data. 

   Another way of putting this is that the execution of the main thread will be suspended. It has to wait for the data to be returned before it can execute
   the next line of code. To the user, this could appear as if our application has died or is frozen, especially when we are dealing with a UI application. 
   
2. A second reason we might want to use threads is because an API requires us to provide one. Sometimes we have to provide the code that will run
   when a method we have called reaches a certain point in it's execution. In this instance, we usually don't create the thread. We pass in the
   code that we want to run on the thread.
   
That's brings us to ***Concurrency***, which refers to an application doing more than one thing at a time. Now that doesn't necessarily mean that
the application is doing more than one thing at the same time. It means that progress can be made on more than one task. Let's say that an application
wants to download data and draw a shape on the screen.