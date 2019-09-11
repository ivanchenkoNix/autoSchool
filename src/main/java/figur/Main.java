package figur;

import java.util.Comparator;

import static java.util.Arrays.stream;

public class Main {

    public static void main(String[] args) {
        Figur[] figureArray = new Figur[10];
        Factory factory = new Factory();

        for (int i = 0; i < figureArray.length; i++) {
            figureArray[i] = factory.getFigure(FiguresList.randomFigur());
        }

        Figur[] sorted = stream(figureArray).sorted(Comparator.comparing(Figur::area)).toArray(Figur[]::new);

        for (Figur figur : sorted) {
            System.out.println("Area:\t" + figur.area() + "\tName:\t" + figur.getName());
        }
    }
}
