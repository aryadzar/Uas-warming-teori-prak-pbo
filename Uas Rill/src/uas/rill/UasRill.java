/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas.rill;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aryad
 */


class Perusahaan{
    private List<Karyawan> daftarKaryawan = new ArrayList<>();
    
    public void tambahKaryawan(Karyawan karyawan){
        this.daftarKaryawan.add(karyawan);
    }

    public List<Karyawan> getDaftarKaryawan() {
        return daftarKaryawan;
    }
    
    
}

class Karyawan{
    private int id;
    private String nama;
    private String jabatan;
    private double gaji;

    public Karyawan(int id, String nama, String jabatan, double gaji) {
        this.id = id;
        this.nama = nama;
        this.jabatan = jabatan;
        this.gaji = gaji;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    
}
public class UasRill {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perusahaan perusahaan = new Perusahaan();

        // Membuat objek Karyawan
        Karyawan karyawan1 = new Karyawan(1, "John Doe", "Programmer", 50000.0);
        Karyawan karyawan2 = new Karyawan(2, "Jane Doe", "Designer", 45000.0);

        // Menambahkan karyawan ke perusahaan
        perusahaan.tambahKaryawan(karyawan1);
        perusahaan.tambahKaryawan(karyawan2);

        // Mendapatkan daftar karyawan dari perusahaan
        List<Karyawan> daftarKaryawan = perusahaan.getDaftarKaryawan();

        // Menampilkan informasi karyawan
        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println("ID: " + karyawan.getId());
            System.out.println("Nama: " + karyawan.getNama());
            System.out.println("Jabatan: " + karyawan.getJabatan());
            System.out.println("Gaji: " + karyawan.getGaji());
            System.out.println("--------------");
        }
    }
    
}
