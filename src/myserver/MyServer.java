/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myserver;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Ondrej
 */
public class MyServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = null;
        String str2 = null;
        try {
            ServerSocket ss = new ServerSocket(8420);
            while (true) {
                Socket s = ss.accept();
                Socket s2 = ss.accept();
                DataInputStream dis = new DataInputStream(s.getInputStream()) {
                };
                DataInputStream dis2 = new DataInputStream(s2.getInputStream()) {
                };
                str = (String) dis.readUTF();
                str2 = (String) dis2.readUTF();
                if ("1".equals(str)) {
                    DataOutputStream dos = new DataOutputStream(s2.getOutputStream());
                    dos.writeUTF("1");

                } else if ("2".equals(str)) {
                    DataOutputStream dos = new DataOutputStream(s2.getOutputStream());
                    dos.writeUTF("2");
                } else if ("3".equals(str)) {
                    DataOutputStream dos = new DataOutputStream(s2.getOutputStream());
                    dos.writeUTF("3");
                } else {
                    DataOutputStream dos = new DataOutputStream(s2.getOutputStream());
                    dos.writeUTF("idk what you did");
                }

                if ("1".equals(str2)) {
                    DataOutputStream dos2 = new DataOutputStream(s.getOutputStream());
                    dos2.writeUTF("1");
                } else if ("2".equals(str2)) {
                    DataOutputStream dos2 = new DataOutputStream(s.getOutputStream());
                    dos2.writeUTF("2");
                } else if ("3".equals(str2)) {
                    DataOutputStream dos2 = new DataOutputStream(s.getOutputStream());
                    dos2.writeUTF("3");
                } else {
                    DataOutputStream dos2 = new DataOutputStream(s.getOutputStream());
                    dos2.writeUTF("idk what you did");
                }

                System.out.println("Client 1. Says = " + str);
                System.out.println("Client 2. Says = " + str2);
                //ss.close();
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
