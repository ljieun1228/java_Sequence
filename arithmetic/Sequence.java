package arithmetic;

/*등차수열 : 연속하는 두 항의 차이가 모두 일정한 수열
 * 공차(common difference) : 공통적으로 나타나는 차 
 */
//2+8+14+20+26=70
public class Sequence {
	public static void main(String[] args) {
		int sum = 0;
		for(int i=0;i<5;i++){
			if(i!=4){
				System.out.print(2+6*i+"+");
			}else
				System.out.print(2+6*i+"=");
		}
		for(int i=0;i<5;i++){
			sum += 2+6*i;
		}
			System.out.print(sum);
	}
}