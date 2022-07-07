import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test

    public void testGetLinks1() throws IOException {

        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("https://something.com");
        expected.add("some-thing.html");
        assertEquals(expected, links);

    }


    @Test
    public void testGetLinks3() throws IOException {

        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("more text here");
        assertEquals(expected, links);

    }


    @Test
    public void testGetLinks5() throws IOException {

        Path fileName = Path.of("test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);

        ArrayList<String> expected = new ArrayList<>();
        expected.add("page.com");
        assertEquals(expected, links);

    }

}