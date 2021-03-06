package wordcount;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.compress.GzipCodec;
import org.apache.hadoop.util.Progressable;
import org.apache.hadoop.util.Tool;
import org.apache.hadoop.util.ToolRunner;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.Map;

/**
 * Created by lwj on 14-8-14.
 */
public class MyHad {
    static {
        System.out.println("aa");}
//    static {
//        URL.setURLStreamHandlerFactory(new FsUrlStreamHandlerFactory());
//    }
    public static void main(String[] args) throws Exception {
//        InputStream in = null;
//        try{
//            in = new URL("hdfs://localhost:9000/user/hadoop/input/1.txt").openStream();
//            IOUtils.copyBytes(in,System.out,4096,false);
//        } catch (MalformedURLException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            IOUtils.closeStream(in);
//        }

//        Configuration conf = new Configuration();
//        FSDataInputStream in = null;
//        try {junit
//            FileSystem fs = FileSystem.get(URI.create("hdfs://localhost:9000/user/hadoop/input/1.txt"),conf);
//            in = fs.open(new Path("hdfs://localhost:9000/user/hadoop/input/1.txt"));
//            IOUtils.copyBytes(in,System.out,4096,false);
//            in.seek(10);
//            IOUtils.copyBytes(in,System.out,4096,false);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            IOUtils.closeStream(in);
//        }

//        String localSrc = "/home/lwj/jerseyUpload.zip";
//        String dst = "hdfs://localhost:9000/user/lwj/input/1.html";
//        InputStream in = new BufferedInputStream(new FileInputStream(localSrc));
//        Configuration conf = new Configuration();
//        FileSystem fs = FileSystem.get(URI.create(dst),conf);
//        OutputStream out = fs.create(new Path(dst),new Progressable() {
//            @Override
//            public void progress() {
//                System.out.print(".");
//            }
//        });
//        IOUtils.copyBytes(in,out,4096,true);

//        FileStatus stat = fs.getFileStatus(new Path(dst));
//        System.out.println(stat.getPath());

//        Configuration conf = new Configuration();
//        conf.addResource("1.xml");
//        System.out.println(conf.get("color"));
//        FileSystem fs = FileSystem.get(URI.create("/home/lwj"),conf);
////        FileStatus[] status = fs.listStatus(new Path("/home/lwj"));
//        FileStatus[] status = fs.globStatus(new Path("/home/lwj/*a*"),new PathFilter() {
//            @Override
//            public boolean accept(Path path) {
//                return !path.toString().matches(".*oo.*");
//            }
//        });
//        Path[] listedPath = FileUtil.stat2Paths(status);
//        for (Path p : listedPath){
//            System.out.println(p);
//        }

//        Class<?> codecClass = Class.forName(org.apache.hadoop.io.compress.GzipCodec);

        class ConfigurationPrinter extends Configured implements Tool {

            @Override
            public int run(String[] args) throws Exception {
                Configuration.addDefaultResource("1.xml");
                Configuration conf = getConf();
                for(Map.Entry<String,String> entry:conf){
                    System.out.print(entry.getKey()+"="+entry.getValue()+"\n");
                }
                return 0;
            }
        }

        int exitcode = ToolRunner.run(new ConfigurationPrinter(),args);
        System.out.println(exitcode);

        String quality = "123342";
        quality.matches("[01459]");
    }

    public int add(int a,int b){
        return a+b;
    }
}
