import java.util.Arrays;

public class TheoremViet {

    public static void main(String[] args) {
        // ax2 + bx + c = 0

        // x2 + 7x + 12 = 0   x1*x2=12   x1+x2=-7
        System.out.println(Arrays.toString(solveQuiation(1,7,12)));

        // x2 - 8x + 12 = 0   x1*x2=12   x1+x2=-8
        System.out.println(Arrays.toString(solveQuiation(1,-8,12)));

        // x2 - 6x + 9 = 0   x1*x2=12   x1+x2=-7
        System.out.println(Arrays.toString(solveQuiation(1,-6,9)));

        // x2 - 2x - 3 = 0   x1*x2=-3   x1+x2=2
        System.out.println(Arrays.toString(solveQuiation(1,-2,-3)));

        // x2 + 12x + 36 = 0   x1*x2=36   x1+x2=-12
        System.out.println(Arrays.toString(solveQuiation(1,-12,36)));
    }

    private static String[] solveQuiation(int a, int b, int c) {
        String resArray[] = new String[2];
        int count = 0;

        int limit = Math.max(Math.abs(b), Math.abs(c));
        for (int i = -limit; i <= limit;i++) {
            for (int j = -limit; j <= limit ;j++) {
                if(i*j==c && i+j==-b){
                    resArray[count] = "x1="+i + " "+ "x2=" + j;
                    count++;
                }
            }
        }
        return resArray;
    }
}
