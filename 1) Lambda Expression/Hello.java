// Simple Hello Program

interface HelloWorld {
    public void sayHello();
}

class Hello {
    public void m1() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        //Normal method in java
        Hello h = new Hello();
        h.m1();

        //Same method as lambda expression below
        HelloWorld helloWorld = () ->  System.out.println("Hello");
        helloWorld.sayHello();
    }
}