package stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator p) {
        String result = p.decorate(text);
        System.out.println("Our conncept for decorated text: " + result);
    }
}
