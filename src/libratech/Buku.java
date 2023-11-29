package libratech;
public class Buku {
    
    private String judul;
    private String pengarang;
    private int nomorISBN;
    private boolean statusKetersediaan;
    
    public Buku(String judul, String pengarang, int nomorISBN, boolean statusKetersediaan) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.nomorISBN = nomorISBN;
        this.statusKetersediaan = statusKetersediaan;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setNomorISBN(int nomorISBN) {
        this.nomorISBN = nomorISBN;
    }

    public void setStatusKetersediaan(boolean statusKetersediaan) {
        this.statusKetersediaan = statusKetersediaan;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getNomorISBN() {
        return nomorISBN;
    }

    public boolean isStatusKetersediaan() {
        return statusKetersediaan;
    }

}
