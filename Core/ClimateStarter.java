class ClimateStarter
{
public static void main(String[] args)
{
int temp=27;
String hum="Humid";
String desc="cloudy";
String loc="Davanagere";
boolean cr=true;
new Climate();
new Climate(loc);
new Climate(temp,hum);
new Climate(cr);
new Climate(temp,desc);
new Climate(temp,hum,desc,loc,cr);
}
}
