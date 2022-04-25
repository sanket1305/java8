//Interface
interface Interf {
    public void add(int a, int b);
}

//Implementation class (won't be needed, if we used lambda expression. e.g. WithLambda1.java)
class Demo implements Interf {
    public void add(int a, int b) {
        System.out.println("The Sum: " + (a+b));
    }
}

class Test {
    public static void main(String[] args) {
        Interf i = new Demo();
        i.add(10, 20);
        i.add(100, 200);
    }
}