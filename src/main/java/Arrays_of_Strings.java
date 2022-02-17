public class Arrays_of_Strings {
    public static void main(String[] args) {
        String[] strings = new  String[3];
        strings[0]="привет";
        strings[1]="пока";
        strings[2]="джава";
        for (String string:strings){
            System.out.println(string);
        }
        System.out.println();
        int [] num = new int[5];
        for (int i =0; i< num.length;i++){
            num[i]=i++;
        }
        for (int s:num){
            System.out.println(s);
        }
        System.out.println();
        int[]num1 ={1,2,3};
        int ss =0;
        for (int x:num1){
            ss=ss+x;                   // сумма чисел массива
        }
        System.out.println(ss);

    }
}
