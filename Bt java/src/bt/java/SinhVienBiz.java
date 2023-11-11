/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.java;

/**
 *
 * @author ADMIN
 */
class SinhVienBiz extends SinhVienPoly {

    private final double marketing;
    private final double sales;

    public SinhVienBiz(String hoTen, String nganh, double marketing, double sales) {
        super(hoTen, nganh);
        this.marketing = marketing;
        this.sales = sales;
    }

    @Override
    public double getDiem() {
        return (2 * marketing + sales) / 3;
    }
}
