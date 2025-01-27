package hybrid_inheritance;

class person {
    private String name ;
    private int id ;
    
    public person(String name , int id){
        this.name = name ;
        this.id = id ;
    }

    public void performDuties(){
        System.out.println(" name :  " + name );
        System.out.println(" Id : "+ id );
    }
}