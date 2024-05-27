/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4.vidu1;

/**
 *
 * @author lqv20
 */
public class GiangVien extends Nguoi {
    private String MaGV;
    private String chuyennganh;
    private String trinhdo;

    public GiangVien(String hoten, int namsinh, String MaGV, String chuyennganh, String trinhdo) {
        super(hoten, namsinh);
        this.MaGV = MaGV;
        this.chuyennganh = chuyennganh;
        this.trinhdo = trinhdo;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String MaGV) {
        this.MaGV = MaGV;
    }

    public String getChuyennganh() {
        return chuyennganh;
    }

    public void setChuyennganh(String chuyennganh) {
        this.chuyennganh = chuyennganh;
    }

    public String getTrinhdo() {
        return trinhdo;
    }

    public void setTrinhdo(String trinhdo) {
        this.trinhdo = trinhdo;
    }

    @Override
    public String toString() {
        return "GiangVien{"+ super.toString() + "MaGV = " + MaGV + ", chuyennganh = " + chuyennganh + ", trinhdo = " + trinhdo + '}';
    }

    
    
}
