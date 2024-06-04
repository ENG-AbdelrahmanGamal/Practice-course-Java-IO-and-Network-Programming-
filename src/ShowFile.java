import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ShowFile {

    public static void main(String[] args) {
        int i;
        FileInputStream fis;
        if(args.length!=1){
            System.out.println("Usage show file ");
            return;
        }
        //attempt to open file
        try {
            fis=new FileInputStream(args[0]);

        }catch (FileNotFoundException e){
            System.out.println("can not open File");
            return;
        }
        //at this point the file is open  and can read from file
        // the following reads character

        try {
do {
    i = fis.read();
    System.out.print((char) i);
}while (i!=-1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
