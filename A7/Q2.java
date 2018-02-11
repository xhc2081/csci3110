import java.util.Scanner;




/**
 * 
 * Part 1 : 
	 * Fomula : f(x)= 	1. if x,y < 0 ---> 0
	 * 					2. if x,y == 0 -----> 1
	 * 					3. else for x,y ----> f(x-1,y)+f(x,y-1)
	 * 
	 * Implemention below
	 * 
	 * array a is for memoization
	 * 
	 * Complexity is O(n*m)
 *
 *
 * Part 2 : 
	 * Fomula : f(x)= 	1. if x,y < 0 ---> 0
	 * 					2. if x,y == 0 -----> 1
	 * 					3. if x,y is block ----->0
	 * 					4. else for x,y ----> f(x-1,y)+f(x,y-1)
	 * 
	 * Implemention below
	 * 
	 * array a is for memoization
	 * 
	 * Complexity is O(n*m)
 *
 */
public class Q2 {
	

	//a array to memorize the result
	int a[][]=new int[1005][1005];
	//record block grid
	boolean block[][]=new boolean[1005][1005];

	//scanner for input
	Scanner scanner=new Scanner(System.in);
	
	/**
	 * constructor to init the array
	 */
	public Q2() {
		// TODO Auto-generated constructor stub
		
		//init for a array
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=0;
				block[i][j]=false;
			}
		}
		a[0][0]=1;
	}
	
	/**
	 * calculate the result according to the fomula
	 * @param x
	 * @return
	 */
	public int getRes(int x,int y)
	{
		if(x<0||y<0)
			return 0;
		if(x==0&&y==0)
			return 1;
		if(block[x][y])
			return 0;
		if(a[x][y]!=0)
		{
			return a[x][y];
		}
		int sum=0;
		sum+=getRes(x-1, y);
		sum+=getRes(x, y-1);
		a[x][y]=sum;
		return sum;
	}
	
	/**
	 * for part 1 program run , user input and output
	 */
	public void part1()
	{
		System.out.print("For part 1, Please input the number of x and y :");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		int res=getRes(x,y);
		System.out.println("The number of all possible move is : "+res);
		
	}

	/**
	 * print the path of x,y
	 * @param x
	 * @param y
	 */
	void printPath(int x,int y)
	{
		if(x==0&&y==0)
			System.out.println(x+" "+y);
		else
		{
			if(getRes(x-1, y)>0)
			{
				printPath(x-1, y);
				System.out.println(x+" "+y);
			}
			else if(getRes(x,y-1)>0)
			{
				printPath(x, y-1);
				System.out.println(x+" "+y);
			}
		}
	}
	
	/**
	 * for part 2 program run , user input and output
	 */
	public void part2()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.print("For part 2, Please input the number of x and y :");
		int x=scanner.nextInt();
		int y=scanner.nextInt();
		System.out.print("Please input the block number: ");
		int n=scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("Input the "+(i+1)+"th block position : ");
			int temx=scanner.nextInt();
			int temy=scanner.nextInt();
			block[temx][temy]=true;
		}
		
		int res=getRes(x, y);
		System.out.println("The number of all possible move is : "+res);
		System.out.println("Path below");
		printPath(x, y);
	}
	
	public static void main(String[] args) {
		
		Q2 q2=new Q2();
		q2.part1();
		q2=new Q2();
		q2.part2();
		
	}
}
