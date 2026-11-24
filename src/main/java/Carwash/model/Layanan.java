package Carwash.model;
public class Layanan {
    private String id;
    private String nama;
    private double harga;

    public Layanan(String id, String nama, double harga) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
    }

    public String getId() { return id; }
    public String getNama() { return nama; }
    public double getHarga() { return harga; }
    public void setNama(String nama) { this.nama = nama; }
    public void setHarga(double harga) { this.harga = harga; }

    @Override
    public String toString() { return nama; }
}