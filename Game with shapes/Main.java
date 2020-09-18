#include<iostream>
using namespace std;
int main()
{
 int a,b;
  cin>>a>>b;
  int d =2*a;
  float ac=3.14*(a*a);
  float bc=b*b;
  if(b==d)
    cout<<"circle can be inside a square";
  else
    cout<<"circle cannot be inside a square";
}