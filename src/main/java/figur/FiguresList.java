package figur;

import java.util.Random;

public enum FiguresList {

    CIRCLE,
    SQUARE,
    TRIANGLE;

    public static FiguresList randomFigur() {
        return values()[new Random().nextInt(values().length)];
    }
}
