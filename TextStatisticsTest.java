package textstatistics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextStatisticsTest {

    @Test
    public void testEmpty() {
        TextStatistics stats = new TextStatistics();
        assertEquals(0, stats.getLineCount());
        assertEquals(0, stats.getCharCount());
    }

    @Test
    public void testSingleLine() {
        TextStatistics stats = new TextStatistics();
        stats.addLine("Hej");
        assertEquals(1, stats.getLineCount());
        assertEquals(3, stats.getCharCount());
    }

    @Test
    public void testMultipleLines() {
        TextStatistics stats = new TextStatistics();
        stats.addLine("Hej");
        stats.addLine("på dig");
        assertEquals(2, stats.getLineCount());
        assertEquals(10, stats.getCharCount());
    }
}
