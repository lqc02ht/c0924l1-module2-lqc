package ss4_oop.stop_watch;

public class StopWatch {
    private long startTime;
    private long endTime;
    // constructor
    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }
    // start
    public void start() {
        this.startTime = System.currentTimeMillis();
    }
    // end
    public void stop() {
        this.endTime = System.currentTimeMillis();
    }
    // getElapsedTime
    public long getElapsedTime() {
        return endTime - startTime;
    }
    // getter
    public long getStartTime() {
        return startTime;
    }
    public long getEndTime() {
        return endTime;
    }
}
