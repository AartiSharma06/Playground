#include<bits/stdc++.h>
using namespace std;
void swap(int& a,int& b){
	int t = a;
  	a = b;
  	b = t;
}
int main(){
	int x,y;
  	cin>>x>>y;
  	cout<<"Before swapping a= "<<x;
  	cout<<" and b="<<y<<endl;
  	swap(x,y);
  	cout<<"After swapping a= "<<x;
  	cout<<" and b="<<y<<endl;
}