package isp.good;

public class ClientApp {
    public static void main(String[] args) {
        OrderService orderService=new ComboOrderService();
        orderService.orderCombo(10,20);
        BurgerOrderService burgerOrderService= new OrderServiceAdapter(orderService);
        burgerOrderService.orderBurger(10);
    }
}
