
public class P002 {
	
	
	P002B[] card=new P002B[28];
	
	P002(){
	for(int i =0; i<4; i++) {
		for(int j =0; j<7; j++) {
			
			
			card[(i*7)+j]= new P002B(i,j);
			System.out.println(card[(i*7)+j].kind2 + card[(i*7)+j].num2);
			
			
		}
		
			
	}
	}
	
	
	P002(int x,int y){
		for(int i =0; i<4; i++) {
			for(int j =0; j<7; j++) {
				
				
				card[(i*7)+j]= new P002B(i,j);
				
				
			}
			
				
		}
		System.out.println(card[(x*7)+y].kind2 + card[y].num2);
		}
	
	
	
	void shuffle() {
	}
	void shuffle(int x) {
		P002B temp = new P002B();
		
		for(int i=0; i<100 ; i++) {
			int r= (int)(Math.random()*27);
			temp=card[0];
			card[0] = card[r];
			card[r]=temp;
			
		}
		
		for(int i=0; i<x; i++) {
		System.out.println(card[i].kind2+card[i].num2);
		}
		
	}
	
	void shufflePick(int x) {
		P002B temp = new P002B();
		
		for(int i=0; i<100 ; i++) {
			int r= (int)(Math.random()*27);
			temp=card[0];
			card[0] = card[r];
			card[r]=temp;
			
		}
		System.out.println(card[x].kind2+card[x].num2);
	}
	
	
	
}
