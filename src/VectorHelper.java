import java.util.Random;
import java.util.Scanner;

public class VectorHelper {
    private int vector[];

    public VectorHelper() {
        System.out.print("Entrer la taille du tableau : ");
        Scanner sc = new Scanner(System.in);
        vector = new int[sc.nextInt()];
        Random r = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = r.nextInt(10);
        }
        /*for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ";");
        }*/
    }

    public void trier() {//SELECTION SORT
        for (int i = 0; i < vector.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[index]) {
                    index = j;
                }
            }
            int smallerNumber = vector[index];
            vector[index] = vector[i];
            vector[i] = smallerNumber;
        }

    }
    public void inverser(){
        int m;
        for (int i=0;i<vector.length/2;i++){
            m=vector[i];
            vector[i]=vector[vector.length-i-1];
            vector[vector.length-i-1]=m;
        }
        /*for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ";");
        }*/
    }
}





