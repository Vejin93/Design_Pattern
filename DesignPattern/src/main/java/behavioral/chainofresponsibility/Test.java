package behavioral.chainofresponsibility;

public class Test {
    public static void main(String[] args){
        BranchManager branchManager = new BranchManager(null);
        CreditManager creditManager = new CreditManager(branchManager);
        Request request = new Request();

        creditManager.sign(request);

        System.out.println(request);
    }
}
