interface interf {
    //Only one abstract method is allowed
    public void m1();

    //can have more number of default methods
    default void m2() {

    }

    //can have more number of statiuc methods90
    public static void m3() {

    }
}

public class Sample {
    public static void main(String[] args) {
    }    
}
