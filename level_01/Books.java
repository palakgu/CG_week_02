
public class Books{
String title ;
String author;
int price;
public Books(String title , String author , int price){
this.title = title ;
this.author = author;
this.price = price;
}
public static void Display(String title , String author , int price){
System.out.println("The title of the book is "+title);
System.out.println("The author of the book is "+author);
System.out.println("The price of the book is "+ price);

}
public static void main(String[] args ){
Books obj = new Books("Too Good to be True" , "Prajakta Kohli" , 250);
Display("Too Good to be True" , "Prajakta Kohli" , 250);
}
}