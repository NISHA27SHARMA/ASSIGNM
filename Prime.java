class Prime
{
public static void main(String s[])
{
int i,j,count;
System.out.println("PRIME NUMBERS BETWEEN 1 TO 1000");
for(i=1;i<=1000;i++)
count = 0;
{
for(j=2;j<=i/2;j++)
{
if(i%j==0)
{
count++;
break;	
}
}
if(count==0)
{
System.out.println(i+"");	
}
}
}
}