package com.ss;

public class Demo01 {

	private static int le;

	public static void main(String[] args) {
		abs(10);
	}
	
	//计算一个整数的绝对值
	public static int abs(int x) {
		if (x<0) {
			return -x;
		}else {
			return x;
		}
	}
	
	//计算一个浮点型数的绝对值
	public static double abs(double x) {
		if(x<0.0)
			return -x;
		else
			return x;
	}
	
	//判断一个数是否为素数
	public static boolean isPrime(int N) {
		if (N<2)
			return false;
		for (int i = 2; i*i<=N; i++) 
			if (N%i==0) 
				return false;
		return true;
	}
	
	//计算平方根
	public static double sqrt(double c) {
		if(c<0)
			return Double.NaN;
		double err = le-15;
		double t = c;
		while (Math.abs(t-c/t)>err*t)
			t=(c/t+t)/2.0;
		return t;
			
	}
	
	//计算直角三角形的斜边
	public static double hypotenuse(double a,double b) {
		return Math.abs(a*a+b*b);
	}
	
	//计算调和级数
	public static double H(int N) {
		double sum=0.0;
		for (int i = 0; i <=N; i++) 
			sum+=1.0/i;
		return sum;
		
	}
	
}
