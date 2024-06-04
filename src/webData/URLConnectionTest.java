package webData;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class URLConnectionTest {
    public static void main(String[] args) {

        try {
            String urlName;
            if (args.length > 0)
                urlName = args[0];
            else
                urlName = "https://github.com";
//create object from Url and get connection then connect
            URL url =  new URL(urlName);
            URLConnection connection=url.openConnection();
            connection.connect();
 // call to methos  getheader to get information about header

            Map<String,List<String>> headers =connection.getHeaderFields();
           //pring map for the key and value
            for(Map.Entry<String,List<String>> entry: headers.entrySet()){
                String key= entry.getKey();
                for (List<String> value : headers.values()) {
                    System.out.println(key+" : "+ value);
                }
            }
            System.in.read();
            //print convenience functions
            System.out.println("---------------------");
            System.out.println("getContact type "+ connection.getContentType());
            System.out.println("getContact Encoding "+ connection.getContentEncoding());
            System.out.println("getContact Length "+ connection.getContentLength());
            System.out.println("get Data"+ connection.getDate());
            System.out.println("get expirations "+ connection.getExpiration());
            System.out.println("get Last Modifiers "+ connection.getLastModified());
            System.out.println("---------------------");

  String encoding=connection.getContentEncoding();
  if (encoding==null) encoding="UTF-8";
  System.in.read();
  try (Scanner input =new Scanner(connection.getInputStream(),encoding)){

      for (int n=1; input.hasNextLine()&&n<=100;n++)
      {
          System.out.println(input.hasNextLine());
         if(input.hasNextLine()) System.out.println();
      }
  }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
