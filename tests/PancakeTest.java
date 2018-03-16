import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PancakeTest {
    Pancake pancake;
    int[] test2 = {4, 3, 2, 1, 5};
    int[] test3 = {3, 4, 2, 1, 5};
    @Before
    public void setUp() {
        int[] test1 = {1, 2, 3, 4, 5};
        pancake = new Pancake(test1);
    }

    @Test
    public void flip() {
        pancake.flip(3);
        assertArrayEquals(pancake.getTableOfPancakes(), test2);
        pancake.flip(1);
        assertArrayEquals(pancake.getTableOfPancakes(), test3);
    }

    @Test
    public void sort() {
    }
}
