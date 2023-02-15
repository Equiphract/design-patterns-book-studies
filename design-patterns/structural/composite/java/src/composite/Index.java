package composite;

public class Index {
    public final int value;

    public Index(int value) {
        if (value < 0) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

}
