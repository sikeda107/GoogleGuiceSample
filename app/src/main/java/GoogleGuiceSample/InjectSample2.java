package GoogleGuiceSample;

import com.google.inject.Inject;

public class InjectSample2 extends AbstractInjectSample{
    @Inject
    public InjectSample2(Service service) {
        super(service, "dummy");
        System.out.println("コンストラクタ <" + service + ">");
    }

    @Inject
    public void injectedMethod(String dummy, Service service) {
        System.out.println("メソッド <" + service + ">");
    }
}
