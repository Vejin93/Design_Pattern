package behavioral.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

public class Request {

    List<String> signs;

    public Request(){
        signs = new ArrayList<String>();
    }

    public void sign(String sign){
        signs.add(sign);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(10000);
        sb.append("Signed the request: ");
        for(String s : signs){
            sb.append(s);
            sb.append("\n");
        }
        return sb.toString();
    }
}
