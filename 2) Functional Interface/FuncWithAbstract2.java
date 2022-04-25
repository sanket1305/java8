interface Interf {
    public void m1();
    public void m2(int i);
}

class FuncWithAbstract2 {
    public static void main(String[] args) {
        Interf i = () -> System.out.println("m1 method implementation");;
        i.m1();
    }
}
