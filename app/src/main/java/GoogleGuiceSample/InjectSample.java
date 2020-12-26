package GoogleGuiceSample;

import com.google.inject.Inject;

public class InjectSample {
    // フィールド
    @Inject
    private Service service;

    // コンストラクタ
    @Inject
    public InjectSample(Service service) {
        System.out.println("コンストラクタ <" + service + ">");
    }

    // メソッド
    @Inject
    public void injectedMethod(Service service) {
        System.out.println("メソッド <" + service + ">");
    }

    public void execute() {
        System.out.println("フィールド <" + service + ">");
    }
}
