//Interface
interface Interf {
    public void m1();
}

//Implementation class (won't be needed, if we used lambda expression. e.g. WithLambdaExpression.java)
class Demo implements Interf {
    public void m1() {
        System.out.println("m1 method implementation");
    }
}

class Test {
    public static void main(String[] args) {
        Interf i = new Demo();
        i.m1();
    }
}