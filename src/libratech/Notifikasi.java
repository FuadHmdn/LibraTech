/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libratech;

/**
 *
 * @author Fuad.H
 */
public class Notifikasi {
    private TransaksiPengembalian id;
    private TransaksiPeminjaman waktu;
    private AnggotaPerpustakaan nama;
    private AnggotaPerpustakaan nomorAnggota;

    public Notifikasi(TransaksiPengembalian id, TransaksiPeminjaman waktu, AnggotaPerpustakaan nama, AnggotaPerpustakaan nomorAnggota) {
        this.id = id;
        this.waktu = waktu;
        this.nama = nama;
        this.nomorAnggota = nomorAnggota;
    }

    public void setId(TransaksiPengembalian id) {
        this.id = id;
    }

    public void setWaktu(TransaksiPeminjaman waktu) {
        this.waktu = waktu;
    }

    public void setNama(AnggotaPerpustakaan nama) {
        this.nama = nama;
    }

    public void setNomorAnggota(AnggotaPerpustakaan nomorAnggota) {
        this.nomorAnggota = nomorAnggota;
    }

    public TransaksiPengembalian getId() {
        return id;
    }

    public TransaksiPeminjaman getWaktu() {
        return waktu;
    }

    public AnggotaPerpustakaan getNama() {
        return nama;
    }

    public AnggotaPerpustakaan getNomorAnggota() {
        return nomorAnggota;
    }
    
    
}
