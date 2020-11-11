import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextProcessorTest{

    @Disabled("@DisplayName ignored")
    @DisplayName("TextProcessorTest - Labb2")

    @BeforeAll
    public static void msg(){
        System.out.println("Detta skrevs ut med BeforeAll");
    }

    @RepeatedTest(3)
    void testLowerCase(){
        String str = "ABC";
        TextProcessor textProcessor = new TextProcessor();
        assertEquals(textProcessor.lowerCase(str), str.toLowerCase());
    }

    @Test
    void testUpperCase(){
        String str = "abc";
        TextProcessor textProcessor = new TextProcessor();
        assertEquals(textProcessor.lowerCase(str), str.toLowerCase());
    }

    @Test
    void testReverseString(){
        String str = "ABC";
        String reversed = "CBA";
        TextProcessor textProcessor = new TextProcessor();
        assertEquals(textProcessor.reverseString(str), reversed);
    }


}