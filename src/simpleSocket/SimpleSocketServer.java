package simpleSocket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleSocketServer   {


    public static void main(String[] args) throws IOException {

        //new sever register
       try (ServerSocket ss=new ServerSocket(1992)){
           int i=0;



        //accept the connection request  made with the sever socket// waiting to client connect
        while (true) {
            Socket s = ss.accept();

            System.out.printf("spawning"+i);
            Runnable r =new ThreadEchoHandler(s);
            Thread thread =new Thread(r);

            thread.start();
            i++;
            // Establish the output stream from the socket connection
            OutputStream socketOutPutsStream = s.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(socketOutPutsStream);
            dataOutputStream.writeUTF("Hello Abdo with the first app with server and clint connection");


            //clean up
            dataOutputStream.close();
            socketOutPutsStream.close();
            s.close();
            ss.close();

        }}

    }
}
