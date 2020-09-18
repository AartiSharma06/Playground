#include<iostream>
using namespace std;
int main()
{
  int n,i=1,so=0,se=0;
  cin>>n;
  while(n>0){
  int d = n%10;
  if(i%2!=0)
    so+=d;
  else
    se+=d;
   i++;
   n/=10;
  }
  if(so==se)
    cout<<"Yes";
  else
    cout<<"No";
}