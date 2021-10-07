class Ornaments
{
public static String rOrnaments(String[] items)
{
System.out.println("rornaments method is invoked.....\nList of ornaments are......");
int size=items.length;
for(int i=0;i<size;i++)
{
System.out.println(items[i]);
}
System.out.println("Returning the last element...");
return items[size-1];
}
}