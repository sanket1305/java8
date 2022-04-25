// we are using lambda function here... thus only 1 class sufficient
// in this code we have 2 threads:- main thread and child thread
// main thread starts on calling of main function... child thread gets called when we create Thread object and pass argument in it
// which thread will execute depedns on each machine and their job scheduler (Multi-threading). But both wil complete for sure.

class ThreadsDemo2 {
    public static void main(String[] args) {
        Runnable r = () -> {
            for(int i=0;i<10;i++) {
                System.out.println("child thread");
            }
        };
        Thread t = new Thread(r);
        t.start();

        for(int i=0; i<10;i++) {
            System.out.println("main thread");
        }
    }
}
