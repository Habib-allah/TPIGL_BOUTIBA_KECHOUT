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

    public int[] somme(int[] v1,int[] v2) throws DiffTailleException{
        int[] v3 = null;
        if(v1.length != v2.length){
            throw new DiffTailleException();
        }else{
            v3 = new int[v2.length];
            for(int i=0;i<v2.length;i++){
                v3[i] = v1[i] + v2[i];
            }
        }
        return v3;
    }

    public void minmax(int[] v){
        if(v != null && v.length>0) {
            int max = v[0], min = v[0];
            for (int i = 0; i < v.length; i++) {
                if(v[i]>max) max = v[i];
                if(v[i]<min) min = v[i];
            }
            System.out.println("max = "+ max);
            System.out.println("min = "+ min);



        }
    }

}
