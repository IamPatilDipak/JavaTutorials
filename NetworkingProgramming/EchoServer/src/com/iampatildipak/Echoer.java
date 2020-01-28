package com.iampatildipak;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Echoer extends Thread {
    private final Socket socket;

    public Echoer(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {

            BufferedReader input = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));

            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            while (true) {
                String echoString = input.readLine();

                if (echoString.equals("exit")) {
                    break;
                }
                output.println("Echo from server: " + echoString);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
