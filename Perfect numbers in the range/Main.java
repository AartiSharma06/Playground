#include <iostream>
using namespace std;
int main(){
int i,n,c=0;
  cin>>i>>n;
  i=i+1;
  while(i<n){
  int j=1,t=0;
    while(j<i){
    	if(i%j==0)
          t+=j;
      
      j++;
    }
    if(t==i)
        cout<<i<<" ";
    i++;
  }
}