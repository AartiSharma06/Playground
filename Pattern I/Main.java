#include<bits/stdc++.h>
using namespace std;
int main(){
int n;
  cin>>n;
  int t=n;
  for(int x=1;x<=4;x++){
  for(int y=1;y<=x;y++){
  	cout<<n;
  }
    n++;
    cout<<endl;
  }
  n--;;;
  for(int x=4;x>=1;x--){
  for(int y=1;y<=x;y++){
  cout<<n;
 }
    n--;
    cout<<endl;
  }
}