#include <iostream>
using namespace std;

int hcf(int n1, int n2);

int main()
{
   int n1, n2;
   cin >> n1 >> n2;
   cout <<hcf(n1, n2);
  return 0;
}

int hcf(int n1, int n2)
{
   //Type your code here
  int i,gcd;
  for(i=1;i<=n1 && i<=n2;++i){
    if(n1%i==0 && n2%i==0)
      gcd=i;
  }
  return gcd;
}