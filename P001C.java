package card;

import java.util.Scanner;

public class P001C {
public static void main(String[] args) {
	
	welcome();
	menu();
	//�ο�2���� ī�� �ֱ�
	
	
	
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
		System.out.println("�޴����� \n1.ī���ȯ \n2.ī�弯�� \n3.ī�����  \n4.ī��Ȯ�� \n5.����");
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
			System.out.println("�ý��� ����");
			break loop1;
		}
			
		}
		
			}
}

