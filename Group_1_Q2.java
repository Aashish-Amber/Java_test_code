import java.util.ArrayList;
import java.util.Scanner;


public class ArrayGame {
	static ArrayList<Integer> data = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n,T;
		boolean result,temp=false;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the input..");
		T = in.nextInt();
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		for(int k=0; k < T; k++){
			temp=false;
			data.clear();
			n = in.nextInt();
			m = in.nextInt();
			for(int i=0;i<n;i++)
				data.add(in.nextInt());
		
			for(int i=n-1; i>=n-m; i--){
				//System.out.println(i);
				if(data.get(i)==0)
					temp = temp|canI(i,n,m,-i);
			}
			if(temp == true)
				output.add(1);
			else
				output.add(0);
		}
		
		for(int k=0; k < T; k++){
			if(output.get(k)==1)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
	
	static boolean canI(int index,int n,int m,int prev){
		//System.out.println(index);	
		if(index > n-1 || index < 0)
				return false;
		else{
				if(index==0)
					return true;
				
				if(index>0){
				if(data.get(index-1)==0 && prev!=index-1)
					return canI(index-1,n,m,index);
				}
				
				if(index<n-1 && prev!=index+1){
				if(data.get(index+1)==0)
					return canI(index+1,n,m,index);
				}
				
				if(index-m>=0 && prev!=index-m){
				if(data.get(index-m)==0)
					return canI(index-m,n,m,index);
				}
				
			}
		return false;
	}

}
