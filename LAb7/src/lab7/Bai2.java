/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author PC-Dung
 */
public class Bai2 {

    public static void main(String[] args) {
        try {
            InetAddress[] addr = InetAddress.getAllByName("www.microsoft.com");
            for (InetAddress addr1 : addr) {
                System.out.println(addr1);
            }
        } catch (UnknownHostException ex) {
            System.out.println("Could not find www.microsoft.com");
        }
    }

}
