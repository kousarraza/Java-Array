public class arraymax
{
public static void main(String arg[])
{
int num[]={12,34,56,78,90};
int max=num[0];
for(int i=1; i<num.length;i++)
if(num[i]>max)
max=num[i];
System.out.println("max "+max);
}
}
