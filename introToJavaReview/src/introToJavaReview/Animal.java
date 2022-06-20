package introToJavaReview;

public class Animal {
	// variables or fields = the state of the class
    public String name;
    //this does not have an access modifier so its access is defaulted to the default modifier
    String owner;
    private int age;
    protected boolean housePet;
    //constructor
    //a special method
    // does not have a return type
    //this is a no args constructor
    public Animal(){

    }
    //this ia an all args constructor
    public Animal(String name, int age, String owner, boolean housePet){
        this.name = name;
        this.age = age;
        this.owner = owner;
        this.housePet = housePet;

    }
    //this ia a two args constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;
}
