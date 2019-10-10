package test.edu;
import com.sdicons.json.mapper.*;
import com.sdicons.json.model.*;
import com.sdicons.json.parser.*;
import edu.xatu.util.JSONUtil;
import org.junit.Test;

import java.io.*;

public class TestJSON {
@Test
    public void test1() throws Exception {
    Address adr=new Address("北京","西安","192348723");
    Student s=new Student(1001,"张三",18,adr);
    Address adr1=new Address("北京","西安","192348723");
    Student s1=new Student(1001,"张三",18,adr);
    JSONValue jsonValue= JSONMapper.toJSON(s);
    String str=jsonValue.render(false);
    System.out.println(str);
    Student [] ss=new Student[]{s,s1};
    System.out.println(JSONMapper.toJSON(ss).render(true));
    System.out.println(JSONUtil.toJava(str));
    }
    @Test
    public void test2(){
        try {
            String str="{\"address\":{\"busiAddress\":\"西安\",\"homeAddress\":\"北京\",\"phone\":\"192348723\"},\"age\":18,\"id\":1001,\"name\":\"张三\"}";
//        JSONValue jsonValue = new JSONParser(new StringReader(str)).nextValue;
            JSONValue jsonValue=new JSONParser(new StringReader(str)).nextValue();
            Student s=(Student) JSONMapper.toJava(jsonValue,Student.class);
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
