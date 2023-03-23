/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uygulama2;

import java.util.Scanner;

/**
 *
 * @author Hilmi
 */
public class Uygulama2 {

    public static void main(String[] args) {
         TekYonluListeYapisi tekYonList=new TekYonluListeYapisi();
	 int secim = 1;
	 Scanner scanner=new Scanner(System.in);
	 int sayi,indis;
	 
	 while(secim != 0){
	System.out.println();
	System.out.println("1 basa ekle");
	System.out.println("2 sona ekle");	 
	System.out.println("3 araya ekle");	 
	System.out.println("4 bastan sil");	 
	System.out.println("5 sondan sil");	 
	System.out.println("6 aradan sil");	 
	System.out.println("0 cikis");	 
	System.out.println("seciminiz : ");	 
	secim=scanner.nextInt();
		 
	if(secim==1){
		System.out.println("sayi:");
		sayi=scanner.nextInt();
		tekYonList.basaEkle(sayi);
	}
	else if(secim==2){
		System.out.println("sayi:");
		sayi=scanner.nextInt();
		tekYonList.sonaEkle(sayi);
	}
	else if(secim==3){
		System.out.println("hangi siraya :");
		indis=scanner.nextInt();
		System.out.println("sayi:");
		sayi=scanner.nextInt();
		tekYonList.arayaEkle(indis, sayi);
	}
	else if(secim==4){
		tekYonList.bastanSil();
	}
	else if(secim==5){
		tekYonList.sondanSil();
	}
	else if(secim==6){
		System.out.println("hangi sırayı silmek istersin:");
		indis=scanner.nextInt();
		tekYonList.aradanSil(indis);
	}
	else if(secim==0){
	 System.out.println("program sonlandırıldı");
	
	 }
	 else
	 System.out.println("hatali secim yaptiniz");
	 
	 tekYonList.yazdir();
	 
	 
	 
	 
	 }
    }
}
