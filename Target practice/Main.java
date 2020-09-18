#include<iostream>
using namespace std;
int main()
{
  int t=0,n=0,s=0,i=0;
  cin>>t;
  while(true){
    cin>>n;
    s+=n;
    i++;
    if(s>=t){
      break;
    }
      
    
  }
  cout<<"The number of turns is "<<i;
}