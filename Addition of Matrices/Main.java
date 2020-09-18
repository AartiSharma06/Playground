import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    int n1,n2;
    Scanner sc = new Scanner(System.in);
    n1=sc.nextInt();n2 = sc.nextInt();
    int a[][] = new int[n1][n2]; int b[][] = new int[n1][n2];
    
    for(int i=0;i<n1;i++){
      for(int j=0;j<n2;j++)
    	a[i][j] =sc.nextInt();
    }
    for(int i=0;i<n2;i++){
      for(int j=0;j<n2;j++)
    	b[i][j] =sc.nextInt();
    }
    int s[][]= new int[n1][n2];
    for(int i=0;i<n1;i++){
      for(int j=0;j<n2;j++){
      	s[i][j] = a[i][j]+b[i][j];
      }
    }
    for(int i=0;i<n1;i++){
      for(int j=0;j<n2;j++){
      	System.out.print(s[i][j]+" ");
      }
      System.out.println();
    }
    
  }
}