import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Karim on 17/10/2017.
 */
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

    @Test
    public void inverser() throws Exception {
        VectorHelper v = new VectorHelper(new int[]{5,6,7,5,8});
        v.inverser();
        assertArrayEquals("not inversed1",new int[]{8,5,7,6,5},v.getVector());
        v.setVector(new int[]{5,6,7,5});
        v.inverser();
        assertArrayEquals("not inversed2",new int[]{5,7,6,5},v.getVector());

    }

}