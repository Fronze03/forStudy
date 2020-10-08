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
		// 학생성적 출력

	static void printScore(Student2[] stu,int count) {
		// 번호 이름 국어 영어 수학 합계 평균 등수
		String[] nameCard = { "번호", "이름", "국어", "영어", "수학", "과학" , "합계", "평균", "등수" };
		System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
				nameCard[0],nameCard[1],nameCard[2],nameCard[3],nameCard[4],nameCard[5],nameCard[6]
						,nameCard[7],nameCard[8]);
		for(int i=0;i<count;i++) {
			System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
					stu[i].number,stu[i].name,stu[i].kor,stu[i].eng,stu[i].math,stu[i].sci,
					stu[i].total,stu[i].avg,stu[i].rank);			
		}
	}

	// 학생성적 입력
	static int inputScore(Student2[] stu,int count) {
		Scanner scan = new Scanner(System.in);
		int number = 0, kor = 0, eng = 0, math = 0, sci=0, total=0;
		double avg=0;
		String name = "";
		for (int i = 0; i < stu.length; i++) {
			System.out.println(" [성적 입력 페이지]");
			number = i + 1;
			System.out.print("이름입력 : ");
			name = scan.next();
			if (name.equals("0")) {
				System.out.print("종료");
				break;
			}
			System.out.print("국어점수 입력 : ");
			kor = scan.nextInt();
			System.out.print("영어점수 입력 : ");
			eng = scan.nextInt();
			System.out.print("수학점수 입력 : ");
			math = scan.nextInt();
			System.out.print("과학점수 입력 : ");
			sci = scan.nextInt();
			stu[i] = new Student2(number,name,kor,eng,math,sci,total,avg);
			count++;
			
		}
		return count;
	}

	static void firstPrint() {
		System.out.println(" \n       성적처리 프로그램\n");
		System.out.println(" 1. 성적입력\n 2. 성적출력\n 3. 성적수정\n 4. 등수처리\n 0. 종료");
		System.out.print(" \n [선택 입력] : ");
	}
	
	static void printCollege() {
		System.out.print("과목선택 \n1.국\n2.영어\n3.수학\n4.과학");
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
		System.out.println("이름입력");
		name = sc.next();
		loop2: for(int i=0; i<=count; i++) {
			if(name.equals(stu[0].name)) {
				printCollege();				
				choice=sc.nextInt();
				switch(choice) {
				
				case 1:
					System.out.println("점수입력");
					stu[i].kor=sc.nextInt();
					stu[i].total=stu[i].kor+stu[i].eng+stu[i].math+stu[i].sci;
					
					String[] nameCard = { "번호", "이름", "국어", "영어", "수학", "과학" , "합계", "평균", "등수" };
					System.out.printf("\n%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\n",
							nameCard[0],nameCard[1],nameCard[2],nameCard[3],nameCard[4],nameCard[5],nameCard[6]
									,nameCard[7],nameCard[8]);
					
					
					System.out.printf("%d\t%s\t%d\t%d\t%d\t%d\t%d\t%.2f\t%d\n",
							stu[i].number,stu[i].name,stu[i].kor,stu[i].eng,stu[i].math,stu[i].sci,
							stu[i].total,stu[i].avg,stu[i].rank);	
					break;
				case 2:
					System.out.println("점수입력");
					stu[i].eng=sc.nextInt();
					stu[i].total=stu[i].kor+stu[i].eng+stu[i].math+stu[i].sci;
					break;
				case 3:
					System.out.println("점수입력");
					stu[i].math=sc.nextInt();
					stu[i].total=stu[i].kor+stu[i].eng+stu[i].math+stu[i].sci;
					break;
				case 4:
					System.out.println("점수입력");
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

