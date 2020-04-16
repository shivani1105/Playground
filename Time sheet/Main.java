#include<iostream>
using namespace std;
int main()
{
  int su,m,t,w,th,f,sa;
  std::cin>>su>>m>>t>>w>>th>>f>>sa;
  int sum=su+m+t+w+th+f+sa; 
  su=su*100;
  su=su+su*(0.5);
  sa=sa*100;
  sa=sa+sa*0.25;
  if(m>=8)
    m=m*100+(m-8)*15;
  else
    m=m*100;
  if(t>=8)
    t=t*100+(t-8)*15;
  else
    t=t*100;
  if(w>=8)
    w=w*100+(w-8)*15;
  else
    w=w*100;
  if(th>=8)
    th=th*100+(th-8)*15;
  else
    th=th*100;
  if(f>=8)
    f=f*100+(f-8)*15;
  else
    f=f*100;
  int salary=su+m+t+w+th+f+sa;
  if(sum>40)
  {
    int salary=salary+(sum-40)*25;
  }
  std::cout<<salary;
}