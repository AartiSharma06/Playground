import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n==0 || n==1){
    	System.out.println(n);
    }
    else{
      	int i=1;
      	System.out.print(i);
    	for(i=2;i<=n;i++){
        	if(n%i==0){
            	System.out.print( " " + i );
            }
        }
    }
  }
}