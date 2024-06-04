package simpleSocket;

import java.io.*;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ThreadEchoHandler implements Runnable {

    private final Socket incoming;

    @Override
    public void run() {
        try (InputStream inputStream = incoming.getInputStream();OutputStream outputStream=incoming.getOutputStream()){
            Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8);
            PrintWriter out = new PrintWriter(
                    new OutputStreamWriter(outputStream, StandardCharsets.UTF_8) {}, true);
            {

                out.println("Hello! Enter BYE to  EXIT");


                boolean done = false;
                while (!done && scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    out.println("Echo: " + line);
                    if (line.trim().equals("BYE"))
                        done = true;


                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public ThreadEchoHandler(Socket incoming) {
        this.incoming = incoming;
    }
}
