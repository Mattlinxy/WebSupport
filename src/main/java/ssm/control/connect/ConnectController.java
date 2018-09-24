package ssm.control.connect;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.service.connect.ConnectService;
import ssm.tools.Json.JsonUtils;

import java.util.Map;

@Controller
@RequestMapping("/connect")
public class ConnectController {

    @Autowired
    private ConnectService connectService;

    @RequestMapping("/getKey")
    @ResponseBody
    public String[] getKey() {
        return connectService.getKey();
    }

    @RequestMapping("/getData")
    @ResponseBody
    public Map getData() {
        return connectService.getData();
    }

    @RequestMapping("/get")
    @ResponseBody
    public Object get(String key) {
        return connectService.get(key);
    }

    @RequestMapping("/put")
    @ResponseBody
    public Object put(String key,String data){
        try {
            connectService.put(key, JsonUtils.toMap(data));
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @RequestMapping("/clearData")
    @ResponseBody
    public Boolean clearData() {
        return connectService.clearData();
    }

}
