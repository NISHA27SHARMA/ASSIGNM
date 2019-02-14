class DupliArray
{
public static void main(String s[])
{
int i,j;
int ar[] = {2,5,2,8,5,7};
for(i=0;i<ar.length-1;i++)
{
for(j=i+1;j<ar.length;j++)
{
if(ar[i]==ar[j])
{
System.out.println("DUPLICATE ARRAY : "+ar[j]);
}	
}
}
}
}