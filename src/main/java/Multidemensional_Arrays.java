public class Multidemensional_Arrays {
    public static void main(String[] args) {
       /* int[] numbers = {1,2,3};

        int[][] matrice = {{1,2,3,4,5},
                           {6},
                           {7,8}};
        System.out.println(matrice[2][1]);

        String[][] s = new String[2][3];
        s [1][2] = "Hello!!!";
        System.out.println(s[1][2]);*/

        int numbers [][] = {{1,2,3},
                            {4,5,6},
                            {7,8,9}};
        for (int i =0 ;i< numbers.length; i++){
            for (int j=0; j<numbers[i].length; j++){
                System.out.println(numbers[i][j]+" ");
            }
           System.out.println();
        }

    }
}
