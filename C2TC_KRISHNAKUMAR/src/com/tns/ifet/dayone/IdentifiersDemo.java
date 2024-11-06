//Program to demonstrate identifiers
package com.tns.ifet.dayone;
public class IdentifiersDemo {
public static void main(String[] args) {
// variable declaration - Invalid Identifier
//Examples
//int for = 13;// error because keyword
//int number 2 = 13; //error because do not
/* cannot be identifier
System.out.println("value of the number
variable is : "+ for);*/
/*
add space within identifier
System.out.println("value of the number
variable is : "+ number 2);
*/
// error because Identifier can not starts with @, #
//int @number3 = 10;	
//Valid Identifier Examples
int $number = 20; //starts with $
System.out.println("value of the number variable is : "+ $number);
String studentName="Aniket"; //use camelcase
System.out.println("value is : "+studentName);
}
}