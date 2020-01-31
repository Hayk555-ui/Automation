public class MultidimensionalArray {

    public static void main(String[] args) {

        int [][] multi = new int[6][6];

        for (int i = 0; i < multi.length; i++) {
            for (int j = 0; j < multi[i].length; j++) {
                multi[i][j] = 1;
                if (j == multi[i].length - 1|| i == 0){
                    multi[i][j] = 2;
                }
                if (i == multi[i].length - 1 || j == 0){
                    multi[i][j] = 2;
                }
                System.out.print(multi[i][j] + " ");
            }
            System.out.println();
        }

        char [][] symbol = new char[6][6];
        for (int i = 0; i < symbol.length; i++) {
            for (int j = 0; j < symbol[i].length; j++) {
                if (i + j == symbol[i].length-1 || i == j &&  j < symbol[i].length/2){
                    symbol[i][j] = '-';
                }
                else {
                    symbol[i][j] = ' ';
                }
                System.out.print(symbol[i][j] + " ");
            }
            System.out.println();
        }


        char [][] hitler = new char[5][5];
        for (int i = 0; i < hitler.length; i++) {
            for (int j = 0; j < hitler[i].length; j++) {
                if (i == hitler.length/2  || j == hitler.length/2){
                    hitler[i][j]='@';
                }else hitler[i][j] = ' ';
                System.out.print(hitler[i][j] + " ");
            }
            System.out.println();
        }
    }
}
