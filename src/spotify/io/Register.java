package spotify.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Register {
    
    File file = new File("records/login/users.txt");
        
    public void registerUser(String username, String password) {
        
        try {
            
            FileWriter writer = new FileWriter(file, true);
            
            writer.write(username + " " + password + "\n");
            writer.close();
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public boolean isUserExisting(String username) {
        
        try {
            
            FileReader fileReader = new FileReader(this.file);
            BufferedReader reader = new BufferedReader(fileReader);
            
            while (reader.ready()) {
                String[] userData = reader.readLine().split("\\s+");
                
                if (userData[0].equals(username)) {
                    reader.close();
                    return true;
                }
            }
        }
        catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return false;
    }
}
