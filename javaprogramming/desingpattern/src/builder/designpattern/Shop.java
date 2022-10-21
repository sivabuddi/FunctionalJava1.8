package builder.designpattern;

public class Shop {

    public static void main(String[] args) {

        Phone phone = new Phone("Ubuntu","Intel",10000,500,2 );
        System.out.println(phone.toString());

        // setting parameters order does not matter
        //
        Phone phone1 = new PhoneBuilder().setOs("RedHat").setProcessor("Qual").getPhone();
        System.out.println(phone1.toString());
    }
}
