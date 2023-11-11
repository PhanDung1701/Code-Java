/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author ADMIN
 */
public class Pheptinh {
    private int ToanHang1;
    private int ToanHang2;
    private char ToanTu;
    public void setToanHang1(int ToanHang1)
    {
        this.ToanHang1=ToanHang1;
    }
    public void setToanHang2(int ToanHang2){
        this.ToanHang2=ToanHang2;
    }
    public void setToanTu(char ToanTu){
        this.ToanTu = ToanTu;
    }
    public Pheptinh()
    {
        this.ToanHang1=0;
        this.ToanHang2=0;
        this.ToanTu='+';
    }
    public Pheptinh(int ToanHang1, int ToanHang2, char ToanTu){
        this.ToanHang1=ToanHang1;
        this.ToanHang2=ToanHang2;
        this.ToanTu=ToanTu;
    }
    public double Tinhtoan(){
        double giatri;
        switch(ToanTu)
        {
            case'+':
                giatri=ToanHang1+ToanHang2;
                break;
                case'-':
                giatri=ToanHang1-ToanHang2;
                break;
                case'*':
                giatri=ToanHang1*ToanHang2;
                break;
                default:
                giatri=(double)ToanHang1/ToanHang2;
                break;
        }    
        return giatri;
    }
    public static void main(String[] args) {
        Pheptinh pt1=new Pheptinh();
        double a=pt1.Tinhtoan();
        Pheptinh pt2=new Pheptinh(7,6,'-');
        double b=pt2.Tinhtoan();
        System.out.println("a="+a+", b="+b);
    }
        }
               
