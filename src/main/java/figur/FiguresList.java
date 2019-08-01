package figur;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum FiguresList {

    CIRCLE,
    SQUARE,
    TRIANGLE;

    private static final List<FiguresList> VALUES = Collections.unmodifiableList(Arrays.asList(values()));

    private static final int size = VALUES.size();
    private static final Random random = new Random();

    public static FiguresList randomFigur() {
        return VALUES.get(random.nextInt(size));
    }
}
