/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7;

import static java.lang.System.out;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collections;
import java.util.Enumeration;

/**
 *
 * @author PC-Dung
 */
public class Bai5 {

    public static void main(String args[]) throws SocketException {
        Enumeration<NetworkInterface> nets
                = NetworkInterface.getNetworkInterfaces();
        for (NetworkInterface netIf : Collections.list(nets)) {
            out.printf("Display name: %s\n", netIf.getDisplayName());
            out.printf("Name: %s\n", netIf.getName());
            displaySubInterfaces(netIf);
            out.printf("\n");
        }
    }

    static void displaySubInterfaces(NetworkInterface netIf) throws
            SocketException {
        Enumeration<NetworkInterface> subIfs = netIf.getSubInterfaces();
        for (NetworkInterface subIf : Collections.list(subIfs)) {
            out.printf("\tSub Interface Display name: %s\n",
                    subIf.getDisplayName());
            out.printf("\tSub Interface Name: %s\n", subIf.getName());
        }
    }
}
