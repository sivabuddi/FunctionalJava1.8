package isp.good;

public class BurgerOrderServiceAdapter implements  BurgerOrderService{

    private OrderService adapter;



    public BurgerOrderServiceAdapter(OrderService adapter) {
        //super();
        this.adapter = adapter;
    }

    @Override
    public void orderBurger(int quantity) {
        adapter.orderBurger(quantity);
    }
}
