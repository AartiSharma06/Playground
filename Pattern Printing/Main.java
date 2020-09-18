#include<iostream>
using namespace std;

int main()
{
  int n;
  cin>>n;
  int val=10,i=n-1;
  int b = (n*n+1)*10;
  for(int x=n;x>=1;x--){
    for(int st=n;st>x;st--)
      cout<<"**";
    for(int y=1;y<=x;y++){
      cout<<val;
      val+=10;
    }
    for(int k=1;k<x;k++){
      cout<<b;
      b+=10;
    }
    cout<<(b/10);
    b -= (20*(x-1));
  	//i--;
    cout<<endl;
  }
  return 0;
}