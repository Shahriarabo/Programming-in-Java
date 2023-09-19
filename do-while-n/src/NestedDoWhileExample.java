public class NestedDoWhileExample {
    public static void main(String[] args) {
        int row , com ,y;
        row =1;
        do {
            com = 1;

            do {
                y = row*com;
                System.out.print("" +y);
            } while (com <=3);
            System.out.println("\n");
            row=row+1;
        } while (row <= 3);
    }
}
