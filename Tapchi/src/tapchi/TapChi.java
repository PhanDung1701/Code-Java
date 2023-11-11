/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tapchi;

public class TapChi {
    private int maTC;
    private String tenTC;
    private String nhaXB;
    private int namXB;

    public TapChi(int maTC, String tenTC, String nhaXB, int namXB) {
        this.maTC = maTC;
        this.tenTC = tenTC;
        this.nhaXB = nhaXB;
        this.namXB = namXB;
    }

    public int getMaTC() {
        return maTC;
    }

    public String getTenTC() {
        return tenTC;
    }

    public String getNhaXB() {
        return nhaXB;
    }

    public int getNamXB() {
        return namXB;
    }
}

