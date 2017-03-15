public abstract Buffer {
    public final int position();
    public final int limit();
    public final int capacity();

    public final Buffer position(int newPosition);
    public final Buffer limit(int newLimit);

    public final Buffer mark();
    public final Buffer reset();

    public final int remaining();
    public final boolean hasRemainig();
    public abstract boolean isReadOnly(); 
}