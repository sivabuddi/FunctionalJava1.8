package learning.features.methodreferences;

interface  Messageable{
    Message getMessage(String string);
}

class Message{

    Message(String string){
        System.out.println(string);
    }

}


public class ConstructorReference {

    public static void main(String[] args) {

        Messageable messageable = Message::new;
        messageable.getMessage("Initialized Message Constructor");

    }



}
