package composite;

public class Letter implements TextComponent {

    private final char letter;

    public Letter(char letter) {
        this.letter = letter;
    }

    @Override
    public void write() {
        System.out.print(letter);
    }

    @Override
    public void add(TextComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(TextComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public TextComponent getChild(Index childIndex) {
        throw new UnsupportedOperationException();
    }

}
