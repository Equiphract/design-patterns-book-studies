package composite;

public class Title implements TextComponent {

    String title;

    public Title(String title) {
        this.title = title;
    }

    @Override
    public void write() {
        System.out.print("**");
        System.out.print(title);
        System.out.println("**");
        System.out.println();
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
