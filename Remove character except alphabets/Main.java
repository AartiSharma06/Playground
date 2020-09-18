#include<iostream>
using namespace std;
int main()
{
  char c[150];
  int i,j,count=0;
  cin>>c;
  while(c[count]!='\0')
    count++;

  for(int i=0;i<count;i++){
    while((c[i]>='a' && c[i]<='z')||(c[i]>='A' && c[i] <= 'Z')){
      cout<<c[i];
      c[i]='\0';
    }
  }
  cout<<c;
}