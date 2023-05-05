package spotify.io;

import java.io.File;
import java.io.IOException;

public class Register {
    
    File file = new File("records/login/users.txt");
    
    public void createLoginRecord() {
        
        try {
            if (!file.exists())
                file.createNewFile();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
