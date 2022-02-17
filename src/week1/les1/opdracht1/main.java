package week1.les1.opdracht1;

public class main {
    public static void main(String[] arg) {

        for (int p = 1; p < 11; p++) {
            System.out.println(p);

        }

        int j = 1;
        while (j < 11) {
            System.out.println(j);
            j++;
        }
        int sum = 0;

        for (int i = 1; i < 40; i++) {
            sum += i;
        }

        System.out.println(sum);

        for (int i = 0; i < 10; i++) {
            double number = Math.random();
            System.out.println(number);

        }

        for (int i = 0; i < 4; i++) {
            if (i % 2 != 0) {
                System.out.println("ss");
            } else {
                System.out.println("s");
            }

        }

    }

}



