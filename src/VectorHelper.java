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
        for (int i=0;i<vector.length;i++){
            System.out.print(vector[i]+";");
        }
    }

    public VectorHelper(int[] vector){
        this.vector = vector;

    }

    public void setVector(int[] vector){
        this.vector = vector;
    }

    public int[] getVector(){
        return vector;
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
    public void inverser() {
        int m;
        for (int i = 0; i < vector.length / 2; i++) {
            m = vector[i];
            vector[i] = vector[vector.length - i - 1];
            vector[vector.length - i - 1] = m;
        }
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + ";");
        }

    }


    /**
     *  Somme le vecteur de l'objet courant avec le vecteur de l'objet v2
      * @param v2 objet VectorHelper dans lequel on trouve le vecteur a sommer avec le vecteur de l'objet courant
     * @throws DiffTailleException si les tailles des deux tables sont differents
     */
    public void somme(VectorHelper v2) throws DiffTailleException{
        int[] v3 = null;

        if(vector.length != v2.vector.length){
            throw new DiffTailleException();
        }else{
            v3 = new int[v2.vector.length];
            for(int i=0;i<v2.vector.length;i++){
                v3[i] = vector[i] + v2.vector[i];
            }
        }
        for(int i=0;i<v3.length;i++)System.out.print(v3[i]+";");
    }

    /**
     *Calcule le max et le min de l'attribut vecteur simultanement
     * @return Tableau de deux elements : 1er max , 2eme min
     */
    public int[] minmax(){
        int maxmin[] = null;
        if(vector != null && vector.length>0) {
             maxmin= new int[2];
            int max = vector[0], min = vector[0];
            for (int i = 0; i < vector.length; i++) {
                if(vector[i]>max) max = vector[i];
                if(vector[i]<min) min = vector[i];
            }
            maxmin[0]=max;
            maxmin[1]=min;
            System.out.println("max = "+ max);
            System.out.println("min = "+ min);

        }
        return maxmin;
    }
    public int f(int v){
        return v*2;
    }
    public void appliquerFormule(){
        for(int i=0;i<vector.length;i++){
            vector[i]=f(vector[i]);
        }

    }

}





