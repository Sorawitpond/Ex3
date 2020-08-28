public class MakeBubble {
    public static void main(String[] args) {
        Bubble B1[] = new Bubble[100];
        Bubble B2[][] = new Bubble[5][20];

        for (int i = 0 ; i < B1.length ; i++){
            B1[i] = new Bubble (2);
        }
        for (int i = 0; i < 30 ; i++) {
            B1[i].setSize(3); ;
        }
        for (int i = 0; i <B2.length ; i++) {
            for (int j = 0; j <B2[i].length ; j++) {
                B2[i][j] = new Bubble(1);
            }
        }
        for (int i = 0; i <B2[1].length ; i++) {
            B2[1][i].setSize(2);
        }
        for (int i = 0; i < B1.length; i++) {
            System.out.print(B1[i].toString()+" ");
        }
        for (int i = 0; i <B2.length ; i++) {
            for (int j = 0; j < B2[i].length; j++) {
                System.out.print(B2[i][j].toString()+" ");
            }
            System.out.println();
        }
    }
}
