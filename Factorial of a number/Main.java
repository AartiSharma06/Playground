#include<iostream>
using namespace std;
int main(){
 int n;
  cin>>n;
  int k=1,f;
  for(int i=2;i<=n;i++){
    k = i*k;
  }
  cout<<k;
}