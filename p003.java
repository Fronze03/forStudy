package p1006;

import java.util.Scanner;

public class p003 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count =0;
		Student2[] stu = new Student2[20];
		int input_num = 0;
		loop1: while (true) {
			p003.firstPrint();
			input_num = scan.nextInt();
			switch (input_num) {
			case 1:
				count = inputScore(stu,count);
				break;
			case 2:
				printScore(stu,count);
				break;
			case 3:
				modifyScore(stu,count);
				break;
			case 4:
				rankScore(stu,count);
				break;
			case 0:
				break loop1;
			}

		}

	}// main
		// �л����� ���

	static void printScore(Student2[] stu,int count) {
		// ��ȣ �̸� ���� ���� ���� �հ� ��� ���
		String[] nameCard = { "��ȣ", "�̸�", "����", "����", "����", "����" , "�հ�", "���", "���" };
		System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				nameCard[0],nameCard[1],nameCard[2],nameCard[3],nameCard[4],nameCard[5],nameCard[6]
						,nameCard[7],nameCard[8]);
		for(int i=0;i<count;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					stu[i].number,stu[i].name,stu[i].kor,stu[i].eng,stu[i].math,stu[i].sci,
					stu[i].total,stu[i].avg,stu[i].rank);			
		}
	}

	// �л����� �Է�
	static int inputScore(Student2[] stu,int count) {
		Scanner scan = new Scanner(System.in);
		int number = 0, kor = 0, eng = 0, math = 0, sci=0, total=0;
		double avg=0;
		String name = "";
		for (int i = 0; i < stu.length; i++) {
			System.out.println(" [���� �Է� ������]");
			number = i + 1;
			System.out.print("�̸��Է� : ");
			name = scan.next();
			if (name.equals("0")) {
				System.out.print("����");
				break;
			}
			System.out.print("�������� �Է� : ");
			kor = scan.nextInt();
			System.out.print("�������� �Է� : ");
			eng = scan.nextInt();
			System.out.print("�������� �Է� : ");
			math = scan.nextInt();
			System.out.print("�������� �Է� : ");
			sci = scan.nextInt();
			stu[i] = new Student2(number,name,kor,eng,math,sci,total,avg);
			count++;
			
		}
		return count;
	}

	static void firstPrint() {
		System.out.println(" \n       ����ó�� ���α׷�\n");
		System.out.println(" 1. �����Է�\n 2. �������\n 3. ��������\n 4. ���ó��\n 0. ����");
		System.out.print(" \n [���� �Է�] : ");
	}
	
	static void printCollege() {
		System.out.print("������ \n1.��\n2.����\n3.����\n4.����");
	}
	
	static void rankScore(Student2[] stu,int count) {
		int rankc=1;
		for(int i=0;  i<count;i++) {
			for(int j=0;  j<count;j++) {
				if(stu[i].total<stu[j].total) {
					rankc++;
				}
				stu[i].rank=rankc;
				rankc=1;
			}
			
		}
		printScore(stu,count);
	}
	static void modifyScore(Student2[] stu,int count) {
		int choice=0;
		Scanner sc = new Scanner(System.in);
		String name = "";
		System.out.println("�̸��Է�");
		name = sc.next();
		loop2: for(int i=0; i<=count; i++) {
			if(name.equals(stu[0].name)) {
				printCollege();				
				choice=sc.nextInt();
				switch(choice) {
				
				case 1:
					System.out.println("�����Է�");
					stu[i].kor=sc.nextInt();
					stu[i].total=stu[i].kor+stu[i].eng+stu[i].math+stu[i].sci;
					
					String[] nameCard = { "��ȣ", "�̸�", "����", "����", "����", "����" , "�հ�", "���", "���" };
					System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
							nameCard[0],nameCard[1],nameCard[2],nameCard[3],nameCard[4],nameCard[5],nameCard[6]
									,nameCard[7],nameCard[8]);
					
					
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							stu[i].number,stu[i].name,stu[i].kor,stu[i].eng,stu[i].math,stu[i].sci,
							stu[i].total,stu[i].avg,stu[i].rank);	
					break;
				case 2:
					System.out.println("�����Է�");
					stu[i].eng=sc.nextInt();
					stu[i].total=stu[i].kor+stu[i].eng+stu[i].math+stu[i].sci;
					break;
				case 3:
					System.out.println("�����Է�");
					stu[i].math=sc.nextInt();
					stu[i].total=stu[i].kor+stu[i].eng+stu[i].math+stu[i].sci;
					break;
				case 4:
					System.out.println("�����Է�");
					stu[i].sci=sc.nextInt();
					stu[i].total=stu[i].kor+stu[i].eng+stu[i].math+stu[i].sci;
					break;
				case 5:
					
					break loop2;
					
				}
				
			}
		}
	}
	
	
	
	
	}

