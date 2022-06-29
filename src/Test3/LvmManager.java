package Test3;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class LvmManager {

    public LuchtvaartMaatschappij lvmInLaden(String bestandsnaam) throws IOException , ClassNotFoundException{
        InputStream s = Files.newInputStream(Path.of(bestandsnaam));
        ObjectInputStream ois = new ObjectInputStream(s);

        LuchtvaartMaatschappij deLvm = (LuchtvaartMaatschappij) ois.readObject();
        ois.close();

        return deLvm;
    }


}
