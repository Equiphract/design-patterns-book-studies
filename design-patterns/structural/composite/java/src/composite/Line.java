package composite;

import java.util.LinkedList;
import java.util.List;

public class Line implements TextComponent {

    List<Letter> letters = new LinkedList<>();

    @Override
    public void write() {
        letters.forEach(Letter::write);
        System.out.println();
    }

    @Override
    public void add(TextComponent component) {
        letters.add((Letter) component);
    }

    @Override
    public void remove(TextComponent component) {
        letters.remove(component);
    }

    @Override
    public TextComponent getChild(Index childIndex) {
        return letters.get(childIndex.value);
    }

}
