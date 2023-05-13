package com.spotify.auth.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Login {
    
    final Path FILE_PATH = Path.of("records/login/users.txt");
   
    public boolean isUserExisting(String username, String password) {
        
        try {
            
            Stream<String> lines = Files.lines(FILE_PATH);
            return lines.map(t -> t.split("\\s+"))
                 .anyMatch(t -> t[0].equals(username) && t[1].equals(password));
            
            /*
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
            }*/
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    
        return false;
    }
}