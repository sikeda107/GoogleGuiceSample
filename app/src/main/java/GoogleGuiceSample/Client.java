package GoogleGuiceSample;

import com.google.inject.Inject;

public class Client {
    @Inject
    private Service service;

    public void execute() {
        String response = service.getResponse("Hello");
        System.out.println(response);
    }
}