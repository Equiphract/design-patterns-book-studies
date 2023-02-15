package composite;

public class Client {

    public static void main(String[] args) {
        Document document = new Document();
        Title title = new Title("Catchy Title");

        Paragraph paragraph1 = new Paragraph();
        paragraph1.add(createLine("This is my first paragraph."));
        paragraph1.add(createLine("It has two lines!"));

        Paragraph paragraph2 = new Paragraph();
        paragraph2.add(createLine("This is my second paragraph."));
        paragraph2.add(createLine("I am using VIM keybindings to write."));
        paragraph2.add(createLine("As should you!"));

        document.add(title);
        document.add(paragraph1);
        document.add(paragraph2);

        document.write();
    }

    private static Line createLine(String text) {
        Line line = new Line();
        text.chars().forEach(c -> line.add(new Letter((char) c)));
        return line;
    }
}
