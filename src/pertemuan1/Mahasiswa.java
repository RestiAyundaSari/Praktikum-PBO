/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */

public class Mahasiswa {
    private String nama,alamat,jurusan,exit;
    private int nilaiUas,nilaiUts,nim,pilihMenu;

    public int getPilihMenu() {
        return pilihMenu;
    }

    public String getExit() {
        return exit;
    }

    public void setExit(String exit) {
        this.exit = exit;
    }

    public void setPilihMenu(int pilihMenu) {
        this.pilihMenu = pilihMenu;
    }

    public int getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(int nilaiUas) {
        this.nilaiUas = nilaiUas;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }


    public int getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(int nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

   
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }
    
    public int getNim() {
        return nim;
    }

    public String getAlamat() {
        return alamat;
    }
}
