package 函数;

import java.util.Scanner;

public class DefineFunction {
	public static boolean isPrime(int i)
	{
		boolean isPrime=true;
		for(int k=2;k<i;k++)
		{
			if(i%k==0)
			{
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		// 素数求和
		int m=in.nextInt();
		int n=in.nextInt();
		if(m==1) m=2;
		int cnt=0;
		int sum=0;
		for(int i=m;i<=n;i++)
		{
			if(isPrime(i))
			{
				cnt++;
				sum+=i;
			}
		}
		System.out.println("在"+m+"和"+n+"之间有"+cnt+"个素数，总和为"+sum);
	}

}
