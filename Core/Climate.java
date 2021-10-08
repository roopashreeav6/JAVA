class Climate
{
int temp;
String hum;
String desc;
String loc;
boolean cr;

Climate()
{
System.out.println("This is the No argument constructor");
}
Climate(String loc)
{
System.out.println("Invoked the constructor with the location string");
loc=loc;
System.out.println("Location: "+loc);
}

Climate(int temp,String hum)
{
System.out.println("Invoked the constructor with the Temperature and humidity");
temp=temp;
hum=hum;
System.out.println("Temperature: "+temp+"\nHumidity: "+hum);
}

Climate(boolean cr)
{
System.out.println("Invoked the constructor with the boolean value");
cr=cr;
System.out.println("Chances of rain: "+cr);
}

Climate(String desc,int temp)
{
System.out.println("Invoked the constructor with the Temperature and Description string");
desc=desc;
System.out.println("About the day: "+desc);
}

Climate(int temp,String hum,String desc,String loc,boolean cr)
{
System.out.println("Invoked the constructor with all the values");
temp=temp;
hum=hum;
desc=desc;
loc=loc;
cr=cr;
System.out.println("Location: "+loc+"\nTemperature: "+temp+"\nHumidity: "+hum+"\nAbout the day: "+desc+"\nChances of rain: "+cr);
}
}

