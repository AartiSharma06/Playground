import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int n = 0;
    n = sc.nextInt();
    int a[] = new int[n];
    for(int i=0;i<n;i++)
      a[i] = sc.nextInt();
    
    
    for(int i=0;i<n;i++){
    	for(int j=1;j<n-i;j++){
        	if(a[j-1]>a[j]){
             a[j] = a[j]+a[j-1];
              a[j-1] = a[j]-a[j-1];
              a[j]=a[j]-a[j-1];
            }
        }
    }
    for(int i=0;i<n;i+=2){
    	System.out.print(a[i]+" ");
    }
    
    
  }
}