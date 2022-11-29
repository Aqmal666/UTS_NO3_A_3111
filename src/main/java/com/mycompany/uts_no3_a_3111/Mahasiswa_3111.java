/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3111;

/**
 *
 * @author Hadgy Hanan Aqmal
 */
public class Mahasiswa_3111 {
    protected String nim_3111;
    protected String nama_3111;
    protected String jurusan_3111;
    protected int ipk_3111;
    
    public Mahasiswa_3111(String nim_3111,String nama_3111,String jurusan_3111,int ipk_3111){
        this.nama_3111 = nama_3111;
        this.nim_3111 = nim_3111;
        this.jurusan_3111 = jurusan_3111;
        this.ipk_3111 = ipk_3111;
    }
    public void tampilDataMhs() {
        System.out.println("Nama : " + nama_3111);
        System.out.println("NIM : " + nim_3111);
        System.out.println("Jurusan : " + jurusan_3111);
        System.out.println("IPK : " + ipk_3111);
    }
}

