/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author raihanmaulana
 */
public class Civitas {
    private String nama;
    private String prodi;
    private String fakultas;

    public Civitas(String nama,String prodi,String fakultas) {
        this.nama = nama;
        this.prodi = prodi;
        this.fakultas = fakultas;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getProdi() {
        return prodi;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public String getFakultas() {
        return fakultas;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }
   
}

class Mahasiswa extends Civitas{
    private String nim;

    public Mahasiswa(String nim, String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
        this.nim = nim;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
   
}

class Dosen extends Civitas{
    private String nip;

    public Dosen(String nip, String nama, String prodi, String fakultas) {
        super(nama, prodi, fakultas);
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }
    
}
