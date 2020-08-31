public class PrintPattern {
    public static void main(String[] args) {
        printRightTriangle();
        System.out.println();
        System.out.println("#############################");

        printInvertedRightTriangle();
        System.out.println();
        System.out.println("#############################");

        printRightTriangle();
        System.out.println();
        System.out.println("#############################");

        printAlignedRightTriangle();
        System.out.println();
        System.out.println("#############################");

        printAlignedInvertedRightTriangle();
        System.out.println();
        System.out.println("#############################");

        printRectangle();
        System.out.println();
        System.out.println("#############################");

        printInvertedZ();
        System.out.println();
        System.out.println("#############################");

        printZ();
        System.out.println();
        System.out.println("#############################");

        printSandClock();
        System.out.println();
        System.out.println("#############################");

        printSandClockIntoRectangle();
        System.out.println();
        System.out.println("#############################");

    }


    private static void printRightTriangle() {
        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int j = 0; j < 9; j++) {
                if (i >= j) {
                    System.out.print("*");
                }
            }
        }
    }

    private static void printInvertedRightTriangle() {
        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int j = 0; j < 9; j++) {
                if (i <= j) {
                    System.out.print("*");
                }
            }
        }

    }

    private static void printAlignedRightTriangle() {
        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int j = 0; j < 9; j++) {
                if (i < j) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
    }

    private static void printAlignedInvertedRightTriangle() {
        for (int i = 0; i < 9; i++) {
            System.out.println();
            for (int j = 0; j < 9; j++) {
                if (i > j) {
                    System.out.print("*");
                } else System.out.print(" ");
            }
        }
    }

    private static void printRectangle() {
        for (int i = 0; i < 9; i++) {
            System.out.println(" ");
            for (int j = 0; j < 9; j++) {
                if (i == 0) {
                    System.out.print("* ");
                } else if (i == 8) {
                    System.out.print("* ");
                } else if (j == 0 || j == 8) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }

    private static void printInvertedZ() {
        for (int i = 0; i < 9; i++) {
            System.out.println(" ");
            for (int j = 0; j < 9; j++) {
                if (i == 0) {
                    System.out.print("* ");
                } else if (i == 8) {
                    System.out.print("* ");
                } else if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }

    private static void printZ() {
        for (int i = 0; i < 9; i++) {
            System.out.println(" ");
            for (int j = 0; j < 9; j++) {
                if (i == 0) {
                    System.out.print("* ");
                } else if (i == 8) {
                    System.out.print("* ");
                } else if (j + i == 8) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }

    private static void printSandClock() {
        for (int i = 0; i < 9; i++) {
            System.out.println(" ");
            for (int j = 0; j < 9; j++) {
                if (i == 0) {
                    System.out.print("* ");
                } else if (i == 8) {
                    System.out.print("* ");
                } else if (j + i == 8) {
                    System.out.print("* ");
                } else if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }

    private static void printSandClockIntoRectangle() {
        for (int i = 0; i < 9; i++) {
            System.out.println(" ");
            for (int j = 0; j < 9; j++) {
                if (i == 0) {
                    System.out.print("* ");
                } else if (i == 8) {
                    System.out.print("* ");
                } else if (j + i == 8) {
                    System.out.print("* ");
                } else if (j == i) {
                    System.out.print("* ");
                } else if (j == 0 || j == 8) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
        }
    }


}
