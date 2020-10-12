package card;

public class P001 {

	String[] kindDeck= {" clover "," heart "," spade "," diamond "};
	String[] numDeck= {"a","2","3","4","5","6","7","8","9","10","j","q","k"};
	
	String kind;
	String num;
	String name;
	
	P001(){
	}
	P001(int num, int kind){
		this.kind=kindDeck[kind];
		this.num=numDeck[num];
		
	}
	
	
}
