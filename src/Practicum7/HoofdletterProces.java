package Practicum7;

import java.util.ArrayList;
import java.util.Locale;

public class HoofdletterProces implements OpmaakProces{

    @Override
    public String maakOp(String input) {
        return input.toUpperCase();
    }
}
