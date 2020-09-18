#include <iostream>
using namespace std;
int main(){
int a=0,b=0,n,temp,t=0;
  cin>>a;
  cin>>b;
  n = a+b;
  temp=n;int i=1;
  while(i<n){
    if(n%i==0)
      t+=i;
    i++;
  }
  if(temp==t)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
}