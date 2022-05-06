public class transpozu {
    public static void main(String[] args) {
        int[][] list = new int[2][3];
        int[][] transpozu = new int[3][2];
        int number = 1;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                list[i][j] = number++;
            }
        }
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("----------------------------");

        for (int i = 0; i < transpozu.length; i++) {
            for (int j = 0; j < transpozu[i].length; j++) {
                transpozu[i][j] = list[j][i];
                System.out.print(transpozu[i][j] + " ");

            }
            System.out.println();


        }
    }
}
