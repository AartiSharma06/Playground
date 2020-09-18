#include<iostream>
using namespace std;
int main()
{
  int n;
  cin>>n;
  int arr[n][n];
  for(int i=0;i<n;i++)
    for(int j=0;j<n;j++)
      cin>>arr[i][j];
  n=n-1;
  int s=0,t=0;
  for(int i=0;i<=n;i++)
    for(int j=0;j<=n;j++){
    	if(i==j)
          s=s+arr[i][j];
      	if(i+j==n)
          t=t+arr[i][j];
    }
  
  if(s==t)
    cout<<"Yes";
  else
    cout<<"No";
}