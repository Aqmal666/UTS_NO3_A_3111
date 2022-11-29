/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3111;

/**
 *
 * @author Hadgy Hanan Aqmal
 */
public class AsisPrak_3111 extends Mahasiswa_3111   {
    public String mkAsistensi_3111;
    public int jmlPertemuan_3111;
    
    public AsisPrak_3111(String nama_3111,String nim_3111,String jurusan_3111,int ipk_3111,String mkAsistensi_3111,int jmlPertemuan_3111){
        super(nama_3111,nim_3111,jurusan_3111,ipk_3111);
        this.mkAsistensi_3111 = mkAsistensi_3111;
        this.jmlPertemuan_3111 = jmlPertemuan_3111;
    }
    public double totalPendapatan(){
        return jmlPertemuan_3111 * 50000;
    }
    public void tampilDataMhs(){
        System.out.println("Mata kuliah : " +mkAsistensi_3111);
        System.out.println("Jumlah pertemuan : " + jmlPertemuan_3111);
    }
}
