class Food
{
public static String rItems(String[] items)
{
System.out.println("rItems method is invoked.....\nList of Food items are......");
int size=items.length;
for(int i=0;i<size;i++)
{
System.out.println(items[i]);
}
System.out.println("Returning the first element...");
return items[0];
}
}