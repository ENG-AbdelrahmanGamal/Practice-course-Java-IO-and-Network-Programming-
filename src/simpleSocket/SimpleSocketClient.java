package simpleSocket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class SimpleSocketClient {

    public static void main(String[] args) throws IOException {
        //create object from Socket
        Socket socket=new Socket("localhost",1992);


        InputStream inputStream= socket.getInputStream();

        DataInputStream dataInputStream=new DataInputStream(inputStream);
        String test =new String(dataInputStream.readUTF());
        System.out.println(test);



        //close
        socket.close();
        inputStream.close();
        dataInputStream.close();

    }
}
