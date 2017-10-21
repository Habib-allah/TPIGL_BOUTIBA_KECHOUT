import org.junit.Test;

import static org.junit.Assert.*;

public class VectorHelperTest {
    @Test
    public void trier() throws Exception {
        VectorHelper v = new VectorHelper(new int[]{5,1,7,5,8});
        v.trier();
        assertArrayEquals("non trié1",new int[]{1,5,5,7,8},v.getVector());

        v.setVector(new int[]{1,1,-5,1,2,-8});
        v.trier();
        assertArrayEquals("non trié2",new int[]{-8,-5,1,1,1,2},v.getVector());

    }

    @Test(expected = DiffTailleException.class)
    public void sommeTest () throws Exception{
        VectorHelper v1 = new VectorHelper(new int[]{5,3,7,0,8});
        VectorHelper v2 = new VectorHelper(new int[]{7,1,2,1,9});
        int v3[] = v1.somme(v2);
        assertArrayEquals("Somme erronée",new int[] {12,4,9,1,17},v3);

        VectorHelper v4 = new VectorHelper(new int[]{5,3,7,0,8,6});
        VectorHelper v5 = new VectorHelper(new int[]{7,1,2,1,9});
        int v6[] = v4.somme(v5);
        assertArrayEquals("Somme erronée",null,v6);
    }

    @Test
    public void minMaxTest(){
        VectorHelper v = new VectorHelper(new int[]{7,1,2,1,9});
        int[] result =v.minmax();
        assertArrayEquals("Le min ou le max est erroné !",new int[]{9,1},result);
    }

    @Test
    public void inverser() throws Exception {
        VectorHelper v = new VectorHelper(new int[]{5,6,7,5,8});
        v.inverser();
        assertArrayEquals("not inversed1",new int[]{8,5,7,6,5},v.getVector());
        v.setVector(new int[]{5,6,7,5});
        v.inverser();
        assertArrayEquals("not inversed2",new int[]{5,7,6,5},v.getVector());
    }
    @Test
    public void AppliquerFormule() throws Exception{
        VectorHelper v = new VectorHelper(new int[]{1,2,3,9,6});
        v.appliquerFormule();
        assertArrayEquals("not applyed",new int[]{v.f(1),v.f(2),v.f(3),v.f(9),v.f(6)},v.getVector());
    }

}