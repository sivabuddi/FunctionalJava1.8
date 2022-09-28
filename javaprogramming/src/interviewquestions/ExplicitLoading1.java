package interviewquestions;

public class ExplicitLoading1 {

    public static void main(String[] args) throws  java.lang.ClassNotFoundException{

        Class c1= Class.forName("interviewquestions.Employee");
        System.out.println(c1.getName());

    }

}
