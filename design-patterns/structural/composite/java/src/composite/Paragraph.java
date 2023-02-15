package composite;

import java.util.LinkedList;
import java.util.List;

public class Paragraph implements TextComponent {

    List<Line> lines = new LinkedList<>();

    @Override
    public void write() {
        lines.forEach(Line::write);
        System.out.println();
    }

    @Override
    public void add(TextComponent component) {
        lines.add((Line) component);
    }

    @Override
    public void remove(TextComponent component) {
        lines.remove(component);
    }

    @Override
    public TextComponent getChild(Index childIndex) {
        return lines.get(childIndex.value);
    }

}
