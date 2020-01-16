**What is difference between For and While Loop? When to use which one?**

Take an example, I want to peel one hundred oranges, how would you do it in real life? 
You probably will start peeling the first orange, and then you say "1", then you peel the next orange and say "2" until you say "100" right?

The iterative steps are easier to be translated and implemented using "for loop". since it is related to countable and iterable.

```
for (int i=0; i<100; i++) {
  oranges[i].peel();
}
```

The same function that is implemented using "while loop"

```
int i = 0;
while (i < 100) {
   oranges[i++].peel();
}
```

Which one is more simple and get to the point? I would pick the first one since it is one coding line less. In addition, the drawback for the while loop is the variable "i" was not cleaned up beyond the looping scope, which potentially a cause of bugs later on.
Another example is to loop through a collection of items. It is just straight forward to use "for loop" again:

```
for (Orange o: oranges) {
   o.peel();
}
```
compared to the while loop version:

```
Iterator iter = oranges.iterator();
while (iter.hasNext()) {
	iter.next().peel();
}
```
Which one was more simple and readable?
Another drawback using iterator is that it is easy to introduce an infinite loop to the program like this:

```
while (oranges.iterator().hasNext()) {
	oranges.iterator().next().peel();
}
```
So, when should we use while loop? It is quite obvious to understand why it is called "while", i.e. Keep peeling while there are no more oranges in the bucket, or keep peeling the oranges until the bell rings.

The above conditions are non-deterministic:
We don’t know how many oranges in the bucket ahead of time.
We don't know when will the bell ring.

Fundamentally, the above statements don’t match with the "for loop" paradigm, however, the "while" concepts excel here. We can implement the statements pretty straight forward:

```
while (bucket.hasMoreOranges()) {
  bucket.pickOne().peel();
}
```
and the second example can be implemented like this:

```
while (!bell.hasRing()) {
	if (bucket.has MoreOranges())
		bucket.pickOne().peel();
	else
		wait(ONE_MINUTE);
    }
}
```

**To summarise the above examples and illustrations:**

Use for loop for something that is deterministic:
something that is countable or iterable with known quantities.
Use while loop for something that is nondeterministic:
keep doing something until one or more event(s) happens.
keep doing something until the change of variable states.
keep doing something until one or more condition(s) is/are met.
