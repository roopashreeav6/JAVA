class HandBag
{
String color;
int price;
String brand;
String material;
String capacity;

HandBag()
{
System.out.println("This is the No argument constructor");
}

HandBag(String color)
{
System.out.println("Invoked the constructor with the color string");
color=color;
System.out.println("Bag color: "+color);
}

HandBag(int price)
{
System.out.println("Invoked the constructor with the brand string");
price=price;
System.out.println("Price: "+price);
}

HandBag(int price,String brand)
{
System.out.println("Invoked the constructor with the price and brand");
price=price;
brand=brand;
System.out.println("Price of the Bag: "+price+"\nBrand: "+brand);
}

HandBag(String material,String capacity)
{
System.out.println("Invoked the constructor with the Material and Capacity");
material=material;
capacity=capacity;
System.out.println("Material: "+material+"\nCapacity: "+capacity);
}

HandBag(String material,String capacity,String brand)
{
System.out.println("Invoked the constructor with the Material, Capacity and Brand");
material=material;
capacity=capacity;
brand=brand;
System.out.println("Material: "+material+"\nCapacity: "+capacity+"\nBrand: "+brand);
}

HandBag(String color,String material,String capacity,String brand)
{
System.out.println("Invoked the constructor with the Color Material, Capacity and Brand");
color=color;
material=material;
capacity=capacity;
brand=brand;
System.out.println("Bag color: "+color+"\nMaterial: "+material+"\nCapacity: "+capacity+"\nBrand: "+brand);
}

HandBag(String color,int price,String material,String capacity,String brand)
{
System.out.println("Invoked the constructor with the Color Material, Capacity and Brand");
color=color;
price=price;
material=material;
capacity=capacity;
brand=brand;
System.out.println("Bag color: "+color+"\nPrice of the Bag: "+price+"\nMaterial: "+material+"\nCapacity: "+capacity+"\nBrand: "+brand);
}
}



