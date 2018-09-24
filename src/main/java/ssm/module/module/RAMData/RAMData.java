package ssm.module.module.RAMData;

import java.util.HashMap;
import java.util.Map;

public class RAMData {
    private static volatile RAMData ramData;
    private Map<String, Object> data;
    //单例模式
    public static RAMData getRamData() {
        if (ramData == null) {
            synchronized (RAMData.class) {
                ramData = new RAMData();
            }
        }
        return ramData;
    }

    private RAMData() {
        this.data = new HashMap<>();
//        Map<String, String> temp = new HashMap<String, String>();
//        temp.put("userName", "小莺");
//        temp.put("password", "12346");
//        temp.put("sex", "男");
//        data.put("user", temp);

    }

    public boolean clearData() {
        this.data = new HashMap<>();
        return true;
    }
    public Map<String, Object> getData() {
        return data;
    }
    public String[] getKey() {
        return data.keySet().toArray(new String[0]);
    }
    public Object get(String key) {
        if (data.containsKey(data)) {
            return data.get(key);
        }else{
            return null;
        }
    }
    public void put(String key, Object value) {
        data.put(key, value);
    }
}
