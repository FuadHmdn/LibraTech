package libratech;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraTech {

    static void tampilkanAnggota(ArrayList<AnggotaPerpustakaan> daftarAnggota) {
        System.out.println("================================== Daftar Anggota =================================");
        for (AnggotaPerpustakaan anggota : daftarAnggota) {
            System.out.println("Nama               : " + anggota.getNama());
            System.out.println("Nomor Anggota      : " + anggota.getNomorAnggota());
            System.out.println("Alamat             : " + anggota.getAlamat());
            System.out.println("Riwayat Peminjaman : " + anggota.getRiwayatPeminjaman());
            System.out.println("Denda              : Rp." + anggota.getDenda() + ".000,-");
            System.out.println("-------------------------------------------------------------------------------");
        }
        System.out.println("===================================================================================\n");
    }

    
    public static void main(String[] args) {
        
        Admin adm = new Admin(1, "Urip");
        TransaksiPeminjaman T1 = new TransaksiPeminjaman();

        AnggotaPerpustakaan agt1 = new AnggotaPerpustakaan(adm, "Rifqi", 123, "Gedung Meneng", "Tidak Ada", 50);
        AnggotaPerpustakaan agt2 = new AnggotaPerpustakaan(adm, "Billy Joe Amstrong", 124, "Amerika", "Tidak Ada", 0);

        adm.addAnggota(adm,"Paul McCartney", 125, "Lokasi", "Tidak Ada", 0);
        adm.addBuku("Marmut Merah Jambu", "Raditya Dika", 987654321, true);
        adm.addBuku("Harry Potter", "J. K. Rowling", 997654321,true);
        adm.addBuku("Kambing Jantan", "Raditya Dika", 943221212, true);
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("================ Selamat Datang di Library Technology ===================");
            int index = 1;
            System.out.println("Silahkan Pilih Akses Anda");
            System.out.println("1. Admin\n2. Anggota\n0. Keluar");
            System.out.print("Akses sebagai (0-2) : ");
            int pilihanAwal = scanner.nextInt();
            scanner.nextLine();
            
            if(pilihanAwal == 0){
                System.out.println("Terimakasih Sudah Mengunjungi LibraTech");
                break;
            }
            else if(pilihanAwal == 1){
                while(true){
                    System.out.println("===============================================================\n");
                    System.out.println("Pilih operasi:");
                    System.out.println("1. Tambah Anggota");
                    System.out.println("2. Hapus Anggota");
                    System.out.println("3. Tambah Buku");
                    System.out.println("4. Hapus Buku");
                    System.out.println("5. Tampilkan Anggota");
                    System.out.println("6. Rekap Denda");
                    System.out.println("7. Aktivitas");
                    System.out.println("0. Kembali");
                    System.out.print("Masukan Input : ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("================================================================\n");
                    
                    switch (choice) {
                            case 1:
                                System.out.print("Masukkan Nama Anggota : ");
                                String nama = scanner.nextLine();
                                System.out.print("Masukkan nomor Anggota : ");
                                int nomor = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Masukkan Alamat Anggota : ");
                                String alamat = scanner.nextLine();
                                adm.addAnggota(adm, nama, nomor, alamat, "Tidak Ada", 0);
                                System.out.print("Anggota berhasil ditambahkan\n");
                                break;

                            case 2:
                                System.out.print("Masukkan Nama Anggota Yang Akan Dihapus : ");
                                String namaToRemove = scanner.nextLine();
                                scanner.nextLine(); // consume the newline character
                                adm.removeAnggota(namaToRemove);
                                break;

                            case 3:
                                System.out.print("Masukkan Judul Buku : ");
                                String judul = scanner.nextLine();
                                System.out.print("Masukkan Penulis Buku : ");
                                String pengarang = scanner.nextLine();
                                System.out.print("Masukkan Nomor ISBN Buku : ");
                                int ISBN = scanner.nextInt();
                                scanner.nextLine();
                                System.out.print("Masukkan Status Ketersediaan Buku (true/false) : ");
                                boolean status = scanner.nextBoolean();
                                adm.addBuku(judul, pengarang, ISBN, status);
                                System.out.println("\nBerhasil Menambahkan Buku LibraTech..");
                                break;
                            case 4:
                                System.out.print("Masukkan Judul Buku Yang Ingin Dihapus : ");
                                String judulBuku = scanner.nextLine();
                                adm.removeBuku(judulBuku);
                                System.out.println("Berhasil Menghapus " + judulBuku + "\n");
                                break;
                            case 5:
                                tampilkanAnggota(adm.getDaftarAnggota());
                                scanner.nextLine();
                                break;
                            case 6:
                                adm.rekapDenda();
                                scanner.nextLine();
                                break;
                            case 7:
                                adm.aktivitas();
                                scanner.nextLine();
                                break;
                            case 0:
                                System.out.println("Kembali ke Menu Utama");
                    }
                    if(choice == 0){
                        System.out.println("Kembali ke Menu Utama");
                        break;
                    }
                    
                }                
            }
                else if(pilihanAwal == 2){
                    while (true){
                        System.out.println("\n===============================================================================");
                        System.out.println("Pilih Pengguna.");
                        for(AnggotaPerpustakaan value : adm.add){
                            System.out.println(index + ". "+value.getNama());
                            index++;
                        }
                        System.out.println("0. Keluar");
                        System.out.print("Masukan Input : ");
                        int pilihan = scanner.nextInt();
                        scanner.nextLine();

                        if(pilihan == 0){
                            System.out.println("Kembali ke Menu Utama");
                            break;

                        }else if(pilihan <= adm.add.size() && pilihan > 0){
                            index = 1;
                            while(true){
                                AnggotaPerpustakaan hasil = adm.add.get(pilihan - 1);

                                System.out.println("=========================================================================\n");
                                System.out.println("Silahkan pilih menu");
                                System.out.println("1. Pinjam Buku");
                                System.out.println("2. Kembalikan Buku");
                                System.out.println("3. Tampilkan Transaksi");
                                System.out.println("4. Tampilkan Buku");
                                System.out.println("5. Cari Buku");
                                System.out.println("0. Keluar");
                                System.out.print("Pilihan Anda (0-5): ");
                                int choice = scanner.nextInt();
                                scanner.nextLine();
                                System.out.println("=========================================================================\n");

                                switch (choice) {
                                    case 1:
                                        System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                                        String judulPinjam = scanner.nextLine();
                                        if (hasil.getTotalPinjaman() < 3) {
                                            if (adm.checkBookAvailability(judulPinjam)) {
                                                if (hasil.getDenda() > 0) {
                                                    System.out.println("Maaf, Anda memiliki denda yang belum dibayar. Tidak bisa meminjam buku.");
                                                } else {
                                                    hasil.pinjamBuku(judulPinjam);
                                                    System.out.println("Berhasil Meminjam Buku " + judulPinjam);
                                                }
                                            } else {
                                                System.out.println("Maaf, buku tidak tersedia untuk dipinjam.");
                                            }
                                        } else {
                                            System.out.println("Maaf, batas peminjaman buku Anda sudah penuh atau Anda memiliki denda.");
                                        }
                                        scanner.nextLine();
                                        break;
                                    case 2:
                                        System.out.print("Masukkan judul buku yang ingin dikembalikan: ");
                                        String judulKembali = scanner.nextLine();
                                        System.out.print("Masukkan durasi peminjaman: ");
                                        int durasiPengembalian = scanner.nextInt();
                                        hasil.mengembalikanBuku(judulKembali, durasiPengembalian);
                                        scanner.nextLine();
                                        
                                        break;
                                    case 3:
                                        hasil.tampilkanTransaksi();
                                        break;
                                    case 4:
                                        hasil.melihatBuku();

                                        while(true){
                                          System.out.print("Ingin Meminjam Buku? y/n : ");
                                            String jawab = scanner.nextLine();
                                            if(jawab.contains("y") && hasil.getTotalPinjaman() < 3){
                                                System.out.print("Masukan Judul Buku Yang Ingin Dipinjam : ");
                                                String judulInginPinjam = scanner.nextLine();
                                                hasil.pinjamBuku(judulInginPinjam);
                                                scanner.nextLine();
                                                System.out.println("Berhasil Meminjam Buku " + judulInginPinjam);
                                            }else if(jawab.contains("y") && hasil.getTotalPinjaman() >= 3){
                                                System.out.println("Maaf Batas Peminjaman Buku Anda Sudah Penuh\n");
                                            }else if(jawab.contains("n")){
                                                break;
                                            }
                                        }
                                        break;

                                    case 5 :
                                        System.out.print("Masukan Judul Yang Ingin Dicari : ");
                                        String cari = scanner.nextLine();
                                        hasil.cariBuku(cari);
                                        scanner.nextLine();
                                        break;
                                    case 0:
                                        System.out.println("Kembali ke Menu Utama");
                                } 
                                if(choice == 0 ){
                                    System.out.println("Kembali ke Menu Utama");
                                    break;
                                }
                            }  
                        }
                    }
            }   
        }
    }
}
