/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO_IF2_10116414_Latihan17_ProgramTunjangan;

import java.util.Scanner;

/**
 *
 * @author sweenutt
 * NAMA         : FAEL ANTONI WIJAYA
 * KELAS        : PBO-2
 * NIM          : 10116414
 * DESKRIPSI    : Program Tunjangan
 */
public class PBO_IF2_10116414_ProgramTunjangan {
    public static void main(String[] args) {
    
        double gajipokok ;
        double total_gaji;
        String status;
        double tunjangan = 0;
        
        Scanner scan=new Scanner(System.in);
        
        /*Inputan data*/
        System.out.print ("Berapa Gaji pokok anda perbulan ?  : ");        
        gajipokok = scan.nextDouble();
        
        System.out.print ("Satus Anda (Menikah/Belum) : ");        
        status = scan.next();       
        
        /*Pemilihan status dengan fungsi IF*/
        if (status.equals("Belum"))
        {
            gajipokok = gajipokok;
        }
        else
            {
                tunjangan = (gajipokok * 0.35); 
            }                 
        /*Perhitungan total gajil*/
        total_gaji = gajipokok + tunjangan;
        /*Menampilkan hasil*/        
        System.err.println ("\nGaji Pokok      : " +gajipokok); 
        System.err.println ("Tunjangan \t: " + tunjangan);        
        System.err.println ("================================ +");  
        System.err.println ("Total gaji      : " +total_gaji);   
    }
}
