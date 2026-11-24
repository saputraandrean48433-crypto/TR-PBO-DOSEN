package Carwash.service;

import Carwash.model.Layanan;
import java.util.ArrayList;

public class Data_store {
    public static ArrayList<Layanan> layanans = new ArrayList<>();

    static {
        layanans.add(new Layanan("L001", "Cuci Biasa", 35000));
        layanans.add(new Layanan("L002", "Cuci standar", 60000));
        layanans.add(new Layanan("L003", "Cuci Premium", 85000));
    }
}
