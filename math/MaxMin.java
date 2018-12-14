package math;

import java.util.Random;
/*
<문제>
1개 반의 학생의 몸무게를 측정하였다.
- 각 반의 학생수는 30명이다.
- 각 반의 학생 몸무게의 최대, 최소값을 구하시오.
- 단, 몸무게는 40~100사이에서만 랜덤으로 생성시키시오.
 */

public class MaxMin {
	public static void main(String[] args) {
		int[] W = new int[30];
		int max = 40, min = 100;
		Random random = new Random();
		for (int i = 0; i <30; i++) {
			W[i] = random.nextInt(61)+40;	
		System.out.println(W[i]);
		}		
		for(int i = 0; i <30; i++){
				if(W[i]>=max){
					max=W[i];
				}else if(W[i]<=min){
					min=W[i];
				}
			}
		System.out.printf("각 반의 학생 몸무게의 최대%d, 최소값은 %d",max,min);
	}
}

