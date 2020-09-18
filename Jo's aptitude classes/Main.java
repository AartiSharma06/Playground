#include<bits/stdc++.h>
using namespace std;
int gcd(int a,int b){
	if(a==0)
      return b;
    return gcd(b%a,b);
}
int main(){
  int a,b,c,d;
  cin>>a>>b>>c>>d;
  
  int n = gcd(a,b);
  int m = gcd(c,a);
  if(m==d)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
}