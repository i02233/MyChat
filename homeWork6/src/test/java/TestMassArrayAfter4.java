import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestMassArrayAfter4 {
    public static Stream<Arguments> dataForAfter4() {
        List<Arguments> list = new ArrayList<>();
        list.add(Arguments.arguments(new int[]{2, 5, 4, 7, 8}, new int[]{7, 8}));
        list.add(Arguments.arguments(new int[]{1, 1, 4}, new int[]{}));
        list.add(Arguments.arguments(new int[]{2, 5, 4, 7, 8, 4}, new int[]{}));
        list.add(Arguments.arguments(new int[]{2, 5, 4, 7, 4, 8}, new int[]{8}));
        return list.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForAfter4")
    public void massTestArrayAfter4(int[] in, int[] out) {
        Assertions.assertArrayEquals(out, MyClass.arrayAfter4(in));
    }
}
