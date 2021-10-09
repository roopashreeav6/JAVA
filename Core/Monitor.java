class Monitor
{
String brand="Dell";
int size=24;
int price=16000;
String type="Curved Display";
String disspec="HD";
int volt=220;
String bright="300nits";
String csupport="5.7million";
boolean hdmi=false;
boolean vga=true;
int pc=22;
boolean tilt=false;
int weight=5;
String ps="External";
boolean waranty=true;

Monitor()
{
System.out.println("Invoked the no argument constructor");
}
Monitor(String brand)
{
System.out.println("Invoked the constructor with a single string");
this.brand=brand;
System.out.println("Brand: "+brand);
}

Monitor(int size,int price,String type,String disspec)
{
System.out.println("Invoked the constructor with int int string string");
this.size=size;
this.price=price;
this.type=type;
this.disspec=disspec;
System.out.println("Size: "+size+"\nPrice: "+price+"\nType: "+type+"\nDisplay Specification: "+disspec);
}

Monitor(int volt,String bright,String csupport,boolean hdmi)
{
System.out.println("Invoked the constructor with int,str,str,bool");
this.volt=volt;
this.bright=bright;
this.csupport=csupport;
this.hdmi=hdmi;
System.out.println("Voltage: "+volt+"\nBrightness: "+bright+"\nColor Support: "+csupport+"\nHDMI: "+hdmi);

}

Monitor(boolean vga,int pc,boolean tilt)
{
System.out.println("Invoked the constructor with bool,int,bool");
this.vga=vga;
this.pc=pc;
this.tilt=tilt;
System.out.println("VGA: "+vga+"\nPower Consumption: "+pc+"\nTilt : "+tilt);
}

Monitor(int weight,String ps,boolean waranty)
{
System.out.println("Invoked the constructor with int,str,bool");
this.weight=weight;
this.ps=ps;
this.waranty=waranty;
System.out.println("Weight: "+weight+"\nPower Supply: "+ps+"\nWarranty: "+waranty);
}
}

