** What is difference between For and While Loop? When to use which one?**

Take an example, I want to peel one hundred oranges, how would you do it in real life? 
You probably will start peeling the first orange, and then you say "1", then you peel the next orange and say "2" until you say "100" right?

The iterative steps are easier to be translated and implemented using "for loop". since it is related to countable and iterable.

```
for (int i=0; i<100; i++) {
  oranges[i].peel();
}
```