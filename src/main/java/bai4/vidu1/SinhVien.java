/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4.vidu1;

/**
 *
 * @author lqv20
 */
public class SinhVien extends Nguoi {
    private String MaSV;
    private String nganhhoc;

    public SinhVien(String hoten, int namsinh, String MaSV, String nganhhoc) {
        super(hoten, namsinh);
        this.MaSV = MaSV;
        this.nganhhoc = nganhhoc;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getNganhhoc() {
        return nganhhoc;
    }

    public void setNganhhoc(String nganhhoc) {
        this.nganhhoc = nganhhoc;
    }

    @Override
    public String toString() {
        return "SinhVien{ " + super.toString() + ", MaSV = " + MaSV + ", nganhhoc = " + nganhhoc ;
    }   

    
    
    
    
    
    
    
    
}
