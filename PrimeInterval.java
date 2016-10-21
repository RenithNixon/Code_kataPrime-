import java.io.*;
class PrimeInterval
{
public static void main(String args[])
{
int start,end,i,j,flag;
DataInputStream in=new DataInputStream(System.in);
try
{
start=Integer.parseInt(in.readLine());
end=Integer.parseInt(in.readLine());
if(start!=end)
{
for(i=start;i<=end;i++)
{
flag=0;
for(j=2;j<i;j++)
{
if(i%j==0)
{
flag=1;
}
}
if(flag==0)
System.out.println(i);
} 
}
else
{
System.out.println("Invalid Data");
}
}
catch(Exception e)
{
}
}
}
