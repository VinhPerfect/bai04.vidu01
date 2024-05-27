/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4.vidu2;

/**
 *
 * @author lqv20
 */
public class Tho extends DongVat {
    private int soluong;
    private String chungloai;
    private String mausac;

    public Tho(String ten, int namsinh, String giong, int soluong, String chungloai, String mausac) {
        super(ten, namsinh, giong);
        this.soluong = soluong;
        this.chungloai = chungloai;
        this.mausac = mausac;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getChungloai() {
        return chungloai;
    }

    public void setChungloai(String chungloai) {
        this.chungloai = chungloai;
    }

    public String getMausac() {
        return mausac;
    }

    public void setMausac(String mausac) {
        this.mausac = mausac;
    }

    @Override
    public String toString() {
        return " Tho{"+ super.toString() + "soluong = " + soluong + ", chungloai = " + chungloai + ", mausac = " + mausac + '}';
    }
    
    
}
