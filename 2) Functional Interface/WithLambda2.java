//No need of Implementation class like WithoutLambda2.java

interface Interf {
    public int squareIt(int x);
}

class Test {
    public static void main(String[] args) {
        Interf i = x -> x*x;
        System.out.println(i.squareIt(4));
        System.out.println(i.squareIt(6));
    }
}