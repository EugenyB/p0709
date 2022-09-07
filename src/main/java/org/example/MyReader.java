package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyReader {
    private BufferedReader reader;
    private int wordCount = 0;
    private int pos = 0;
    private String[] words;

    public MyReader(String filename) throws IOException {
        this.reader = Files.newBufferedReader(Path.of("file.txt"));
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }

    public void close() throws IOException {
        reader.close();
    }

    public String readWord() throws IOException{
        if (wordCount == 0) {
            words = readLine().split("\\W+");
            wordCount = words.length;
        }
        if (pos==wordCount-1) wordCount = 0;
        return words[pos++];
    }
}
