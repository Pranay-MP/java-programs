// Celsius to Fahrenheit ==> implicit===> celsius*9/5+32
// Fahrenheit to Celsius ==> explicit==> (fahrenheit-32)*5/9
public class Convert{
public static void main(String []args){
	int celcius=27;
	float f=celcius*9/5+32;
	int c=(int)(f-32)*5/9;
	System.out.println(celcius);
	System.out.println(f);
	System.out.println(c);
}}
	
	