package com.iampatildipak;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        try {
            writer();
            reader();
            readCharacters();

            outputStreamWriter();
            inputStreamWriter();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writer() throws IOException {
        Writer fileWriter = new FileWriter("file.txt");

        fileWriter.write("data 1");
        fileWriter.write("data 2");
        fileWriter.write("data 3");

        fileWriter.close();
    }

    private static void reader() throws IOException {
        Reader fileReader = new FileReader("file.txt");

        int data = fileReader.read();
        while (data != -1) {

            data = fileReader.read();
        }
        fileReader.close();
    }

    private static void readCharacters() throws IOException {
        FileReader fileReader = new FileReader("file.txt");

        char[] destination = new char[1024];

        int charsRead = fileReader.read(destination, 0, destination.length);

        fileReader.close();

        System.out.println(destination);
    }

    private static void outputStreamWriter() throws IOException {
        OutputStream       outputStream       = new FileOutputStream("file.txt");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);

        outputStreamWriter.write("Hello World");

        outputStreamWriter.close();
    }

    private static void inputStreamWriter() throws IOException {
        InputStream inputStream       = new FileInputStream("file.txt");
        Reader      inputStreamReader = new InputStreamReader(inputStream);

        int data = inputStreamReader.read();
        while(data != -1){
            char theChar = (char) data;
            data = inputStreamReader.read();
            System.out.print(theChar);
        }

        inputStreamReader.close();
    }
}