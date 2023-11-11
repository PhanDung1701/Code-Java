/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab7;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author PC-Dung
 */
public class LAb7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getLocalHost();
            System.out.println("Hello. My name is "
                    + address.getHostName() + " and my IP adress is "
                    + address.getHostAddress());
        } catch (UnknownHostException e) {
            System.out.println("I don't know my own name and address.");
        }
    }

}
