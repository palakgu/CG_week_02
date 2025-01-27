class Book {

   private  String title ;
   private  int publicationYear ;
    public Book(String title , int publicationYear){
        this.title = title;
        this.publicationYear=publicationYear;
    }
    public void displaydetails(){
      System.out.println(" the title of the Book is "+ title + " the publication year is  "+ publicationYear);
    }

}
class Author extends Book{
  private   String name ;
   private String bio ;
     public Author(String title , int publicationYear , String name , String bio){
        super(title, publicationYear);
        this.name = name ;
        this.bio = bio;
     }

     public void displaydetails(){
        super.displaydetails();
        System.out.println("The name of the author is "+ name + " the bio is "+ bio);
     }

}
public class Bookdetails{
    public static void main(String[] args){
      Author author = new Author("too good to be true " , 2024 , "Parajakta Kohli", "Romance");
      author.displaydetails();
    }
}