#include<bits/stdc++.h>
using namespace std;
int exp(int,int);
int main(){
	int a,b,c;
  	cin>>a>>b>>c;
  	int s = exp(a,b);
  	if(s<c)
      cout<<"Sorry Doctor! You need more bacteria.";
  	else
      cout<<"Doctor, you can proceed with your experiment.";
}

int exp(int a,int b){
	return pow(a,b);
}