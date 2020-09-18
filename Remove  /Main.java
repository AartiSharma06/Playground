#include<bits/stdc++.h>
using namespace std;
int main(){
  char str[200];
  cin.getline(str,200);
  int i=0;
  while(str[i]!='\0'){
    if(str[i]=='t' && str[i+1]=='h' && str[i+2]=='e' && str[i+3]==' '){
      i=i+4;
    }
    cout<<str[i];
    i++;
    }
  
}
 
