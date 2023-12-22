/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uas_teori;

/**
 *
 * @author aryad
 */

class Titik{
    private int x,y;
    public Titik(){
        this.x = 0;
        this.y = 0;
    }

    public Titik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double jarakKe(Titik t){
        double result = Math.pow((this.getX() - t.getX()), 2) + Math.pow((this.getY()) - t.getY(), 2);
        double result2 = Math.sqrt(result);
        return result2;
    }
}

class Elips{
    private double rx,ry;

    public Elips(double rx, double ry) {
        this.rx = rx;
        this.ry = ry;
    }

    public double getRx() {
        return rx;
    }

    public void setRx(double rx) {
        this.rx = rx;
    }

    public double getRy() {
        return ry;
    }

    public void setRy(double ry) {
        this.ry = ry;
    }
    
    public double getLuas(){
        
        double result = Math.PI * this.getRx() * this.getRy();
        
        return result;
    }
    
}

class NilaiMahasiswa{
    private String nama;
    private double kuis, tugas, ujian;

    public NilaiMahasiswa(String nama, double kuis, double tugas, double ujian) {
        this.nama = nama;
        this.kuis = kuis;
        this.tugas = tugas;
        this.ujian = ujian;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getKuis() {
        return kuis;
    }

    public void setKuis(double kuis) {
        this.kuis = kuis;
    }

    public double getTugas() {
        return tugas;
    }

    public void setTugas(double tugas) {
        this.tugas = tugas;
    }

    public double getUjian() {
        return ujian;
    }

    public void setUjian(double ujian) {
        this.ujian = ujian;
    }
    
    public double nilaiAkhir(){
        double result = (this.getKuis() * 0.2) + (this.getTugas() * 0.4) + (this.getUjian() * 0.4);
        return result;
    }
    
    public String hurufMutu(){
        if(this.nilaiAkhir() >= 76){
            return "A";
        }else if(this.nilaiAkhir() >= 71 && this.nilaiAkhir() < 76){
            return "B+";
        }else if(this.nilaiAkhir() >= 66 && this.nilaiAkhir() < 71){
            return "B";
        }else if(this.nilaiAkhir() >= 61 && this.nilaiAkhir() < 66){
            return "C+";
        }else if(this.nilaiAkhir() >= 56 && this.nilaiAkhir() < 61){
            return "C";
        }else if(this.nilaiAkhir() >= 50 && this.nilaiAkhir() < 56){
            return "D";
        }
        return "E";
    } 
    
}

class Rectangle{
    private double x,y,width, height;
    
    public Rectangle(){
        
    }

    public Rectangle(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    public double area(){
        double result = this.getWidth() * this.getHeight();
        return result;
    }
    
    public double perimeter(){
        double result = (this.getWidth()*2) + (this.getHeight() * 2);
        return result;
    }
    
    public boolean isCollision(Rectangle rect) {
        return (this.getX() <= rect.getX() + rect.getWidth() &&
                this.getX() + this.getWidth() >= rect.getX() &&
                this.getY() <= rect.getY() + rect.getHeight() &&
                this.getY() + this.getHeight() >= rect.getY());
    }
}

class SegiTiga{
    private Titik P;
    private Titik Q;
    private Titik R;

    public SegiTiga(Titik P, Titik Q, Titik R) {
        this.P = P;
        this.Q = Q;
        this.R = R;
    }

    public Titik getP() {
        return P;
    }

    public void setP(Titik P) {
        this.P = P;
    }

    public Titik getQ() {
        return Q;
    }

    public void setQ(Titik Q) {
        this.Q = Q;
    }

    public Titik getR() {
        return R;
    }

    public void setR(Titik R) {
        this.R = R;
    }
    
   
    public double keliling(){
        double result = P.jarakKe(Q) + Q.jarakKe(R) + R.jarakKe(P);
        return result;
    }
    
    public double luas(){
        double s = 0.5 * this.keliling();
        double result = s * (s - P.jarakKe(Q)) * (s - Q.jarakKe(R)) * (s - R.jarakKe(P));
        double result2 = Math.sqrt(result);
        
        return result2;
    }
    
}

class NasabahBank{
    public String nama;
    public String noRekening;
    public double saldo;

    public NasabahBank() {
        this.nama = null;
        this.noRekening = null;
        this.saldo = 0;
    }

    public NasabahBank(String nama, String noRekening, double saldo) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = saldo;
    }

    public NasabahBank(String nama, String noRekening) {
        this.nama = nama;
        this.noRekening = noRekening;
        this.saldo = 0;
    }
    
    
    public void cetak(){
        System.out.println("Nama: "+ this.nama);
        System.out.println("No Rekening: "+this.noRekening);
        System.out.println("Saldo: " + this.saldo);
    }
    
    public void setoran(double nilai){
        this.saldo += nilai;
    }
    
    public void tarik(double nilai){
        if(nilai > this.saldo){
            System.out.println("Saldo tidak cukup");
            return;
        }
        
        this.saldo -= nilai;
    }
}
public class UAS_Teori {

    /**
     * @param CatA
     * @param CatB
     * @param args the command line arguments
     * @param MouseC
     */
    
    public static void kucingDanTikus(int x, int y, int z){
        if(Math.abs(x - z) < Math.abs(y - z)){
            System.out.println("Cat A");
        }else if(Math.abs(y-z) < Math.abs(x - z)){
            System.out.println("Cat B");
        }else{
            System.out.println("Mouse C");
        }
    }
    public static void main(String[] args) {
//        Titik A=new Titik(0,0);
//        Titik B=new Titik(0,2);
//        System.out.println(A.jarak(B));
//        Elips l =new Elips(10,5);
//        System.out.println(l.getLuas());
//        kucingDanTikus(2,4,7);
//        NilaiMahasiswa nm =new NilaiMahasiswa("Andi",60,60,60);
//        System.out.println("Nilai Akhir: "+nm.nilaiAkhir());
//        System.out.println("Nilai Huruf Mutu: "+nm.hurufMutu());
//        Rectangle rect1 = new Rectangle(0,0,4,4);
//        Rectangle rect2 = new Rectangle(5,4,4,4);
//        
//        System.out.println(rect1.area());
//        System.out.println(rect1.perimeter());
//        Rectangle rect1 = new Rectangle(0,0,3,4);
//        Rectangle rect2 = new Rectangle(2,2,4.5,4);
//        
//        System.out.println(rect1.area());
//        System.out.println(rect1.perimeter());
//        
//        System.out.println(rect2.area());
//        System.out.println(rect2.perimeter());
//        System.out.println(rect1.isCollision(rect2));

//        Titik A=new Titik(0,0);
//        Titik B=new Titik(4,0);
//        Titik C=new Titik(0,5);
//        SegiTiga s = new SegiTiga(A,B,C);
//        System.out.println("Luas Segitiga: "+s.luas());
              NasabahBank p = new NasabahBank();
      p.nama="Iwan";
      p.noRekening="123";
      p.saldo=200;
           p.cetak();

    }
    
}
