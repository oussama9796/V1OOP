package Test3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VliegtuigTest {
    public static void main(String[] arg) {

        Vliegtuig v1 = new Vliegtuig("Boeing", 2, "123");
        Vliegtuig v2 = new Vliegtuig("Boeing", 2, "123");
        Vliegtuig v3 = new Vliegtuig("Boeing747", 8, "7855");


        System.out.println(v1.equals(v2));
        System.out.println(v1.equals(v3));



    }



}