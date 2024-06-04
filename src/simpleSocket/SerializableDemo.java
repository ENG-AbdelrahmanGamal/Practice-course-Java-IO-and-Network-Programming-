package simpleSocket;

import java.io.*;

public class SerializableDemo {

    public void Serializ(){
        try {
            ObjectOutputStream opt=new ObjectOutputStream(new FileOutputStream("serial"));
             MyClass myClass=new MyClass("Hello ",6,5.25);
            System.out.println("myClass:"+myClass);
            opt.writeObject(myClass);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public void DeSerialize(){
        try(ObjectInputStream opt=new ObjectInputStream(new FileInputStream("serial"))) {
            MyClass myClass2= (MyClass) opt.readObject();
            System.out.println("My class 2 ="+myClass2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        SerializableDemo  serializableDemo=new SerializableDemo();
        serializableDemo.Serializ();
        serializableDemo.DeSerialize();
    }

}
