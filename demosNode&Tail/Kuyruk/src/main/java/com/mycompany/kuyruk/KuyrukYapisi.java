/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kuyruk;

/**
 *
 * @author Hilmi
 */
public class KuyrukYapisi {
	Node front;
	Node rear;
	int cnt;
	int size;
	 public KuyrukYapisi(int size){
		 this.size=size;
		 cnt=0;
		 front=null;
		 rear=null;
	 }
	void ekle(int data){
		
		if(İsfull()){
			System.out.println("kuyruk dolu");
		}
		else{
			Node eleman=new Node(data);
			if(İsEmpty()){
				front=eleman;
				rear=eleman;
				System.out.println(data+" ilk eleman olarak eklendi");
			}
			else{
				rear.next=eleman;
				rear=rear.next;
				System.out.println(data+" kuyruga eklendi");
				
			}
			cnt++;
		}
			
	}
	void arayaekle(int index,int data){
		if(İsfull()){
			System.out.println("dolu aga");
		}
		else{
			Node eleman=new Node(data);
			if(index==0 && front==null){
			front=eleman;
		        rear=eleman;
		        System.out.println(data+" ilk eleman olarak eklendi");	
			}
			else if(index==1){
				eleman.next=front;
				rear=front;
				front=eleman;
				
			}
			else if(index==2){
				front.next=eleman;
				eleman.next=rear;
			}
			else if(index==3){
		while(eleman.next!=null){
			eleman=eleman.next;
			
		}
		eleman.next=rear;
			}
			
			
			
		}
		
		
		
		
	}
	void silme(){
		if(İsEmpty()){
			System.out.println("kuyruk bos");
		}
		else{
			System.out.println(front.data +"-silindi");
			front=front.next;
			cnt--;
		}
	}

	private boolean İsfull(){
		return cnt==size;
	}

	private boolean İsEmpty() {
		return cnt ==0;
	}
	void yazma() {
		if(İsEmpty()){
		System.out.println("kuyruk boş yazacak bişey yok");	
			
		}
		else{
			Node temp=front;
			System.out.print("bas= ");
			while(temp!=null){
				System.out.print(temp.data+" ");
	temp=temp.next;			
				
			}
			System.out.print(" =son");
		}
		
	}
}
