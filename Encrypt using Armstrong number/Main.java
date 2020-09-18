#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int digits(int m){
  int c=0;
	while(m>0){
		c++;
		m/=10;
	}
  return c;
}
int arm(int n)
{
  int d = digits(n);
  int t=n,s=0,l;
  while(t>0){
    	l = t%10;
    	s = s + power(l,d);
		t/=10;
	}
  	if(s==n)
      return 1;
  	else
      return 0;
    
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}