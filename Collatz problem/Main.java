#include<iostream>
using namespace std;
int main()
{
  int n,i=0;
  cin>>n;
  cout<<n<<endl;
  while(n!=1){
  if(n%2==0)
    n/=2;
  else 
    n=3*n+1;
  cout<<n<<endl;
  i++;  
  }
  cout<<i<<endl;
}