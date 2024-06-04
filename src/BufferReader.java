import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferReader {
    public static void main(String[] args) {
       // readUsingISR();
     // readUsingSIN();
        readUsingBR();
    }


    public static void readUsingISR() {


        char letter;
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Inter Character  'q' to quit");
        do {
            try {
                letter = (char) bufferReader.read();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(letter);
        } while (letter != 'q');

    }
    public static void readUsingSIN() {
        InputStream inputStream=System.in;
        char le;
        System.out.println("Inter Character  'q' to quit");

        do {
            try {
            le = (char) inputStream.read();

            }catch (IOException e){
                throw new RuntimeException(e);
        }
            System.out.println(le);
        }while (le!='q');


    }
    public static void readUsingBR() {
        String text;
        System.out.println("Enter line of text ");
        System.out.println(" if you need to exit please inter 'stop'");
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
  do{
        try {
            text=bufferedReader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
      System.out.println(text);
  }while (!text.contains("stop"));
    }



    }
