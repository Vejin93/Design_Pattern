package behavioral.chainofresponsibility;

public class CreditManager implements CanSign{
    CanSign manager;
    String sign;

    public CreditManager(CanSign manager){
        this.manager = manager;
        this.sign = "Credit manager";
    }

    @Override
    public void sign(Request r) {
        r.sign(sign);
        manager.sign(r);
    }
}
