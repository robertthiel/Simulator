package io.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOMain {


    public static void main(String[] args) {


        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("/tmp/test.txt") ) ;

            writer.write("senf");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
