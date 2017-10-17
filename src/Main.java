
public class Main {
    public static void main(String arg[])
    {
        VectorHelper v=new VectorHelper();

        try {
            v.somme(new VectorHelper());
        } catch (DiffTailleException e) {
            e.printStackTrace();
        }
        System.out.println(" ");
        v.inverser();
    }

}
