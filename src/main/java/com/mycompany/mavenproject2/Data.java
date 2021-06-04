/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;

/**
 *
 * @author raihanmaulana
 */
public class Data {
    private ArrayList<Mahasiswa> mhs = new ArrayList<>();
    private ArrayList<Dosen> dsn = new ArrayList<>();
    private ArrayList<Akun> akun = new ArrayList<>();
    
    public void intMahasiswa(){
        File f1 = new File("FileFolder");
        if(!f1.exists()){
            f1.mkdir();
            System.out.println("File has been created");
        }
        
        File f2 = new File("FileFolder/mhs.txt");
        if(!f2.exists()){
            try {
                f2.createNewFile();
            } catch (Exception e) {
                System.out.println("File can't be created");
            }
        }
    }
    
    ArrayList<Akun> getAkunList(){
        return akun;
    }
    
    ArrayList<Mahasiswa> getMahasiswaList(){
        return mhs;
    }
    
    ArrayList<Dosen> getDosenList(){
        return dsn;
    }
    
    public void intDosen(){
        File f1 = new File("FileFolder");
        if(!f1.exists()){
            f1.mkdir();
            System.out.println("FileFolder has been created");
        }
        
        File f2 = new File("FileFolder/dsn.txt");
        if(!f2.exists()){
            try {
                f2.createNewFile();
            } catch (Exception e) {
                System.out.println("File can't be created");
            }
        }
    }
    
    public void pecahMhs(String data){
        String[] array = data.split("-");
        mhs.add(new Mahasiswa(array[0],array[1],array[2],array[3]));
    }
    
    public void pecahDsn(String data){
        String[] array = data.split("-");
        dsn.add(new Dosen(array[0],array[1],array[2],array[3]));
    }
    
    public void simpanMhs(){
        FileWriter file = null;
        try {
            file = new FileWriter("FileFolder/mhs.txt");
        } catch (Exception e) {
            System.out.println("File not found");
        }
        
        try {
            for (int i = 0; i < mhs.size(); i++) {
                String x = mhs.get(i).getNim()+"-"+mhs.get(i).getNama()+"-"+mhs.get(i).getProdi()+"-"+mhs.get(i).getFakultas();
                file.write(x+"\n");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("can't write");
        }
    }
    
    public void simpanDsn(){
        FileWriter file = null;
        try {
            file = new FileWriter("FileFolder/dsn.txt");
        } catch (Exception e) {
            System.out.println("File not found");
        }
        
        try {
            for (int i = 0; i < dsn.size(); i++) {
                String x = dsn.get(i).getNip()+"-"+dsn.get(i).getNama()+"-"+dsn.get(i).getProdi()+"-"+dsn.get(i).getFakultas();
                file.write(x+"\n");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("can't write");
        }
    }
    
    public void PecahAkun(String x){
        String[] array = x.split("-");
        akun.add(new Akun(array[0], array[1],array[2],array[3],array[4]));
    }
    
    public void simpanRegister(String x){
        FileWriter file = null;
        try {
            file = new FileWriter("FileFolder/akun.txt");
        } catch (Exception e) {
            System.out.println("File not found");
        }
        
        try {
            for (int i = 0; i<akun.size(); i++) {
                String y = akun.get(i).getNama()+"-"+akun.get(i).getTTL()+"-"+akun.get(i).getAlamat()+"-"+akun.get(i).getID()+"-"+akun.get(i).getPW();
                file.write(y+"\n");
            }
            file.close();
        } catch (Exception e) {
            System.out.println("can't write");
        }
    }
}
