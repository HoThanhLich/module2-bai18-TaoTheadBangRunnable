public class RunnableDemo implements Runnable {
    private Thread t;
    private final String threadName;

    public RunnableDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("running " + threadName);

    }

    public void start() {
        System.out.println("Starting "+ threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
