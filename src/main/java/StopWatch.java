public final class StopWatch {

    private long startNanos;
    private long stopNanos;
    private long ellapsedNanos;

    public StopWatch() {
        startNanos = System.nanoTime();
    }

    public void restart() {
        startNanos = System.nanoTime();
    }

    public long stop() {
        stopNanos = System.nanoTime();
        ellapsedNanos = stopNanos - startNanos;
        return ellapsedNanos;
    }

    @Override
    public String toString() {
        return ellapsedNanos / 1000 + " ms";
    }
}
