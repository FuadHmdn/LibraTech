package libratech;

import java.util.ArrayList;
import java.util.Iterator;

public class Admin {
    private int idAdmin;
    private String namaAdmin;

    ArrayList<AnggotaPerpustakaan> add = new ArrayList<>();
    ArrayList<Buku> daftarbuku = new ArrayList<>();
    ArrayList<Notifikasi> aktivitas = new ArrayList<>();
    
    public ArrayList<AnggotaPerpustakaan> getDaftarAnggota() {
    return add;
}


    public Admin(int idAdmin, String namaAdmin) {
        this.idAdmin = idAdmin;
        this.namaAdmin = namaAdmin;
    }

    public void addAnggota(Admin adm, String nama, int nomorAnggota, String alamat, String riwayatPeminjaman, int denda) {
        AnggotaPerpustakaan anggota = new AnggotaPerpustakaan(adm, nama, nomorAnggota, alamat, riwayatPeminjaman, denda);
    }

    public void addAnggota(AnggotaPerpustakaan anggota) {
        add.add(anggota);
    }


    public void removeAnggota(String nama) {
        Iterator<AnggotaPerpustakaan> iterator = add.iterator();

        boolean anggotaDitemukan = false;

        while (iterator.hasNext()) {
            AnggotaPerpustakaan anggota = iterator.next();
            if (anggota.getNama().contentEquals(nama)) {
                iterator.remove();
                anggotaDitemukan = true;
                System.out.println("Berhasil Menghapus " + anggota.getNama() + "\n");
                break;
            }
        }

        if (!anggotaDitemukan) {
            System.out.println("Anggota Tidak Ditemukan");
        }
    }

    public void addBuku(String judul, String pengarang, int nomorISBN, boolean statusKetersediaan) {
        Buku daftar = new Buku(judul, pengarang, nomorISBN, statusKetersediaan);
        System.out.println("============================== Notifikasi ===============================");
        System.out.println("Buku Baru Telah Tersedia!");
        System.out.println("Judul     : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("");
        daftarbuku.add(daftar);
    }

    public void removeBuku(String judul) {
        Iterator<Buku> iterator = daftarbuku.iterator();

        boolean bukuDitemukan = false;

        while (iterator.hasNext()) {
            Buku value = iterator.next();
            if (value.getJudul().equalsIgnoreCase(judul)) {
                iterator.remove();
                bukuDitemukan = true;
                System.out.println("Berhasil Menghapus Buku " + judul + "\n");
                break;
            }
        }

        if (!bukuDitemukan) {
            System.out.println("Buku dengan Judul " + judul + " Tidak Ditemukan");
        }
    }


    public void rekapDenda() {
        System.out.println("\n=================== Rekap Denda Anggota Perpustakaan ====================");
        for (AnggotaPerpustakaan value : add) {
            if (value.getDenda() > 0) {
                System.out.println("Nama                : " + value.getNama());
                System.out.println("Nomor Anggota       : " + value.getNomorAnggota());
                System.out.println("Denda Yang Dimiliki : Rp." + value.getDenda() + ".000,-");
            }
        }
    }

    public void aktivitas() {
        for (Notifikasi value : aktivitas) {
            System.out.println("================================ Aktivitas ==============================\n");
            System.out.println(value.getNama() + "\nMeminjam " + " " + value.getId());
            System.out.println("Pada " + value.getWaktu());
            System.out.println("=========================================================================\n");
        }
    }

    public boolean checkBookAvailability(String judul) {
    for (Buku buku : daftarbuku) {
        if (buku.getJudul().toLowerCase().contains(judul.toLowerCase()) && buku.isStatusKetersediaan()) {
            return true;
        }
    }
    return false;
}

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    
}
