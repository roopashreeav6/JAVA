class BagStarter
{
public static void main(String[] args)
{
String color="grey";
int price=5000;
String brand="SabyaSachi";
String material="Leather";
String capacity="7kgs";
new HandBag();
new HandBag(color);
new HandBag(price);
new HandBag(price,brand);
new HandBag(material,capacity);
new HandBag(material,capacity,brand);
new HandBag(color,material,capacity,brand);
new HandBag(color,price,material,capacity,brand);
}
}