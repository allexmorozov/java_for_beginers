public class Classes_and_Objects {
    public static void main(String[] args) {
        Person person1 = new Person();
//        person1.name = "Bob";
//        person1.age =50;
//        person1.setNameAndAge("Bob", 60);
        person1.setName("Я Игорь");
        person1.setAge(5);
        System.out.println("Выводим значение в мэйн методе: "+person1.getName());
        System.out.println("Выводим значение в мейн методе: "+person1.getAge());
        System.out.println();
//        person1.speak();

//        person1.age = 50;
//        System.out.println("Меня зовут "+ person1.name+ " и мне "+person1.age+" лет");

        Person person2 = new Person();
//        person2.name = "Gleb";
//        person2.age = 20;
//        person2.sayHello();
//        person2.speak();
//        int years2 = person2.yearsToRetirement();
//        System.out.println("Мне до пенсии  "+years2+" лет!");


    }
}

class Person{
    private String name;
    private int age;



    public void setName(String userName){
        if(userName.isEmpty()){
            System.out.println("Заполните поле имя!!!");
        } else{
            name=userName;
        }
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
      if (userAge<0){
          System.out.println("Введите корректный возраст!!!");
      }else {
          age=userAge;
      }
    }
    public int getAge(){
        return age;
    }







    int yearsToRetirement(){
        int years = 65-age;
        return years;
    }

//    void setNameAndAge(String username, int userage){
//        name= username;
//        age= userage;
//    }

    void speak(){
        for (int i =0; i<3; i++){
            System.out.println("Меня зовут "+ name+ " и мне " +age+ " лет");
        }

    }

    void  sayHello(){
        System.out.println("Привет!!!");
    }
}