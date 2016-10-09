import org.apache.commons.lang3.*;
/**
 * Created by ankit07 on 10/9/16.
 */
public class Capitalize {
    public static void main(String[] args){
        String variable = "Abcd";

        System.out.println("Variable::" + variable);

        System.out.println("Variable in Caps::" + StringUtils.capitalize(variable));
    }
}
