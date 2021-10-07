class Lighter
{
public static boolean on()
{
System.out.println("On Method is Invoked...");
return true;
}
public static boolean off()
{
System.out.println("Off Method is Invoked...");
return false;
}
public static boolean light(int width)
{
System.out.println("Light Method is Invoked...");
if(width>0)
{
return true;
}
return false;
}
}
