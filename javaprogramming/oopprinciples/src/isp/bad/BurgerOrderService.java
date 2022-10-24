package isp.bad;

public class BurgerOrderService implements OrderService {
    @Override
    public void orderBurger(int quantity) {
        System.out.println("Order received successfully");
    }

    @Override
    public void orderFries(int fries) {
        throw new UnsupportedOperationException("No fries on Burger Order");
    }

    @Override
    public void orderCombo(int quantity, int fries) {
        throw new UnsupportedOperationException("No combo on Burger Order");
    }
}
