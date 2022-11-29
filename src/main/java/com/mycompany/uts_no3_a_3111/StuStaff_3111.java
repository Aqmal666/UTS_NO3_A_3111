/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_a_3111;

/**
 *
 * @author Hadgy Hanan Aqmal
 */
public class StuStaff_3111 extends Mahasiswa_3111 {
    public int unitKerja_3111;
    public int jamKerja_3111;
    
    public StuStaff_3111 (String nama_3111,String nim_3111,String jurusan_3111,int ipk_3111,int unitKerja_3,int jamKerja_3111){
        super(nama_3111,nim_3111,jurusan_3111,ipk_3111);
        this.unitKerja_3111= unitKerja_3111;
        this.jamKerja_3111 = jamKerja_3111;
    }
    public double totalPendapatan(){
        return jamKerja_3111 * 30000;
    }
    public void tampilDataMhs(){
        System.out.println("Unit kerja : " + unitKerja_3111);
        System.out.println("Jam kerja : " + jamKerja_3111);
        
    }
}