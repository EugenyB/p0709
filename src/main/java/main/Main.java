package main;

import lombok.SneakyThrows;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    @SneakyThrows
    private void run() {
        try (PrintWriter out = new PrintWriter("r:\\file1.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            out.println("Hello, All!");

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
