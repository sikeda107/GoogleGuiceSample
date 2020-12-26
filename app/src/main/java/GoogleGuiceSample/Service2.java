package GoogleGuiceSample;

import com.google.inject.ImplementedBy;

@ImplementedBy(Service2Impl.class)
public interface Service2 {
    String getResponse(String msg);
}
