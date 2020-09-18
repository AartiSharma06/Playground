#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,x,t;
  cin>>d1>>c1>>d2>>c2;
  x = c1+c2;
  if(x>100){
     t=0;
  while(x>=100){
   t++;
  x-=100;
  }
  }
  cout<<(d1+d2+t)<<"\n";
  cout<<x;
  
}