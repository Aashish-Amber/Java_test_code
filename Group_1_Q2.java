package practise1;
import java.util.*;
import java.lang.*;
class circular{
	public int isPrime(int num){
		int sqrt = (int) Math.sqrt(num);
		for (int i=2; i<= sqrt; i++){
		if (num%i == 0) return 0;
		}
		return 1;
	}
	public int isCircularprime(int num){
		//ArrayList<Integer> arr = new ArrayList();
		int temp = num;
		do{
			int a = temp%10;
			int b = temp/10;
			//System.out.println("Hey")	;
			String str_a = Integer.toString(a);
			String str_b = Integer.toString(b);
			String str_2 = new String();
			if (a == 0) str_2 = str_b;
		    else if (b == 0) str_2 = str_a;
			else str_2 = str_a + str_b; 
			//str_2 = str_a + str_b;
			
			int c = Integer.valueOf(str_2);
			//System.out.println(c);
			if (isPrime(c)==0)return 0;
			temp = c;	
			//System.out.println("Hello");
		}while (temp != num);
		return 1;
		
	}
	
	public int is_it_Circularprime(int num){
		//ArrayList<Integer> arr = new ArrayList();
		int num1= num;
		int temp = num;
		while(temp>0){
			int a = temp%10;
			temp = temp/10;
			if (a%2==0) return 0;
		}
		if (isCircularprime(num1)==1)
		return 1;
		else
	    return 0;
		
	}
}
public class assignment {
	static circular test = new circular();
	public static void main(String args[]){
		int a = 10000000;
		for (int i=2 ;i<a;i++){
			int flag = test.is_it_Circularprime(i);
			if(flag==1)System.out.println(i);
		}
		System.out.println("Exit");
	}
}
