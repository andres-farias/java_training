package cl.team.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Andrés Farías (a.farias@globant.com)
 */
public class ReaderFile {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("/tmp/Ejemplo.txt")){
            int ch = 0;
            while ((ch = fileReader.read()) != -1){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
