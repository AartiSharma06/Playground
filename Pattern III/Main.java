#include <bits/stdc++.h> 
using namespace std; 
  
// function to print the following pyramid pattern 
void printPattern(int n) 
{ 
    for(int i=1;i<=n;i++){
      for(int j=1;j<i;j++)
        cout<<i<<"*";
      cout<<i<<endl;
    } 
  	for(int i=n;i>=1;i--){
      for(int j=1;j<i;j++)
        cout<<i<<"*";
      cout<<i<<endl;
    } 
} 
  
// Driver program to test above 
int main() 
{ 
    int n ;cin>>n; 
    printPattern(n); 
    return 0; 
} 