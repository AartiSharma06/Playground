import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    int r=sc.nextInt();int c=sc.nextInt();
    int a[][] = new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        a[i][j]= sc.nextInt();
    int n=sc.nextInt();
    int cc=0;
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++){
      	if(a[i][j]==n){
          cc=1;
        System.out.println("("+i+","+j+")");
          break;
        }
      }
    if(cc==0){
    System.out.println("(-1,-1)");
    }
    
  }
}