import java.util.*;

class AsciiCharSequence implements CharSequence {
    byte[] str;

    public AsciiCharSequence(byte[] str) {
        this.str = str.clone();
    }

    @Override
    public int length() {
        return str.length;
    }

    @Override
    public char charAt(int index) {
        return (char) str[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return new AsciiCharSequence(Arrays.copyOfRange(str, start, end));
    }

    @Override
    public String toString() {
        return new String(str);
    }
}