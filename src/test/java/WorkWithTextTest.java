import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WorkWithTextTest {

    @Test
    void readFromFileTest() throws IOException {
        WorkWithText workWithText = new WorkWithText();
        ArrayList<String> actual = workWithText.readFromFile("text.txt");
        List<String> expected = List.of("Hello","Its","Me","Mario");
        assertEquals(expected,actual);
    }
    @Test
    void sortTest() {
        WorkWithText workWithText = new WorkWithText();
        List<String> startList = List.of("s1444d","241","1  6");
        ArrayList<String> actual = new ArrayList<>();
        actual.addAll(startList);
        workWithText.sort(actual);
        List<String> expected = List.of("241","1  6","s1444d");
        assertEquals(expected,actual);
    }

    @Test
    void writeToFileTest() throws IOException {
        WorkWithText workWithText = new WorkWithText();
        List<String> text = List.of("Hello","Its","Me","Mario");
        ArrayList<String> result = new ArrayList<>();
        result.addAll(text);
        workWithText.writeToFile(result,"testWrite.txt");
        ArrayList<String> actual = workWithText.readFromFile("testWrite.txt");
        List<String> expected = List.of("Hello","Its","Me","Mario");
        assertEquals(expected,actual);
    }
}