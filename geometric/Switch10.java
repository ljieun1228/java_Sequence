package geometric;

//1-2+ 3 -4+ 5 -6+ 7 -8 +9 -10 +11 -12 +13 -14 +15 -16 +17 -18 +19- 20 =-10

public class Switch10 {

	public static void main(String[] args) {
	int res = 0;
		for(int i=0;i<=20;i++){
			res += (i%2==0)? -i : +i; //삼항연산자 if 문을 간략하게 만든다.(컨디션)?참 일때:거짓 일때
		}		
		System.out.println(res);
	}
}

/*if (i%2==0){
	res-=i; 
}else{
	res+=i;
}*/