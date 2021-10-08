class HeadSetRunner
{
public static void main(String[] args)
{
String type="Wireless";
int price=2000;
String brand="Boat";
boolean nc=true;
boolean mic=true;
new HeadSet();
new HeadSet(type);
new HeadSet(price);
new HeadSet(brand,price);
new HeadSet(brand,nc);
new HeadSet(brand,mic,nc);
new HeadSet(type,price,brand,mic,nc);
}
}