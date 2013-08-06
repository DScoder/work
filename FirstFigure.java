
public class FirstFigure {
	public static void main(String[] args){
		
		int sizeFig = 9; //Write your own size
		
		for(int i=0; i < sizeFig; i++) {	           
			for(int k = 0; k < sizeFig; k++) {  
				if( k == sizeFig - (sizeFig/2) - i - 1 || k == (sizeFig/2) + i || 
						(i > (sizeFig/2) - 1 && k ==  sizeFig + (sizeFig/2) - i - 1 ) || 
						(i > (sizeFig/2) - 1 && k == (sizeFig/2) - sizeFig + i + 1)  ) 
					System.out.print("* ");
				else 
					System.out.print("  ");    
			}
        System.out.println();
        
		}
	}
}
		


