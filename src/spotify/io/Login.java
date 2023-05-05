package spotify.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Login {
    
    File file = new File("records/login/users.txt");
   
    public boolean isUserExisting(String username, String password) {
        
        try {
            
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            
            while (reader.ready()) {
                String[] userData = reader.readLine().split("\\s+");
                String _username = userData[0];
                String _password = userData[1];
                
                if (_username.equals(username) && _password.equals(password)) {
                    reader.close();
                    return true;
                }
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return false;
    }
}