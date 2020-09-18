import java.util.*;
class Main
{
  static int a[] = new int[100];
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int low = 0,high = n-1;
    for(int i=0;i<n;i++){
    	a[i] = sc.nextInt();
    }
//    for(int i=0;i<n;i++)
//    System.out.print(a[i] + " ");
    qk(low,high);
    for(int i=0;i<n;i++)
    System.out.print(a[i] + " ");
  }
  public static void qk(int low,int high){
  if(low>high) return;
   int p = partition(low,high);
    qk(low,p-1);
    qk(p+1,high);
  }
  public static int partition(int low,int high){
  	int p = a[high];
   // System.out.print(p+ "SDFDRG");
    int i=low-1;
    for(int j=low;j<high;j++){
    	if(a[j]<p){
        //System.out.print(a[j]);  
        i++;
        int ii = a[i];
        a[i] = a[j];
        a[j] = ii;  
        //a[i] = a[i]+a[j];
        //a[j] = a[i]-a[j];
        //a[i] = a[i]-a[j];  
        }
    }
    i++;
    int ii = a[i];
        a[i] = a[high];
        a[high] = ii;  
    return i;
  }
}