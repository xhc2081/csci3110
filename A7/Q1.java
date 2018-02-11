import java.util.Scanner;





/**
 * 
 * Fomula : f(x)= 	1. if x < 0 ---> 0
 * 					2. if x == 1 -----> 1
 * 					3. if x > 1 ----> f(x-1)+f(x-2)+f(x-3)
 * 
 * Implemention below O(3^n)
 * 
 * array a is for memoization
 * 
 * Complexity is O(n)
 *
 */
public class Q1 {
	
	//a array to memorize the result
	int a[]=new int[100005];
	
	//scanner for input
	Scanner scanner=new Scanner(System.in);
	
	/**
	 * constructor to init the array
	 */
	public Q1() {
		// TODO Auto-generated constructor stub
		
		//init for a array
		for(int i=0;i<a.length;i++)
		{
			a[i]=0;
		}
		a[0]=1;
	}
	
	/**
	 * calculate the result according to the fomula
	 * @param x
	 * @return
	 */
	public int getRes(int x)
	{
		if(x<0)
			return 0;
		if(x==0)
			return 1;
		if(a[x]!=0)
		{
			return a[x];
		}
		int sum=0;
		for(int i=1;i<=3;i++)
		{
			sum+=getRes(x-i);
		}
		a[x]=sum;
		return sum;
	}
	
	/**
	 * for program run , user input and output
	 */
	public void run()
	{
		while(true)
		{
			System.out.print("Please input the number of n :");
			int n=scanner.nextInt();
			int res=getRes(n);
			System.out.println("The number of all possible move is : "+res);
		}
	}
	
	public static void main(String[] args) {
		
		Q1 q1=new Q1();
		q1.run();
		
	}
	
}
