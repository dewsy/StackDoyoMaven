import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {


    Stack testStack = new Stack(Integer.class, 5);


    @Test
    void simplePushTest() {
        testStack.push(1);
        testStack.push(1);
        testStack.push(1);
        assertEquals("1, 1, 1, null, null", testStack.toString());
    }

    @Test
    void pushThrowsStackOverflow(){
        testStack.push(1);
        testStack.push(1);
        testStack.push(1);
        testStack.push(1);
        testStack.push(1);
        assertThrows(StackOverflow.class, ()-> {testStack.push(1);});
    }

    @Test
    void popPopsTest() {
        testStack.push(1);
        testStack.push(1);
        assertEquals(1, testStack.pop());
    }

    @Test
    void popRemovesTest() {
        testStack.push(1);
        testStack.pop();
        assertEquals("null, null, null, null, null", testStack.toString());
    }

    @Test
    void popThrowsStackUnderflow(){
        assertThrows(StackUnderflow.class, ()-> {testStack.pop();});
    }

    @Test
    void emptyStackReturnsNullOnPeakTest() {
        assertEquals(null, testStack.peek());
    }

    @Test
    void peekTest(){
        testStack.push(1);
        assertEquals(1, testStack.peek());
    }
}