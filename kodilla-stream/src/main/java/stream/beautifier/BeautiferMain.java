package stream.beautifier;
import java.lang.*;

public class BeautiferMain {
    public static void main(String[] args) {
        PoemBeautifier textToDecorate = new PoemBeautifier();

        textToDecorate.beautify("  Dekorujemy ten tekst  ", (text) -> "***|| " + text + " ||***" );
        textToDecorate.beautify("  Dekorujemy ten tekst  ", (text) -> " Clear  "+ text.trim() );
        textToDecorate.beautify("  Dekorujemy ten tekst  ", (text) -> text.toUpperCase() );
        textToDecorate.beautify("  Dekorujemy ten tekst  ", (text) -> "ABC " + text.toLowerCase() + " ABC" );
    }
}
