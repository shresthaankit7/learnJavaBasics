/**
 * Created by ankit07 on 10/11/16.
 */
public class ClassLoadRunner {

    public static void main(String[] args){
        MyClassLoader myClassLoader = new MyClassLoader();

        myClassLoader.invodeMethod("DemoClass","demoMethod");
    }
}
