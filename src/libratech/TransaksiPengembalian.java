package libratech;

public class TransaksiPengembalian {
    private String judul;
    private int idTransaksi;
    private String waktuPeminjaman;
    private int totalDenda;

    public TransaksiPengembalian(String judul, int idTransaksi, String waktuPeminjaman,int totalDenda) {
        this.judul = judul;
        this.idTransaksi = idTransaksi;
        this.waktuPeminjaman = waktuPeminjaman;
        this.totalDenda = 20;
    }

    public void setIdTransaksi(int idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public void setTotalDenda(int totalDenda) {
        this.totalDenda = totalDenda;
    }

    public int getIdTransaksi() {
        return idTransaksi;
    }

    public int getTotalDenda() {
        return totalDenda;
    }

    public String getJudul() {
        return judul;
    }

    public String getWaktuPeminjaman() {
        return waktuPeminjaman;
    }
    
    public String toString(){
        return "Buku '" + this.judul +"' Id Transaksi " + this.idTransaksi;
    }
}
