/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan22.lingkaran;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : program untuk menghitung jari-jari, luas, dan keliling
 * lingkaran
 */
public class PBO210118068Latihan22Lingkaran {
    
    public static int diameter = 0;
    public static int jariJari = 0;
    public static String luas, keliling;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        diameter = inputDiameter();
        
        // menghitung jari-jari, luas, keliling dan formatting
        jariJari = diameter / 2;
        luas = String.format("%.2f", (Math.PI * jariJari * jariJari))
                .replace('.', ',');
        keliling = String.format("%.2f", (2 * Math.PI * jariJari))
                .replace('.', ',');
        
        tampilHasil();
    }
    
    /**
     * Fungsi untuk input diameter
     * 
     * @return integer
     */
    public static int inputDiameter() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("======Perhitungan Lingkaran======");
        
        boolean looped = false;
        
        do {
            if(looped) {
                System.out.println("Nilai Diameter Tidak Sesuai\n");
                scanner.nextLine();
            }
            
            System.out.print("Masukkan nilai diameter lingkaran : ");
            
            looped = true;
        } while(!scanner.hasNextInt());
        
        return scanner.nextInt();
    }
    
    /**
     * Fungsi untuk menampilkan hasil perhitungan lingkaran
     */
    public static void tampilHasil() {
        System.out.println("\n====Hasil Perhitungan Lingkaran====");
        System.out.println("Jari-jari Lingkaran = " + jariJari + " cm");
        System.out.println("Luas Lingkaran = " + luas + "cm");
        System.out.println("Keliling Lingkaran = " + keliling + " cm");
    }
    
}
