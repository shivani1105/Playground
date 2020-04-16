#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  float x;
  double y;
  std::cin>>x;
  std::cin>>y;
  if(x>=13){
    if(y==10.15 || y==18.00 || y==22.00)
      std::cout<<"$8.00";
    else
      std::cout<<"$5.00";
  }
  else
  {
    if(y==10.15 || y==18.00 || y==22.00)
      std::cout<<"$4.00";
    else
      std::cout<<"$2.00";
  }
}