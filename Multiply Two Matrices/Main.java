import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int r1=0,r2=0,c1=0,c2=0;
    r1=sc.nextInt(); c1 = sc.nextInt();
    r2=sc.nextInt(); c2 = sc.nextInt();
    int a[][] =new int[r1][c1];
    int b[][] =new int[r2][c2];
    if(c1!=r2){
   	System.out.println("The matrix multiplication can't be performed");
     //continue; 
    }
    else{
    for(int i=0;i<r1;i++){
    	for(int j=0;j<c1;j++)
          a[i][j] = sc.nextInt();
    }
      for(int i=0;i<r2;i++){
    	for(int j=0;j<c2;j++)
          b[i][j] = sc.nextInt();
    }
    int mul[][] = new int[r1][c2];
    for(int i=0;i<r1;i++){
    	for(int j=0;j<c2;j++)
          for(int k=0;k<r2;k++)
          	mul[i][j] += a[i][k]*b[k][j] ;
    }
    
    for(int i=0;i<r1;i++){
    	for(int j=0;j<c2;j++)
          System.out.print(mul[i][j]+" ");
      System.out.println();
    }
    
    
    //Try out your code here
    } 
  }
}