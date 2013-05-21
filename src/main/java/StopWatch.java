public final class StopWatch {

    private long startNanos;
    private long stopNanos;
    private long ellapsedNanos;

    public StopWatch() {
        startNanos = System.nanoTime();
    }

    public void stop() {
        stopNanos = System.nanoTime();
        ellapsedNanos = stopNanos - startNanos;
    }

    @Override
    public String toString() {
        return "ellapsed time: " + ellapsedNanos / 1000 + " ms";
    }
}
