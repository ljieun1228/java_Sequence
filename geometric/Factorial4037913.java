package geometric;

//5! = 5*4*3*2*1
//10항까지의 시리즈는 4037913 이다.

public class Factorial4037913 {

	public static void main(String[] args) {
		int S = 1;
		int F = 1;
		int N = 1;
		
		while(true){
			N++;
			F *= N;
			S += F;
	       if(N>=10){
	    	   break;
			}
			System.out.println(S+" "+F+" "+N);
		}
		System.out.printf("S is %d",S);//4037913
	}

}
