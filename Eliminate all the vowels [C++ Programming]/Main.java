#include<iostream>
#include<stdlib.h>
#include<string.h>
using namespace std;

void consonants(char *str)
{
    //Type your code here 
  for(int i=0;i<strlen(str);i++){
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||
       str[i]=='A'||str[i]=='E'||str[i]=='i'||str[i]=='O'||str[i]=='U')
      continue;
    else
      cout<<str[i];
  }
}

int main()
{
    char str[100];
    scanf("%s",str);
    consonants(str);
    return 0;
}


