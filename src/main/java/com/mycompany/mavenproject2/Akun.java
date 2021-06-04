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
public class Akun {
   private  String nama;
   private  String TTL;
   private String Alamat;
   private String ID;
   private String PW;
   
   public Akun(String nama,String TTL,String Alamat,String ID, String PW){
       this.ID = ID;
       this.PW = PW;
       this.nama = nama;
       this.TTL = TTL;
       this.Alamat = Alamat;
   }
   public String getID(){
       return ID;
   }
   public void setID(String ID){
       this.ID = ID;
   }
   public String getPW(){
       return PW;
   }
   public void setPW(){
       this.PW = PW;
   }
   
   public void setNama(String nama){
       this.nama = nama;
   }
   
   public String getNama(){
       return this.nama;
   }
   
   public void setTTL(String TTL){
       this.TTL = TTL;
   }
   
   public String getTTL(){
       return this.TTL;
   }
   
   public void setAlamat(String alamat){
       this.Alamat = alamat;
   }
   
   public String getAlamat(){
       return this.Alamat;
   }
}
