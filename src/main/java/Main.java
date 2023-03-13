public class Main {
    public static void main(String[] args) {

        int a = 10;
        double b = 2.8D;

        double result1 = a + b*2 - (a/b) % 2;
        System.out.println(result1);

        boolean result2 = (a <= b*3) && (b-1 > a*3);
        System.out.println(result2);

        if (result1 == 8 || result2) {
            System.out.println("wow!");
        }
        else {
            System.out.println("That is fantastic!");
        }

        int maxInt = 2147483647;
        int resultOverflow = maxInt + 1;
        System.out.println(resultOverflow);

    }
}


