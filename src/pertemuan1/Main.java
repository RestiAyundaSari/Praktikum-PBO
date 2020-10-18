/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;
import java.io.InputStream;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Main {
     //static String bantu;
     static Mahasiswa mhs = new Mahasiswa();
     static Scanner inputIdentitas = new Scanner(System.in);
      
    public static void main(String[] args) {
     inputData();
    }
    static void menu(){
        do {
        System.out.println("Menu : ");
        System.out.println("1. Input Data ");
        System.out.println("2. Lihat Data");
        System.out.print("Masukkan Pilihan : ");
        mhs.setPilihMenu(inputIdentitas.nextInt());
        inputIdentitas.nextLine();
            switch (mhs.getPilihMenu()) {
                case 1:
                    inputData();
                    break;
                case 2:
                    outputData();
                    break;
                default:
                    System.out.println("Menu tidak ada");
                    break;
            }
                System.out.print("Ingin Kembali ke Menu ? (y/n) : ");
                mhs.setExit(inputIdentitas.nextLine());
        } while ("y".equals(mhs.getExit())); 
    }
    
    static void inputData(){
        System.out.print(" Nama      : ");
        mhs.setNama(inputIdentitas.nextLine());
        System.out.print(" Nim       : ");
        mhs.setNim(inputIdentitas.nextInt());
           inputIdentitas.nextLine();
        System.out.print(" Alamat    : ");
        mhs.setAlamat(inputIdentitas.nextLine());
        System.out.print(" Nilai UAS : ");
        mhs.setNilaiUas(inputIdentitas.nextInt());
        System.out.print(" Nilai UTS : ");
        mhs.setNilaiUts(inputIdentitas.nextInt());
        if (mhs.getNim()>= 123000000 && mhs.getNim() < 124000000) {
             mhs.setJurusan("Informatika");
        }
        else if (mhs.getNim()>= 124000000 && mhs.getNim() < 125000000) {
             mhs.setJurusan("Sistem Informasi");
        } 
        else  {
             mhs.setJurusan("Tidak ada");
        }
        menu();
    }
    
    static void outputData(){
        System.out.println(" Nama       :   " + mhs.getNama());
        System.out.println(" Nim        :   " + mhs.getNim());
        System.out.println(" Alamat     :   " + mhs.getAlamat());
        System.out.println(" Jurusan    :   " + mhs.getJurusan());
        System.out.println(" Nama       :   " + mhs.getNama());
    }
}
