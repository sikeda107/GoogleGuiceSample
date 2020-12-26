package GoogleGuiceSample;

public class ServiceImpl implements Service {
    public String getResponse(String msg) {
        return "Re: " + msg;
    }
}