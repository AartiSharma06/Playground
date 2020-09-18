import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    int n,min= Integer.MAX_VALUE;
    Scanner sc = new Scanner(System.in);
    n  = sc.nextInt();
    
    int a[] = new int[n];
    for(int i=0;i<n;i++){
    a[i] = sc.nextInt();
    }
    
    for(int i=0;i<n-1;i++){
     min = i;
     for(int j=i+1;j<n;j++){
     	if(a[j]<a[min]){
        min=j;
          
        }
      
     }
      if(i!=min){
      int tt = a[i];
        a[i] = a[min];
        a[min] = tt;
      }
    }
    
    for(int i=0;i<n;i++)
    System.out.print(a[i] + " ");
  }
}