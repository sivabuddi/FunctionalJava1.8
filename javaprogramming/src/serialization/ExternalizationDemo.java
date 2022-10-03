package serialization;

import java.io.*;


public class ExternalizationDemo {

    public static void main(String[] args) throws Exception, IOException, ClassNotFoundException {

        File file = new File("/Users/sivakumarbuddi/Courses/FunctionalJava1.8/javaprogramming/src/serialization/Test");

        // convert object into stream of byte using Externalization
        UserExternalization user = new UserExternalization(); // Allowing only zero argument constructor.
        user.setName("Siva Kumar");
        user.setAge(35);
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(file));
        outputStream.writeObject(user);


        // De Serializing the object
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        user=(UserExternalization)objectInputStream.readObject();
        System.out.println("After Deserializing the object from Externalization");

        System.out.println(user.getName());
        System.out.println(user.getAge());



    }


}
