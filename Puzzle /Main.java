#include<iostream>
using namespace std;
int main()
{
    int m,n,i,j;
  	cin>>m>>n;
  	int a[m][n]; 
  	for(i=0;i<m;i++)
      for(j=0;j<n;j++)
        cin>>a[i][j];
  for(i=0;i<n;i++){
     for(j=0;j<m;j++)
        cout<<a[j][i]<<" ";
    cout<<endl;
  }
  
}