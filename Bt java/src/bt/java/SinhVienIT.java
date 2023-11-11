/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bt.java;

/**
 *
 * @author ADMIN
 */
class SinhVienIT extends SinhVienPoly {

    private final double java;
    private final double html;
    private final double css;

    public SinhVienIT(String hoTen, String nganh, double java, double html, double css) {
        super(hoTen, nganh);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getDiem() {
        return (2 * java + html + css) / 4;
    }
}
