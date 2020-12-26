package GoogleGuiceSample;

import com.google.inject.Inject;

public class Client2 {
    @Inject
    private Service2 service2;

    public void execute() {
        String response = service2.getResponse("Hello");
        System.out.println(response);
    }
}