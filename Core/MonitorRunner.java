class MonitorRunner
{
public static void main(String[] args)
{
String brand="HP";
int size=22;
int price=16500;
String type="Curved Display";
String disspec="HD";
int volt=220;
String bright="300nits";
String csupport="16.7million";
boolean hdmi=true;
boolean vga=true;
int pc=22;
boolean tilt=true;
int weight=3;
String ps="External";
boolean waranty=true;


new Monitor();
new Monitor(brand);
// int int string string
new Monitor(size,price,type,disspec);
//int,str,str,bool
new Monitor(volt,bright,csupport,hdmi);
//bool,int,bool
new Monitor(vga,pc,tilt);
//int,str,bool
new Monitor(weight,ps,waranty);
}
}








