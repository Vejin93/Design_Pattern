package behavioral.chainofresponsibility;

public class BranchManager implements CanSign{

    CanSign manager;
    String sign;

    public BranchManager(CanSign manager){
        this.manager = manager;
        this.sign = "Branch manager";
    }

    @Override
    public void sign(Request r){
        r.sign(sign);
    }
}
