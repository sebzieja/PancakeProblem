import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PancakeTest {
    Pancake pancake;
    int[] test2;
    int[] test3;
    @BeforeAll
    public void setUp(){
        int[] test1 = {1, 2, 3, 4, 5};
        int[] test2 = {4, 3, 2, 1, 5};
        int[] test3 = {3, 4, 3, 4, 5};
        pancake = new Pancake(5, test1);
    }

    @Test
    void flip() {
        pancake.flip(3);
        assertArrayEquals(pancake.getTableOfPancakes(), test2);
        pancake.flip(1);
        assertArrayEquals(pancake.getTableOfPancakes(), test3);

    }
}