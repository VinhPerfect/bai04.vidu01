/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4.vidu1;

import java.time.LocalDate;

/**
 *
 * @author lqv20
 */
public class Nguoi {
    private String hoten;
    int namsinh;

    public Nguoi(String hoten, int namsinh) {
        this.setHoten(hoten);
        this.setNamsinh(namsinh);
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public int getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(int namsinh) {
        LocalDate ngayhientai = LocalDate.now();
        int namhientai = ngayhientai.getYear();
        if(namsinh>namhientai && namsinh<=1900){
            System.out.println("Nam sinh khong hop le");
        }else {
            this.namsinh = namsinh;
        }       
    }

    @Override
    public String toString() {
        return " Nguoi{" + "hoten = " + hoten + ", namsinh = " + namsinh ;  
    }
    
    
}
