package com.green.oopStudy;

import java.io.FileWriter;
import java.io.IOException;

public class MyOop {
    public static void main(String[] args) throws IOException {
        FileWriter f1 = new FileWriter("data.txt");

        f1.write("Hello");
        f1.write("Java");
        f1.close();

    }
}
