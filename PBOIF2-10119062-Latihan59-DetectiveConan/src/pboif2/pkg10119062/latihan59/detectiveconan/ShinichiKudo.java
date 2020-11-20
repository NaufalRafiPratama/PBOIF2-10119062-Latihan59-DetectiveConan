/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119062.latihan59.detectiveconan;

/**
 *
 * @author 
 * NAMA     : Naufal Rafi Pratama
 * KELAS    : PBOIF2
 * NIM      : 10119062
 * Deskripsi Progam : program ini berisi program untuk menampilkan
 * detective conan 
 */
public class ShinichiKudo extends ManusiaKartun{
    private String nama;

    public ShinichiKudo(String profesi, String kelemahan, String namaAyah, String wanitaYangDisukai, String hobi) {
        super(profesi, kelemahan, namaAyah, wanitaYangDisukai, hobi);
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
