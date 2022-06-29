package Practicum8;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Utils {
    private static int aantalUtils = 0;

    public static String euroBedrag(double bedrag) {
        NumberFormat bedrFormat = NumberFormat.getCurrencyInstance();
        aantalUtils++;
        return bedrFormat.format(bedrag);
   }

    public static String euroBedrag(double bedrag, int precisie) {
        String pattern = "€ #,##0.";
        int i;
        for(i = 0; i < precisie; ++i) {
            pattern += "0";
        }
        DecimalFormat percFormat = new DecimalFormat(pattern);
        aantalUtils++;
        return percFormat.format(bedrag);
    }

    public static int getAantalUtils() {
        return aantalUtils;
    }

    public static void main(String[] args) {
        String euro1 = euroBedrag(3.11314, 1);
        System.out.println("euro = " + euro1);
        String euro2 = euroBedrag(3.11314, 2);
        System.out.println("euro = " + euro2);
        String euro3 = euroBedrag(3.11314, 3);
        System.out.println("euro = " + euro3);
        String euro4 = euroBedrag(3.11314, 4);
        System.out.println("euro = " + euro4);
        String euro5 = euroBedrag(3.11314);
        System.out.println("euro = " + euro5);
        System.out.println(getAantalUtils());
    }
}
