package core.basesyntax;

import java.util.Random;

public class Lottery {

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();
    private static final int MAX_SIZE = 101;

    public Ball getRandomBall() {

        return new Ball(colorSupplier.getRandomColor(), random.nextInt(MAX_SIZE));
    }
}

