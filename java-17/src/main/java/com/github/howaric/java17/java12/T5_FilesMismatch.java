package com.github.howaric.java17.java12;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class T5_FilesMismatch {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("/tmp/a.txt");
        fileWriter.write("a");
        fileWriter.write("b");
        fileWriter.write("c");
        fileWriter.close();
        FileWriter fileWriterB = new FileWriter("/tmp/b.txt");
        fileWriterB.write("a");
        fileWriterB.write("1");
        fileWriterB.write("c");
        fileWriterB.close();
        System.out.println(Files.mismatch(Path.of("/tmp/a.txt"), Path.of("/tmp/b.txt")));
        //返回 1
    }

}
