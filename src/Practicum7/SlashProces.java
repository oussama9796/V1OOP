package Practicum7;

public class SlashProces implements OpmaakProces{

    @Override
    public String maakOp(String input) {
        return input.replace('.', '/');
    }
}
