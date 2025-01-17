import java.util.*;
public class Palindrome{
String text ;
public Palindrome(String text ){
this.text = text ;
}
public static void check(String text){
String str1 = "";
int len = 0;
for(int i=text.length()-1;i>=0;i--){
str1+= text.charAt(i);
}
if(str1.equals(text)){
System.out.println(" The text is palindrome");
}
else 
System.out.println("The text is not palindrome");
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
System.out.println(" Enter the text");
String text = sc.nextLine();
Palindrome obj = new Palindrome(text);
check(text);
}
}