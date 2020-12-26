package GoogleGuiceSample;

import com.google.inject.Inject;

public class AbstractInjectSample {
    @Inject
    private Service superService;

    @Inject
    public AbstractInjectSample(Service service, String dummy) {
        System.out.println("スーパークラスのコンストラクタ <" + service + ">");
    }

    @Inject
    public void superInjectedMethod(String dummy, Service service) {
        System.out.println("スーパークラスのメソッド <" + service + ">");
    }

    public void superExecute() {
        System.out.println("スーパークラスのフィールド <" + superService + ">");
    }
}
