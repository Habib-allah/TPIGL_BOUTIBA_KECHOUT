import java.util.Random;
import java.util.Scanner;

public class VectorHelper {
    private int vector[];

    public VectorHelper() {
        System.out.print("Entrer la taille du tableau : ");
        Scanner sc= new Scanner(System.in);
        vector=new int[sc.nextInt()];
        Random r=new Random();
        for (int i=0;i<vector.length;i++){
            vector[i]= r.nextInt(10);
        }
        /*for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+"####");
        }*/
    }
}
