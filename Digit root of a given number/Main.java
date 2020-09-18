#include<bits/stdc++.h>
using namespace std;
int digits(int num){
	int sum = 0;
    while (num > 0)
    {
       sum += num % 10;
       num /= 10;
     }
     if (sum > 9)
     {
        sum = digits(sum);
      }
      return sum;
}
int main(){
	int n;
  	cin>>n;
    cout<<digits(n);
}