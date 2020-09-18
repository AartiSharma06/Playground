#include<iostream>
using namespace std;
int main()
{
  int n;
  float t;
  cin>>n>>t;
  if(n==2)
  cout<<(t+(t/2));
  if(n==3)
    cout<<(t+t);
  if(n>3)
    cout<<"Number of items is more";
  //Type your code here.
}