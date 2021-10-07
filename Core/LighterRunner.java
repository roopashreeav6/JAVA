class LighterRunner
{
public static void main(String[] args)
{
boolean oncheck=Lighter.on();
System.out.println("Result of on method: "+oncheck);
boolean offcheck=Lighter.off();
System.out.println("Result of off method: "+offcheck);
int width=-10;
boolean lightcheck=Lighter.light(width);
System.out.println(width+" is > 0 ? : "+lightcheck);
}
}
