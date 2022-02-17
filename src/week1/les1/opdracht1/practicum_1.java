package week1.les1.opdracht1;

public class practicum_1 {
    public practicum_1() {
    }

    public static void main(String[] arg) {
        int j;
        for(j = 1; j < 11; ++j) {
            System.out.println(j);
        }

        for(j = 1; j < 11; ++j) {
            System.out.println(j);
        }

        int sum = 0;

        int i;
        for(i = 1; i < 40; ++i) {
            sum += i;
        }

        System.out.println(sum);

        for(i = 0; i < 10; ++i) {
            double number = Math.random();
            System.out.println(number);
        }

        for(i = 0; i < 4; ++i) {
            if (i % 2 != 0) {
                System.out.println("ss");
            } else {
                System.out.println("s");
            }
        }

    }
}

