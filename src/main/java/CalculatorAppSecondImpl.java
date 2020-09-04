import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public class CalculatorAppSecondImpl {

    public static abstract class Arithmetic {
        public abstract double apply(double x, double y);
    }

    public static class Add extends Arithmetic {
        public double apply(double x, double y) {
            return x + y;
        }
    }

    public static class Subtract extends Arithmetic {
        public double apply(double x, double y) {
            return x - y;
        }
    }

    public static class Multiply extends Arithmetic {
        public double apply(double x, double y) {
            return x * y;
        }
    }

    public static class Divide extends Arithmetic {
        public double apply(double x, double y) {
            return x / y;
        }
    }
}
