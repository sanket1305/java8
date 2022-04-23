//This code will show the use of @FunctionalInterface Annotation

@FunctionalInterface
interface interf {
    //First Abstract Method
    public void m1();

    //Second Abstract Method, which will throw error (as its not functional interface)
    public void m2();
}
