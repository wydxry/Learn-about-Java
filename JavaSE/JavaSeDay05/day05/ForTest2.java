package day05;

public class ForTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ˮ�ɻ���
		for(int i=100;i<1000;i++) {
			int a=i/100;
			int b=(i/10)%10;
			int c=i%10;
			if(i == a*a*a+b*b*b+c*c*c) {
				System.out.println(i);
			}
		}
		
	}

}
