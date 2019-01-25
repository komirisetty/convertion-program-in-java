import java.util.Scanner;
import java.io.IOException; 
public class Converter
{
public static float celtofahren(int tc)
{
float tf = (9/5)*(float)(tc+32);
return tf;
}
public static float fahrentocel(float tf)
{
float tc = (5/9)*(float)(tf-32);
return tc;
}
public static double ouncestograms(double oz)
{
double grams = oz/0.035274;
return grams;
}
public static double gramstoounces(double gr)
{
double oz = gr*0.035274;
return oz;
}
public static double poundstokg(float lb)
{
double kg = (double)lb/2.2046;
return kg;
}
public static double kgtopound(int kg)
{
double lb = (double)kg*2.2046;
return lb;
}
public static double quarttoliters(float quart)
{
double liters = (double)quart*0.946353;
return liters;
}
public static double literstoquarts(float liters)
{
double quarts = (double)liters/0.946353;
return quarts;
}
public static double inchtocent(float inch)
{
double cm = (double)inch/0.39370;
return cm;
}
public static double centtoinch(float cm)
{
double inch = (double)cm*0.39370;
return inch;
}
public static double milestokilometers(float miles)
{
double km = (double)miles/1.609344;
return km;
}
public static double kmtomiles(float km)
{
double miles = (double)km*1.609344;
return miles;
}
public static void main(String[] args) throws IOException
{
int i=0;
Scanner in = new Scanner(System.in);
while(i==0)
{
System.out.println("Please choose below convertion option");
System.out.println("1.centigrade to fahrenheit");
System.out.println("2.fahrenheit to centigrade");
System.out.println("3.ounces to grams");
System.out.println("4.grams to ounces");
System.out.println("5.from pounds to kilograms");
System.out.println("6.kilograms to pounds");
System.out.println("7.quarts to liters");
System.out.println("8.liters to quarters");
System.out.println("9.inches to centimeters");
System.out.println("10.inches to centimeters");
System.out.println("11.miles to kilometers");
System.out.println("12.kilometers to miles");
int expr = in.nextInt();
switch(expr)
{
case 1 :
     System.out.println("enter centigrade");
     int tc = in.nextInt();
     System.out.println("fahrenheit:" +celtofahren(tc));
    break;
case 2 :
     System.out.println("enter fahrenheit");
     float tf = in.nextFloat();
     System.out.println("centigrade:" +fahrentocel(tf));
    break;
case 3 :
     System.out.println("enter ounces");
     double oz = in.nextDouble();
     System.out.println("grams:" +ouncestograms(oz));
    break;
case 4 :
     System.out.println("enter grams");
     double grams = in.nextDouble();
     System.out.println("ounces:" +gramstoounces(grams));
    break;
case 5 :
     System.out.println("enter pounds");
     float pounds = in.nextFloat();
     System.out.println("kilograms:" +poundstokg(pounds));
    break;
case 6 :
     System.out.println("enter kg's");
     int kg = in.nextInt();
     System.out.println("kilograms:" +kgtopound(kg));
    break;
case 7 :
     System.out.println("enter quarts's");
     float quart = in.nextFloat();
     System.out.println("liters:" +quarttoliters(quart));
    break;
case 8 :
     System.out.println("enter liters's");
     float liter = in.nextFloat();
     System.out.println("quarts:" +literstoquarts(liter));
    break;
case 9 :
     System.out.println("enter inches's");
     float inch = in.nextFloat();
     System.out.println("centimeters:" +inchtocent(inch));
    break;
case 10 :
     System.out.println("enter centimeters's");
     float cent = in.nextFloat();
     System.out.println("inches:" +centtoinch(cent));
    break;
case 11 :
     System.out.println("enter miles ");
     float mile = in.nextFloat();
     System.out.println("kilometers:" +milestokilometers(mile));
    break;
case 12 :
     System.out.println("enter kilometer's");
     float kilo = in.nextFloat();
     System.out.println("meters:" +kmtomiles(kilo));
    break;
}
System.out.println("do you want to continue enter 0");
i = in.nextInt();
}
}
}     