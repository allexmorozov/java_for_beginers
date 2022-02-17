public class This {
    public static void main(String[] args) {
        Humann human1=new Humann();
        human1.setName("Bob");
        human1.setAge(22);
        human1.getInfo();


    }
}
    class Humann{
    String name;
    int age;

    public void setName(String name){
        this.name = name;
    }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName(){
        return name;
        }

        public int getAge() {
            return age;
        }
        public void  getInfo(){
            System.out.println(name+", "+age);
        }
    }
