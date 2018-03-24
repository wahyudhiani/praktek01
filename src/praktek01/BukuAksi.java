/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek01;

/**
 *
 * @author wahyudiani
 */
public class BukuAksi {
    public static void main(String[] args) {
        Buku Bukutulis  = new Buku();
        Buku Bukuharian = new Buku();
        Buku Bukugambar = new Buku();
        
        Bukutulis.ukuran=16;
        Bukutulis.bentuk="persegi";
        Bukutulis.warna="putih";
        Bukutulis.jumlahisi=20;
        Bukutulis.kegunaan="menulis";
        
        Bukuharian.ukuran=13;
        Bukuharian.bentuk="persegi";
        Bukuharian.warna="putih";
        Bukuharian.jumlahisi=30;
        Bukuharian.kegunaan="menulis cerita keseharian";
        
        Bukugambar.ukuran=29;
        Bukugambar.bentuk="persegi panjang";
        Bukugambar.warna="putih";
        Bukugambar.jumlahisi=10;
        Bukugambar.kegunaan="menggambar";
        
        Bukutulis.caramenyimpan();
        Bukuharian.caramenyimpan();
        Bukugambar.caramenyimpan();
    }
}
