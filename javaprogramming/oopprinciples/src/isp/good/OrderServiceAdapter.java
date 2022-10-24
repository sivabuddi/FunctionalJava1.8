package isp.good;

public class OrderServiceAdapter implements  BurgerOrderService{

    private OrderService adapter;

    public OrderServiceAdapter(OrderService adapter) {
        //super();
        this.adapter = adapter;
    }

    @Override
    public void orderBurger(int quantity) {
        adapter.orderBurger(quantity);
    }
}
