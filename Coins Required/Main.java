#include<iostream>
using namespace std;

int main()
{
  int n,fv,one,two,tt=0;
  cin>>n;
  fv = (n-4)/5;
  int tmp = (n - fv*5);
  if(tmp%2==0)
    one=2;
  else 
    one=1;
  two = (n - (5*fv + one))/2;
  tt = one+fv+two;
  cout<<tt<<" "<<fv<<" "<<two<<" "<<one<<endl;
  
  return 0;
}