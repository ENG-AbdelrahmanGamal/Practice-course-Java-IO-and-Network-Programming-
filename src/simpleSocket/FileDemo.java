package simpleSocket;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        getDir_getFil(".");
    }
    public static void getDir_getFil(String dirctory_name){

        File  file=new File(dirctory_name);
        if(file.isDirectory()){
            System.out.println("Directory of "+dirctory_name);
            String [] list=file.list();
            for (int i = 0; i < list.length ; i++) {
                File file1=new File(dirctory_name+"/"+list[i]);
                if(file1.isDirectory()) {
                    System.out.println(list[i] + "\tis Directory ");
                    getDir_getFil("."+list[i]);
                }else
                    System.out.println(list[i]+"  is File");

            }
        }
        else
            System.out.println("is not Directory ");
    }
}
