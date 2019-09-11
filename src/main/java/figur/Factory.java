package figur;

public class Factory {

    private RandomsHelper randomsHelper = new RandomsHelper();

    Figur getFigure(FiguresList figuresList) {
        if (figuresList == null) {
            return null;
        }
        if (figuresList.equals(FiguresList.CIRCLE))
            return new Circle(randomsHelper.getRandomInt(12), randomsHelper.getRandomInt(12)
                    , randomsHelper.getRandomString(), randomsHelper.getRandomDouble(1, 15));
        else if (figuresList.equals(FiguresList.SQUARE))
            return new Square(randomsHelper.getRandomInt(12), randomsHelper.getRandomInt(12)
                    , randomsHelper.getRandomString(), randomsHelper.getRandomDouble(1, 15)
                    , randomsHelper.getRandomDouble(1, 15));
        else if (figuresList.equals(FiguresList.TRIANGLE))
            return new Triangle(randomsHelper.getRandomInt(12), randomsHelper.getRandomInt(12)
                    , randomsHelper.getRandomString(), randomsHelper.getRandomDouble(1, 15)
                    , randomsHelper.getRandomDouble(1, 15));
        return null;
    }
}
