package ssm.service.connect;

import java.util.Map;

public interface ConnectService {
    String[] getKey();

    Object get(String key);

    void put(String key ,Object object);

    Map getData();

    boolean clearData();

}
