/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;
public class Hocsinh {
    private String hoTen;
    private String lop;
    private float diemTb;
    public void setHoten(String hoten1) {
        this.hoTen=hoten1;
    }
    public void setLop(String lop)
    {
        this.lop=lop;
    }
    public void setDiemTb(float diemTb)
    {
        this.diemTb=diemTb;
    }
    public String getHoten()
    {
        return hoTen;
    }
    public String getLop()
    {
        return lop;
    }
    public float getDiemTB()
    {
        return diemTb;
    } 
    public static void main(String[] args) {
        Hocsinh a= new Hocsinh();
        a.setHoten("Phan Tien DUng");
        a.setLop("14A9");
        a.setDiemTb(7.5f);
        System.out.println("Ho ten: "+a.getHoten());
        System.out.println("Lop: "+a.getLop());
        System.out.println("Ho ten: "+a.getDiemTB());
        
}
}
 