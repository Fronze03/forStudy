package card;

import java.util.Scanner;

public class P001C {
public static void main(String[] args) {
	
	welcome();
	menu();
	//인원2명에게 카드 주기
	
	
	
}
	static void welcome() {
		System.out.println("===== \nMain \n===== \n");
	}
	static void welcome(String something) {
		System.out.println("===== \nMain \n===== \n");
		System.out.println(something + "===== \n");
	}
	
	static void menu() {
		Scanner sc= new Scanner(System.in);
		P001B deck= new P001B();
		loop1:while(true) {
		System.out.println("메뉴선택 \n1.카드소환 \n2.카드섞기 \n3.카드수령  \n4.카드확인 \n5.종료");
		int answer= sc.nextInt();
		
		switch(answer){
			case 1:
				deck.setCard();
			break;
			
			case 2:
				deck.shuffle();
			break;
			
			case 3:
				deck.pick();
			break;
			
			case 4:
				deck.check();
			break;
			
			
			case 5:
			System.out.println("시스템 종료");
			break loop1;
		}
			
		}
		
			}
}

