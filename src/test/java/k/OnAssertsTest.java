package k;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class OnAssertsTest {

    @Test
    void useCorrectAssertNull() {
        Object actual = callActualMethod();

        assertEquals(null, actual);
        assertTrue(actual == null);
    }

    @Test
    void useCorrectAssertBoolean() {
        int expected = 5;
        int actual = 2 + 3;

        assertTrue(expected == actual);
    }

    @Test
    void useCorrectOrder() {
        int expected = 5;
        int actual = 2 + 3;

        // todo: fix the order
        assertEquals(actual, expected);
    }

    Object callActualMethod() {
        return null;
    }

}
