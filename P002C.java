import java.util.Scanner;

public class P002C {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	P002 deck = new P002();
	
	System.out.println("");
	deck.shuffle(6);
	System.out.println("");
	
	
	
	for(int i=0; i<3; i++) {
		System.out.println(i+"Â°ÀÔ·Â");
		int x = sc.nextInt();
		deck.shufflePick(x);
		System.out.println("");
	}
	
	





}

}