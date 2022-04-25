//No need of Implementation class like WithoutLambda1.java

interface Interf {
    public void add(int a, int b);
}

class Test {
    public static void main(String[] args) {
        Interf i = (a, b) -> System.out.println("The Sum: " + (a+b));;
        i.add(10, 20);
        i.add(100, 200);
    }
}