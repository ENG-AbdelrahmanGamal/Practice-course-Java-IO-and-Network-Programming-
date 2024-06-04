package simpleSocket;

import java.io.Serializable;

public class MyClass implements Serializable {
    String s;
    int i;
    double d;
    transient  String demo ="Non transient Attribute";

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }

    @Override
    public String toString() {
        return "S= "+s+" I = "+i+" D = "+d+"Demo="+demo;}
}
