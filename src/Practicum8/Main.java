package Practicum8;

public class Main {

    public static void main(String[] args) {

        BedrijfsInventaris bedrijfsInventaris1 = new BedrijfsInventaris("HU" , 500.00);
        Computer computer1 = new Computer("Macbook", "00-14-75-7B-BB", 1500.00, 2021);
        Computer computer2 = new Computer("Dell", "00-14-75-7B-BB", 1500.00, 2021);
        Fiets fiets1 = new Fiets(123456, "Gazelle", 8000.00, 2022);
        Auto auto2 = new Auto("Mercedes-Benz G-klasse G 500", 100985.00, 2020, "5-AFV-56");
        Computer computer3 = new Computer("Lenovo", "12-34-56-7B-KK", 600.00, 2019);
        Fiets fiets2 = new Fiets(852696, "Volare", 450.00, 2017);
        Auto auto3 = new Auto("Opel Astra", 19085.00, 2006, "7-HBG-78");

        bedrijfsInventaris1.schafAan(computer1);
        bedrijfsInventaris1.schafAan(computer2);
        bedrijfsInventaris1.schafAan(computer3);

        System.out.println(bedrijfsInventaris1);



    }



}
