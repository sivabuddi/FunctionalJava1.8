package isp.good;

public class ComboOrderService implements  OrderService{

    @Override
    public void orderBurger(int quantity) {
        System.out.println("Received order of "+quantity+" burgers");
    }

    @Override
    public void orderFries(int fries) {
        System.out.println("Received order of "+fries+ " fries");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        System.out.println("Order received for Combo of  quantity ="+quantity+ " and fries = "+fries);
    }
}
