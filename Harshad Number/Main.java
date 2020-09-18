#include<iostream>
using namespace std;
int main()
{
  int n,i=0,t;
  cin>>n;
  t=n;
  while(t>0){
  int d = t%10;
    i+=d;
    t/=10;
  }
  if(n%i==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}