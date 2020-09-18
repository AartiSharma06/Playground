#include<iostream>
using namespace std;
int main()
{
  int a,b,c,i,t;
  cin>>a>>b>>c;
  if(a>b&&a<c){
    cout<<"The treasure is in box which has number "<<a;}
    if(a<b&&a>c){
    cout<<"The treasure is in box which has number "<<a;}
  if(b>a&&b<c){
    cout<<"The treasure is in box which has number "<<b;}
    if(b<a&&b>c){
    cout<<"The treasure is in box which has number "<<b;}
  if(c>a&&c<b){
    cout<<"The treasure is in box which has number "<<c;}
    if(c<a&&c>b){
    cout<<"The treasure is in box which has number "<<c;}
  for(i=1;i<=5;i++){
if(a%i==0 && b%i==0 && c%i==0)
  t=i;
}
cout<<"\nThe code to open the box is "<<t;
    
  //Type your code here.
}