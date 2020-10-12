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
		System.out.println("카드셋팅완료\n");
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
		
		System.out.println("카드셋팅완료\n");
	}
	
	
	void pick() {
		Scanner sc=new Scanner(System.in);
		for(int k=0; k<2; k++) {
		System.out.println("플레이어이름?");
		String name=sc.next();
		System.out.println("이름 : " + name);
		System.out.println("몇장?\n");
		int pickcount=sc.nextInt();
		P001[]pickCard=new P001[count+pickcount];
		
		for(int i =count; i<(count+pickcount); i++) {
			if(i==deck.length) {
				System.out.println("카드가없네요?");
				break;
			}
			
			deck[i].name=name;
			pickCard[i]=new P001();
			pickCard[i]=deck[i];
			System.out.println(name +"씨 "+pickCard[i].num+pickCard[i].kind + "획득");
			
		}
		count+=pickcount;
		System.out.println("현재 " + count+ " 장 뽑음");
		
	}
	}
	
	void check(){
		Scanner sc=new Scanner(System.in);
		System.out.println("플레이어이름?");
		String name=sc.next();
		
		for(int i=0; i<count; i++) {
			if(name.equals(deck[i].name)) {
				System.out.println(deck[i].num+deck[i].kind);
			}
		}
		
	}
	
	
	
}
