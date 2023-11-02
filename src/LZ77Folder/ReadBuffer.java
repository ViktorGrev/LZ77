package LZ77Folder;

public class ReadBuffer {
    private byte bits;
    private int pos = 8;

    public int length() {
        return 8 - pos;
    }

    public void refill(byte value) {
        bits = value;
        pos = 0;
    }

    public boolean isEmpty() {
        return pos == 8;
    }

    public int nextBit() {
        return bits >> pos++ & 1;
    }
}
