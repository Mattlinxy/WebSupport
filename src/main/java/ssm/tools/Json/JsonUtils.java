package ssm.tools.Json;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import org.springframework.util.StringUtils;

import java.util.*;

public class JsonUtils {
    /**
     * 将json字符串转为Map结构
     * 如果json复杂，结果可能是map嵌套map
     * @param jsonStr 入参，json格式字符串
     * @return 返回一个map
     */
    public static Object toMap(String jsonStr) {
        Map<String, Object> map = new HashMap<>();
        if (!StringUtils.isEmpty(jsonStr)) {
            //最外层解析
            Object object = toType(jsonStr);
            if (!(object instanceof JSONObject)) {
                return object;
            }
            JSONObject json = (JSONObject) object;
            for (Object key : json.keySet()) {
                Object value = json.get(key);
                //如果内层还是数组的话，继续解析
                if (value instanceof JSONArray) {
                    List<Object> list = new ArrayList<>();
                    for (Object o : ((JSONArray) value)) {
                        if (o instanceof JSONObject) {
                            JSONObject item = (JSONObject) o;
                            list.add(toMap(item.toString()));
                        } else {
                            list.add(o);
                        }
                    }
                    map.put(key.toString(), list);
                } else if (value instanceof JSONObject){
                    map.put(key.toString(), toMap(value.toString()));
                }else{
                    map.put(key.toString(), value);
                }
            }
            return map;
        } else {
            return null;
        }
    }
    public static Object toType(String json) {
        Object object = null;
        try {
            object=JSONObject.parseObject(json);
        } catch (Exception e) {
            object = json;
        }
        return object;
    }

//    public static void main(String[] args) {
//        String jsonStr = "{\"status\":\"0\",\"data\":[{\"name\":\"name0\",\"age\":0}{\"name\":\"name3\",\"age\":15},{\"name\":\"name4\",\"age\":20}]}";
//        Map map = toMap(jsonStr);
//        System.out.println(map);
//
//    }
}
