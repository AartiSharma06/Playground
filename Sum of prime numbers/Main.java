import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt(); int n2 = sc.nextInt();
    int sum=0;
    if(n1==1){
    	n1++;
    }
    for(int i=n1;i<n2;i++){
      if(isprime(i)){
      	int tt = rev(i);
       if(isprime(tt)==true){
         //System.out.println(tt);
       	sum = sum+i;
       }
      }
    	
    }
    System.out.println("sprime = "+sum);
   }
public static int rev(int n){
   int r=0;
    while(n>0){
    int d = n%10;
    r = r*10+d;
    n = n/10;  
    }
    return r;
  
  }
  public static boolean isprime(int n){
  int flag=0;
    for(int i=2;i<n;i++){
    	if((n%i)==0){
        return false;
        }
    }
    
    return true;
  
  }
  
  
  
  
}