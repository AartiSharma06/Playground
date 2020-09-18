#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;int a=0,b=1,z=0;
  for(int i=2;i<n;i++){
  	z=a+b;
    a=b;
    b=z;
  }
  cout<<z;
}