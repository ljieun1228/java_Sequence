package math;

import java.util.Scanner;

/*
합성수를 소수로 곱으로 나타내는 방법
20=2x2x5
 */
public class Factorization {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("소인수분해 할 수를 입력하세요.");
		int target = scanner.nextInt();
		int count = 0;
		String res1 = "";
		int[] res = new int[count];
		if(target<2){
			return;
		}
		for(int i = 2; i<target; i++){	
			if(target%i==0){
				 res[count]=i; 
				 count++;
	
			}else{}
			System.out.println(res[count]);
		}	
	}
}
