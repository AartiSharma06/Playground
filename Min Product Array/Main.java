#include <bits/stdc++.h>
using namespace std;

int main() 
{
   // Try out your code here
   int n,k;
  cin>>n>>k;
  vector<int> a(n),b(n);
  for(int i=0;i<n;i++){
  	cin>>a[i];
  }
  for(int i=0;i<n;i++){
  	cin>>b[i];
  }
  int minsum=0,prod=0,maxdiff=-10000;
  
    int diff = 0, res = 0; 
    int temp; 
    for (int i = 0; i < n; i++) { 
  
        // Find product of current elements and update 
        // result. 
        int pro = a[i] * b[i]; 
        res = res + pro; 
  
        // If both product and b[i] are negative, 
        // we must increase value of a[i] to minimize 
        // result. 
        if (pro < 0 && b[i] < 0) 
            temp = (a[i] + 2 * k) * b[i]; 
  
        // If both product and a[i] are negative, 
        // we must decrease value of a[i] to minimize 
        // result. 
        else if (pro < 0 && a[i] < 0) 
            temp = (a[i] - 2 * k) * b[i]; 
  
        // Similar to above two cases for positive 
        // product. 
        else if (pro > 0 && a[i] < 0) 
            temp = (a[i] + 2 * k) * b[i]; 
        else if (pro > 0 && a[i] > 0) 
            temp = (a[i] - 2 * k) * b[i]; 
  
        // Check if current difference becomes higher 
        // than the maximum difference so far. 
        int d = abs(pro - temp); 
        if (d > diff) 
            diff = d;         
    } 
  
    cout<<( res - diff); 
  
  
 // minsum = minsum - maxdiff;
  //cout<<minsum;
  
    return 0;
}