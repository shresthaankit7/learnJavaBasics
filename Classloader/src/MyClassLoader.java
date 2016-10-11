import com.sun.org.apache.xpath.internal.SourceTree;

import javax.naming.event.ObjectChangeListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by ankit07 on 10/11/16.
 */
public class MyClassLoader extends ClassLoader {

    public void invodeMethod(String binaryClassname,String methodName){
        ClassLoader classLoader = this.getClass().getClassLoader();

        try {
            Class myloadedClass = classLoader.loadClass(binaryClassname);

            System.out.println("loaded Class name ::" + myloadedClass.getName() );

            Constructor constructor = myloadedClass.getConstructor();
            Object myClassObject = constructor.newInstance();

            Method method = myloadedClass.getMethod(methodName);
            System.out.println("Method name to execute ::" + method.getName() );

            method.invoke(myClassObject);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
