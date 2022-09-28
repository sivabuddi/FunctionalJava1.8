package interviewquestions;

public class ClassNotFoundEx {

    public static void main(String[] args) {

        try{
            Class.forName("SivaKumarBuddi");
        }
        catch(Exception exception){
            exception.printStackTrace();

        }
    }
}

