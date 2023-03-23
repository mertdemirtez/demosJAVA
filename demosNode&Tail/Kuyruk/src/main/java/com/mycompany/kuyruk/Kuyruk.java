/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.kuyruk;

/**
 *
 * @author Hilmi
 */
public class Kuyruk {

    public static void main(String[] args) {
    KuyrukYapisi kuyruk=new KuyrukYapisi(5);
    
    kuyruk.ekle(23);   
    kuyruk.ekle(45);
    kuyruk.ekle(67);
 
    kuyruk.arayaekle(2 ,5);
     
     kuyruk.yazma();
    }
}
