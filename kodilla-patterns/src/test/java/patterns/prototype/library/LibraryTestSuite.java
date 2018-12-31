package patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class LibraryTestSuite {

    @Test
    public void testGetBooks() {

        // Given - creating Library
        Library library1 = new Library("Bibliteka 1");
        String author = "author";
        String title = "Title";
        LocalDate publicationDate = LocalDate.now();

        IntStream.iterate(1, n -> n + 1)
                .limit(15)
                .forEach(n -> library1.getBooks().add(new Book("" + title + n, "" + author + n, publicationDate.minusYears(n))));

        for(Book book: library1.getBooks()) {
            System.out.println(book);
        }

        //shallowCopy
        Library library2 = null;
        try {
            library2 = library1.shallowCopy();
            library2.setName("Biblioteka 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //deepCopy
        Library library3 = null;
        try {
            library3 = library1.deepCopy();
            library3.setName("Biblioteka 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        // When
        library1.getBooks().clear();

        //Then
        Assert.assertEquals(0, library1.getBooks().size());
        Assert.assertEquals(0, library2.getBooks().size());
        Assert.assertEquals(15, library3.getBooks().size());
        System.out.println("Correct result.");
    }
}
