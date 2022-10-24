package isp.good;

public class ClientApp {
    public static void main(String[] args) {
        OrderService orderService=new ComboOrderService();
        orderService.orderCombo(10,20);
        BurgerOrderService burgerOrderService= new BurgerOrderServiceAdapter(orderService);
        burgerOrderService.orderBurger(10);
        FriesOrderService friesOrderService= new FriesOrderServiceAdapter(orderService);
        friesOrderService.orderFries(20);

    }
}
