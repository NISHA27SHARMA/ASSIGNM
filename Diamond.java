//Nested Loop

class Diamond
{
public static void main(String[] args)
{
int n=7;
for(int i=0;i<=n;i++)
{
for(int j=1;j<=n-i;j++)
{
System.out.print(" ");
}
for(int k=1;k<=i;k++)
{
System.out.print("* ");
}
System.out.println("");
}
for(int i=1;i<=n-1;i++)
{
for(int j=1;j<=i;j++)
{				
System.out.print(" ");
}
for(int k=1;k<=n-i;k++)
{
System.out.print("* ");
}
System.out.println("");
}
}
}

