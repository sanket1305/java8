//No need of Implementation class like WithoutLambda.java

interface Interf {
    public void m1();
}

class WithLambda {
    public static void main(String[] args) {
        Interf i = () -> System.out.println("m1 method implementation");;
        i.m1();
    }
}