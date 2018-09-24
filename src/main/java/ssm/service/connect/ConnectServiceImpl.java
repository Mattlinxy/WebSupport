package ssm.service.connect;


import org.springframework.stereotype.Service;
import ssm.module.module.RAMData.RAMData;

import java.util.List;
import java.util.Map;


@Service
public class ConnectServiceImpl implements ConnectService {
    private RAMData ramData = RAMData.getRamData();


    public void put(String key, Object object) {
        ramData.put(key,object);
    }

    public String[] getKey() {
        return ramData.getKey();
    }

    public Object get(String key) {
        return ramData.get(key);
    }

    public Map<String, Object> getData() {
        return ramData.getData();
    }

    public boolean clearData() {
        return ramData.clearData();
    }

}
