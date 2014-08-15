package wordcount;

import org.apache.hadoop.io.Text;
import org.junit.Assert;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by lwj on 14-8-14.
 */
public class MyHadTest {
    @Test
    public void testMain() throws Exception {

    }

    @Ignore("sa")
    @Test(expected = RuntimeException.class,timeout = 10000)
    public void testAdd() throws Exception {
        Assert.assertEquals(3,new MyHad().add(1,2));
    }

    @Test
    public void string(){
        String s = "\u0041\u00DF\u6771\uD801\uDC00";
        assertThat(s.length(),is(5));

        Text t = new Text("hadoop");
//        t.set("pig");
//        assertThat(t.getBytes().length,is(3));
//        byte[] b = t.getBytes();
        t.set(new Text("pig"));
        byte[] b2 = t.getBytes();
        assertThat(t.getBytes().length,is(6));
        assertThat("title", t.getLength(), is(10));


    }
}
