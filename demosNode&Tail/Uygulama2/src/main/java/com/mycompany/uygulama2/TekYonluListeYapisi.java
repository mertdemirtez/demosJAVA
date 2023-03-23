/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uygulama2;

/**
 *
 * @author Hilmi
 */
public class TekYonluListeYapisi {
	Node head=null;
	Node tail=null;
	void basaEkle(int x){
		Node eleman=new Node();
		eleman.data=x;
		
	if(head==null){
		eleman.next=null;
		head=eleman;
		tail=eleman;
		System.out.println("Liste olusturuldu");
		
	}
	else{
		eleman.next=head;
		head=eleman;
		System.out.println("basa eleman eklendi");
		
		
	}
		
	}
	void sonaEkle(int x){
		
		Node eleman=new Node();
		eleman.data=x;
	
		if(head==null){
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.println("liste yapisi olusturuldu,ilk eleman eklendi");
		}
		else{
			eleman.next=null;
			tail.next=eleman;
			tail=eleman;	
			
			System.out.println("sona eleman eklendi");
		}
		
		
	}
	void arayaEkle(int indis,int x){
		
		Node eleman=new Node();
		eleman.data=x;
	
		if(head==null && indis==0){
			eleman.next=null;
			head=eleman;
			tail=eleman;
			System.out.println("liste yapisi olusturuldu,ilk eleman eklendi");
		}
		else if(head!=null && indis==0){
		eleman.next=head;
		head=eleman;
		System.out.println(indis +". indise yeni eleman eklendi");	
			
		}
		else{
			
		int n=0;
		Node temp=head;
		Node temp2=head;
		while(temp.next!=null){
			n++;
			temp2=temp;
			temp=temp.next;
			
		}	
		if(n==indis ){
		temp2.next=eleman;	
		eleman.next=temp;
		System.out.println("eleman eklendi");
		}
		else{
		temp=head;
		temp2=head;
		int i=0;
			while(i<indis){
			temp2=temp;
			temp=temp.next;	
				i++;
			}
		temp2.next=eleman;
		eleman.next=temp;
		System.out.println(indis+".siraya yeni eleman eklendi");
		
		
		}
		
		
		
		}
		
		
	}
	void bastanSil(){
	if(head==null){
	System.out.println("Liste bos,silinecek eleman yok");	
	}	
	else if(head.next==null)
	{
	head=null;
        tail=null;
        System.out.println("Listede kalam son eleman silindi");		
	}	
	else
	{	
	head=head.next;
	System.out.println("bastaki eleman silindi");
	}	
		
		
	}
	void sondanSil(){
	if(head==null){
	System.out.println("Liste bos,silinecek eleman yok");	
	}	
	else if(head.next==null)
	{
	head=null;
        tail=null;
        System.out.println("Listede kalam son eleman silindi");		
	}	
	else
	{	
         Node temp=head;
	 Node temp2=head;
	 while(temp.next!=null){
		 temp2=temp;
		 temp=temp.next;
		 
	 }
	 temp2.next=null;
	 tail=temp2;
	 System.out.println("sondan eleman silindi");	
	}	
		
		
	}
	void aradanSil(int indis){
		if(head==null){
			System.out.println("Liste bos , ne silek");
		}
		else if(head.next==null && indis==0){
			head=null;
			tail=null;
			System.out.println("Son eleman silindi");
		}
		else{
		int i=0;
		Node temp=head;
		Node temp2=head;
			while(temp!=null){
				i++;
				temp2=temp;
				temp=temp.next;	
			}
			if(i==indis){
				temp2.next=null;
				tail=temp2.next;
				System.out.println("Listedeki son eleman silindi");
			}
			else{
			temp=head;
		        temp2=head;	
				
			int j=0;	
			while(j!=indis){
			temp2=temp;
			temp=temp.next;
			j++;
			}	
			temp2.next=temp.next;	
			System.out.println("aradaki nesne silindi");
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	void yazdir(){
				

		if(head==null){
		System.out.println("liste yapisi bos");
		}
		else{
		Node temp =head;
		System.out.print("bas   ");
		while(temp!=null){
			
			System.out.print(temp.data + " -> ");
			temp=temp.next;
		}
			System.out.print("   son");
		}
		
	
	}
	
}
