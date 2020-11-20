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
public class PBOIF210119062Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ShinichiKudo objShinichiKudo = new ShinichiKudo("Detektif", "Bernyanyi", "Yusaku Kudo", "Ran Mouri", "Sepak bola dan olahraga lainnya");
        objShinichiKudo.setNama("Shinichi Kudo");
        KaitoKid objKaitoKid = new KaitoKid("Pesulap, Pencuri baik hati", "Takut ikan", "Touchi Kuroba", "Aoko Nakamori", "Bermain papan ski");
        objKaitoKid.setNama("Kaito Kuroba");
        
        System.out.println("======Karakter Kartun dalam Anime Detective Conan======");
        System.out.println("Nama                : "+objShinichiKudo.getNama());
        objShinichiKudo.tampilHasil();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Nama                : "+objKaitoKid.getNama());
        objKaitoKid.tampilHasil();
    }
    
}
