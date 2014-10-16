package cs56_p1;

public class Fibonacci {
	public static void main(String[] args){
		Fibonacci test1 = new Fibonacci();
		test1.allFib(1);
		System.out.println(test1.nthFib(2));
		System.out.println(test1.prevFib(6));
	}
	public void allFib(int num){
		int fib0 = 0, fib1 = 1;
		int fibNow = 1;
		if (num < 0)
			return;
		else if (num <= 1){
			for (int i=0; i<=num; i++)
				System.out.println(i);
		}
		else {
			System.out.println(0);
			System.out.println(1);
			while (fibNow <= num){
				System.out.println(fibNow);
				fib0=fib1;
				fib1=fibNow;
				fibNow=fib0+fib1;
			}
		}
	}
	
	
	public int nthFib (int num){
		int fib0 = 0, fib1 = 1;
		int fibNow = 0 ; 
		if (num < 0)
			return -1;
		else if (num <= 1){
			return num;
		}
		else{
			for (int i=2; i<=num; i++){
				fibNow=fib0+fib1;
				fib0=fib1;
				fib1=fibNow;				
			}
			return fibNow;
		}
			
	}
	public int nextFib  (int num){
		int i=0;
		while (num > nthFib(i))
			i++;
		return nthFib(i);
	}
	public int prevFib (int num){
		int i=0;
		while (num >= nthFib(i))
			i++;
		return nthFib(i-1);
	}	
}
