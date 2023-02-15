package composite;

interface TextComponent {
    public void write();
    public void add(TextComponent component);
    public void remove(TextComponent component);
    public TextComponent getChild(Index childIndex);
}
