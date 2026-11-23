package Carwash.model;

public class Petugas {
    private String idPetugas;
    private String nama;
    private String username;
    private String password;

    public Petugas(String idPetugas, String nama, String username, String password) {
        this.idPetugas = idPetugas;
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }

    public String getNama() { return nama; }
}
