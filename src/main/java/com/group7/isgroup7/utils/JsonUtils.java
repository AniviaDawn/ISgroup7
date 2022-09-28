package com.group7.isgroup7.utils;




import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class JsonUtils {

    public static Object Json(Integer code,String msg){
        Map<Object, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("msg", msg);
        Object jsonObject = JSONObject.toJSON(map);
        return jsonObject;
    }
    public static Object Json(Integer code,String msg,Object data){
        Map<Object, Object> map = new HashMap<>();
        map.put("code", code);
        map.put("msg", msg);
        map.put("data",data);
        Object jsonObject = JSONObject.toJSON(map);
        return jsonObject;
    }
}
