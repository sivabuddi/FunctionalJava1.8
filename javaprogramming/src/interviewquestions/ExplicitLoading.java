package interviewquestions;
import java.lang.ClassLoader;

public class ExplicitLoading {

    public static void main(String[] args) throws java.lang.ClassNotFoundException{

            ClassLoader classLoader = ClassLoader.getSystemClassLoader();
            Class c1 = classLoader.loadClass("interviewquestions.Employee");
            System.out.println("Name of the class = "+ c1.getName());


    }


}
