package card;

import java.util.Scanner;

public class P001B {
	P001[] deck=new P001[52];
	int count=0;
	
	
	
	void setCard() {
	
		for(int i=0; i<4; i++) {
			for(int j=0; j<13; j++) {
				deck[(i*13+j)]=new P001(j,i);
				
				
			}
		}
//		for(int i=0; i<deck.length; i++) {
//			System.out.println(deck[i].num + deck[i].kind);
//		}
		System.out.println("ī����ÿϷ�\n");
	}
	


	void shuffle(){
		P001 temp=new P001();
		for(int i=0; i<200; i++) {
			int random=(int) (Math.random()*52);
			temp=deck[0];
			deck[0]=deck[random];
			deck[random]=temp;
			
			
		}
		
		
//		for(int i=0; i<deck.length; i++) {
//			System.out.println(deck[i].num + deck[i].kind);
//		}
		
		System.out.println("ī����ÿϷ�\n");
	}
	
	
	void pick() {
		Scanner sc=new Scanner(System.in);
		for(int k=0; k<2; k++) {
		System.out.println("�÷��̾��̸�?");
		String name=sc.next();
		System.out.println("�̸� : " + name);
		System.out.println("����?\n");
		int pickcount=sc.nextInt();
		P001[]pickCard=new P001[count+pickcount];
		
		for(int i =count; i<(count+pickcount); i++) {
			if(i==deck.length) {
				System.out.println("ī�尡���׿�?");
				break;
			}
			
			deck[i].name=name;
			pickCard[i]=new P001();
			pickCard[i]=deck[i];
			System.out.println(name +"�� "+pickCard[i].num+pickCard[i].kind + "ȹ��");
			
		}
		count+=pickcount;
		System.out.println("���� " + count+ " �� ����");
		
	}
	}
	
	void check(){
		Scanner sc=new Scanner(System.in);
		System.out.println("�÷��̾��̸�?");
		String name=sc.next();
		
		for(int i=0; i<count; i++) {
			if(name.equals(deck[i].name)) {
				System.out.println(deck[i].num+deck[i].kind);
			}
		}
		
	}
	
	
	
}
