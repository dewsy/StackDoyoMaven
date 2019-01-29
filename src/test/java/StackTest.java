import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {


    Stack testStack = new Stack(Integer.TYPE, 5);


    @Test
    void simplePushTest() {
        testStack.push(1);
    }

    @Test
    void pop() {
    }

    @Test
    void peek() {
    }
}