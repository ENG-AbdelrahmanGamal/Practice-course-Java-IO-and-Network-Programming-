package simpleSocket;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr=new FileReader("/home/abdelrahmangamal/my_data/Resume&coverlatter/Abdelrahman Gamal – Android Developer – Cover Letter.odt");
            int c;
            while ((c= fr.read())!=-1){
                System.out.print((char) c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println();
    }
}
