#include<iostream>
using namespace std;

int main()
{
  int n,t;
  cin>>t;
  while(t--){
  	cin>>n;
  	int c=0;
  	while(n>0){
   	 c++;
   	 n=n/2;
  	}
  	 cout<<c<<endl;; 
  }
  
  return 0;
}