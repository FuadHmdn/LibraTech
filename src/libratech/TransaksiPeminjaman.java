/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libratech;

/**
 *
 * @author Fuad.H
 */

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransaksiPeminjaman {
    
    private int idTransaksi;
    private String waktuPeminjaman;
    private int durasiPeminjaman;

    public TransaksiPeminjaman() {
        this.idTransaksi = 100;
        this.waktuPeminjaman = getCurrentDateTime();
        this.durasiPeminjaman = 7;
    }
    
    private String getCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return now.format(formatter);
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setWaktuPeminjaman(String waktuPeminjaman) {
        this.waktuPeminjaman = waktuPeminjaman;
    }

    public void setDurasiPeminjaman(int durasiPeminjaman) {
        this.durasiPeminjaman = durasiPeminjaman;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public String getWaktuPeminjaman() {
        return waktuPeminjaman;
    }

    public int getDurasiPeminjaman() {
        return durasiPeminjaman;
    }
    
    public String toString(){
        return "Pada " + this.waktuPeminjaman;
    }
}
