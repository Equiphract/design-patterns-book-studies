package composite;

import java.util.LinkedList;
import java.util.List;

public class Document implements TextComponent {

    List<TextComponent> textComponents = new LinkedList<>();

    @Override
    public void write() {
        textComponents.forEach(TextComponent::write);
    }

    @Override
    public void add(TextComponent component) {
        textComponents.add(component);
    }

    @Override
    public void remove(TextComponent component) {
        textComponents.remove(component);
    }

    @Override
    public TextComponent getChild(Index childIndex) {
        return textComponents.get(childIndex.value);
    }

}
