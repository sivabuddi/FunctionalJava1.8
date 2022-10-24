package isp.bad;

public class ClientApp {

    public static void main(String[] args) throws  UnsupportedOperationException {

        OrderService orderService= new BurgerOrderService();
        orderService.orderBurger(10);
        orderService.orderFries(14);

    }
}
