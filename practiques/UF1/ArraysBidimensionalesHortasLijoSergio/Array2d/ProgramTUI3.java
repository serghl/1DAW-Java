public class ProgramTUI3 {
    
    
    public static void main(String[] args) {
        int i, j;
        int[][] a = {{3,2,4,2},{6,8,2,9}};
        System.out.println("Recorregut per files");
        for (i = 0; i < a.length; i++) {
            for (j = 0; j < a[0].length; j++) {
                System.out.printf("%3d ", a[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.println("Recorregut per columnes ?????????");
        for (i = 0; i < a[0].length; i++) {
            for (j = 0; j < a.length; j++) {
                System.out.printf("%3d ", a[j][i]);
            }
            System.out.printf("\n");
        }
    }
}