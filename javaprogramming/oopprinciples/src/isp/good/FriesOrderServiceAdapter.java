package isp.good;

public class FriesOrderServiceAdapter implements FriesOrderService{
    private OrderService orderService;

    public FriesOrderServiceAdapter(OrderService orderService) {
        super();
        this.orderService = orderService;
    }

    @Override
    public void orderFries(int fries) {
        orderService.orderFries(fries);
    }
}
