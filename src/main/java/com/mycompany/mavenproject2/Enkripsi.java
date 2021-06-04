/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject2;

/**
 *
 * @author HP
 */
import java.util.Arrays;

public class Enkripsi {
    public static void main(String[] args) {
        String kalimat = "@miftah140402";

        System.out.println(enkripsi(kalimat,kalimat.substring(0,3)));
    }

    static String enkripsi (String x,String keys){
        String key = keys;
        String isitext = (key.length())+key+x;
        System.out.println(isitext);
        String out= "" ;
        for (int i = 0; i < isitext.length(); i++) {
            int index = isitext.charAt(i);
            char s = (char)(index+1) ;
            out += String.valueOf(s);
        }

        return out;
    }

    static String dekripsi(String x,String keys){
        String isitext = x;
        char k = (char)(isitext.charAt(0));
        String key = "",out = "";
        int  jumKey = Integer.parseInt(String.valueOf(k))-1;
        System.out.println(String.valueOf(k));
        for (int i = 1 ; i <= jumKey; i++) {
            int index = isitext.charAt(i);
            char s = (char)(index-1) ;
            key = key + String.valueOf(s);
            System.out.print(String.valueOf(s)+" "+(index));
        }
        System.out.println();
        if (key.equals(keys)){ // hasil true
            for (int i = (jumKey+1) ; i < isitext.length(); i++) {
                int index = isitext.charAt(i);
                char s = (char)(index-1) ;
                out = out + String.valueOf(s);
            }
            return out;
        }else{
            return "Key tidak ditemukan";
        }
    }
}

