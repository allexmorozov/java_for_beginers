public class Constructors_20 {
    public static void main(String[] args) {
        Human human1 = new Human("Bob",22);


    }
}

class Human{
    private String name;
    private int age;

    public Human(){
        System.out.println("First");
    }

    public Human(String name){
        System.out.println("Second const");
        this.name = name;
    }

    public Human(String name,int age){
        System.out.println("Third const");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
