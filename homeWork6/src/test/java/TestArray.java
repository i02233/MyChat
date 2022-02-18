import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestArray {
    @Test
    public void test1arrayAfter4() {
        int[] in = new int[]{1, 3, 4, 5, 5, 6, 8};
        int[] out = new int[]{5, 5, 6, 8};
        Assertions.assertArrayEquals(out, MyClass.arrayAfter4(in));
    }

    @Test
    public void test2arrayAfter4() {
        int[] in = new int[]{1, 3, 5, 5, 6, 8};
        Assertions.assertThrows(RuntimeException.class, () -> {
            MyClass.arrayAfter4(in);
        });
    }

    @Test
    public void test1arrayContainsOnly1and4() {
        int[] in = new int[]{1, 3, 4, 5};
        Assertions.assertFalse(MyClass.arrayContainsOnly1and4(in));
    }

    @Test
    public void test2arrayContainsOnly1and4() {
        int[] in = new int[]{1, 4, 1};
        Assertions.assertTrue(MyClass.arrayContainsOnly1and4(in));
    }

}

