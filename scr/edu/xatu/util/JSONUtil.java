package edu.xatu.util;

import com.sdicons.json.mapper.JSONMapper;
import com.sdicons.json.parser.JSONParser;
import edu.xatu.vo.GamePackage;

import java.io.StringReader;

public class JSONUtil {
    public static String toJson(Object o) throws Exception {
        return JSONMapper.toJSON(o).render(false);
    }
    public static Object toJava(String jsonStr) {
        Object o = null;
        try {
            o = JSONMapper.toJava(new JSONParser(new StringReader(jsonStr)).nextValue(),GamePackage.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o;
    }
}