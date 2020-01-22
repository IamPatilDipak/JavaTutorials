package com.iampatildipak;

class AnonymousInner {
    public void myMethod() {
        System.out.println("This is  anonymous super class");
    }
}

//abstract class AnonymousInner {
//    public abstract void myMethod();
//}

//interface AnonymousInner {
//    void myMethod();
//}


public class Anonymous {

    public void test() {
        AnonymousInner inner = new AnonymousInner() {
            public void myMethod() {
                System.out.println("This is an example of anonymous inner class");
            }
        };
        inner.myMethod();
    }
}