class HeadSet
{
String type;
int price;
String brand;
boolean nc;
boolean mic;

HeadSet()
{
System.out.println("This is the No argument constructor");
}

HeadSet(String type)
{
System.out.println("Invoked the constructor with the type string");
type=type;
System.out.println("Type: "+type);
}

HeadSet(int price)
{
System.out.println("Invoked the constructor with the brand string");
price=price;
System.out.println("Price: "+price);
}
HeadSet(String brand,int price)
{
System.out.println("Invoked the constructor with the brand string");
price=price;
System.out.println("Brand: "+brand+"\nPrice: "+price);
}

HeadSet(String brand,boolean nc)
{
System.out.println("Invoked the constructor with the brand string");
brand=brand;
nc=nc;
System.out.println("Brand: "+brand+"\nNoice Cancellation: "+nc);
}

HeadSet(String brand,boolean mic,boolean nc)
{
System.out.println("Invoked the constructor with mic and noice");
brand=brand;
mic=mic;
nc=nc;
System.out.println("Brand: "+brand+"\nMic: "+mic+"\nNoice Cancellation: "+nc);
}

HeadSet(boolean mic,boolean nc)
{
System.out.println("Invoked the constructor with mic and noice");
mic=mic;
nc=nc;
System.out.println("Mic: "+mic+"\nNoice Cancellation: "+nc);
}

HeadSet(String type,int price,String brand,boolean mic,boolean nc)
{
System.out.println("Invoked the constructor with all the values");
type=type;
brand=brand;
price=price;
mic=mic;
nc=nc;
System.out.println("Type: "+type+"Brand: "+brand+"\nPrice: "+price+"\nMic: "+mic+"\nNoice Cancellation: "+nc);
}
}






