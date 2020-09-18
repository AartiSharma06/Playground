#include<iostream>
using namespace std;
int main()
{
  int n,p,val;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  int arr[20];
  cout<<"Enter the elements in the array"<<endl;
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>p;
  if(!(p<n) || p>19){
  	cout<<"Invalid Input";
    
  }
  else{
  cout<<"Enter the value to insert"<<endl;
  cin>>val;
  cout<<"Array after insertion is"<<endl;
  for(int i=n;i>p-1;i--){
  	arr[i]=arr[i-1];
  }
  arr[p-1]= val;
    
  for(int i=0;i<=n;i++)
    cout<<arr[i]<<endl;
  }

}