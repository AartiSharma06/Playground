#include<iostream>
using namespace std;
int main()
{
  int n,i;
  int se,so;
  se=0;
  so=0;
 cin>>n;
 int a[n];
  for(i=0;i<n;i++){
    cin>>a[i];}
  for(i=0;i<n;i++){
    if(a[i]%2==0)
      se=se+a[i];
    else
      so=so+a[i];}
  cout<<"The sum of the even numbers in the array is "<<se;
  cout<<"\nThe sum of the odd numbers in the array is "<<so;
}
    //Type your code here.
