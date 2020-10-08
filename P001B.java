import java.util.Arrays;



public class P001B {

	int[] num;
	int[] kind;
	int[][] card;
	int cardNum;
	int kindNum;
	
	
	
	P001B(){
		}
	P001B(int cardNum,int kindNum){
		int[] num=new int[cardNum];
		this.num=num;
		int[] kind=new int[kindNum];
		this.kind=kind;
		int[][] card=new int[cardNum][kindNum];
		this.card=card;
	
	for(int i=0; i<cardNum; i++) {
		num[i]=(i+1);
	}

	
	
	System.out.println(Arrays.toString(num));
	
	
	for(int i=0; i<kindNum; i++) {
		kind[i]=(100*i);
	}
	
	
	System.out.println(Arrays.toString(kind));
	
	
	for(int i=0; i<cardNum; i++) {
			card[i][0]=num[i];
		}
	for(int i=0; i<cardNum; i++) {
		for(int j=0; j<kindNum; j++) {
			
		card[i][j]= num[i]+kind[j];
	}
	}	
//		
//	System.out.println(Arrays.deepToString(card));
//	
//	
	
	
	}
		




}







