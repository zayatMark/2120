class GymRecord<T> {
    private final T sessionType;
    private final int duration;

    public GymRecord(T sessionType, int duration) {
        this.sessionType = sessionType;
        this.duration = duration;
    }

    public T getSessionType() {
        return sessionType;
    }

    public int getDuration() {
        return duration;
    }
}
