public class soalno6a 
{
    public static void main(String[] args) {
        for (int a = 0; a <= 5; a++) {
            for (int j = 0; j <= 5-a; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= a; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}