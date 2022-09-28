package interviewquestions;

class Testing {

    // Method
    void greeting()
    {
        // Print statement whenever method is called
        System.out.println("hello!");
    }
}

public class NoClassDefFoundErr {

    public static void main(String[] args) {

        // Creating object of class 1
        // inside main() in class2
        Testing geeks = new Testing();

        // Calling method of above class
        geeks.greeting();


    }
}


