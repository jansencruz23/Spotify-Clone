package com.spotify.fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.File;
import java.io.IOException;

public class Fonts {
    private static Font spotifyBold;
    private static Font spotifyMedium;
        
    public static Font getSpotifyBoldFont(float fontSize){
        try 
        {
            spotifyBold = Font.createFont(Font.TRUETYPE_FONT, new File("spotify-bold.otf")).deriveFont(fontSize);
            GraphicsEnvironment graphicEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("spotify-bold.otf")));  
        }
        catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return spotifyBold;
    }
    
    public static Font getSpotifyMediumFont(float fontSize){
        try 
        {
            spotifyMedium = Font.createFont(Font.TRUETYPE_FONT, new File("spotify-medium.otf")).deriveFont(fontSize);
            GraphicsEnvironment graphicEnvironment = GraphicsEnvironment.getLocalGraphicsEnvironment();
            graphicEnvironment.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("spotify-medium.otf")));  
        }
        catch(IOException | FontFormatException ex){
            System.out.println(ex.getMessage());
        }
        
        return spotifyMedium;
    }
}
