//Interface
interface Interf {
    public int squareIt(int x);
}

//Implementation class (won't be needed, if we used lambda expression. e.g. WithLambda2.java)
class Demo implements Interf {
    public int squareIt(int x) {
        return x*x;
    }
}

class Test {
    public static void main(String[] args) {
        Interf i = new Demo();
        System.out.println(i.squareIt(4));
        System.out.println(i.squareIt(5));
    }
}