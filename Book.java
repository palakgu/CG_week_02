
public class Book {
private static String libraryName = "Central Library";
private  static String title ;
private static String author ;
private static final int isbn;
public Book(String author , String title , int isbn ){
this.title = title ;
this.author = author;
this.isbn = isbn;
}
public static void display(){
System.out.println(" library name is "+ libraryName);
System.out.println(" the title of the book is "+ title );
System.out.println(" the Author of the book is "+ author);
System.out.println(" the unique identification number is "+ isbn);
}
public static void main(String[] args){
Book Book1 = new Book("raman", "ranmayana",124);
Book Book2 =  new Book("Nisha", "My fault" , 125);
if(Book1 instanceof Book){
Book1.display();
} 
if(Book2 instanceof Book){
Book2.display();
} 
}
}