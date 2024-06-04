package simpleSocket;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileCreate {

    public static void main(String[] args) {

        FileOutputStream fos;

        try {
            fos=new FileOutputStream("test1",true);
            fos.write("hello Dear attempt\n".getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}
