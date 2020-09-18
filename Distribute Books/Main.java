#include <bits/stdc++.h> 
using namespace std;

long int fibo(long int n){
	long int f[n+1];
  	f[0] = 1 ; f[1] = 0,f[2] = 1;
  	for(long int i=3;i<=n;i++){
    	f[i] = ((i-1)*(f[i-1] + f[i-2]))%100000007;
    }
    return f[n];
}
int main()
{
  int n;
  cin>>n;
  if(n>0 && n<=1000000){
  	cout<<fibo(n)<<endl;
  }
  return 0;
}