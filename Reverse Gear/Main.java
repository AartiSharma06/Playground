#include <iostream>
using namespace std;

int main() 
{
  int t,f,b,n,d;
   cin>>n;
  if(n<1){
    cout << "Invalid test case";
    return 0;
  }
    
  for(int y=0;y<n;y++){
    cin>>f>>b>>t>>d;
    int c=0,r=0,time=0,count=0,tot=0;
    if((b<=f) || (t<=0) || (d<=0)){
      cout << "Cannot park";
    }
    else{
      
    	while(true){
          if((c+b)<d){
          	c = c+b;
          }
          else{
            r = d-c;
            tot = t*r;
            break;
          }
          c = c-f;
          count++;
          
        }
      tot = ((f+b)*count*t) + tot ;
      cout<<tot;
    }
    cout<<endl;  
  }
    
    return 0;
}