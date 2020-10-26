package com.neuedu.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        TestMap testMap = new TestMap();
        testMap.text1();
    }

    private void text1() {
        Map map = new HashMap();
        map.put("age", 1);
        map.put("name", "张三");
        map.isEmpty();
        Map map2=new HashMap();
        map2.put("isamn",false);
        map2.put("isamn",false);
        map2.remove("isamn");
        map2.putAll(map);

        //迭代器
        Iterator integer = map.entrySet().iterator();
        while (integer.hasNext()) {
            Map.Entry entry = (Map.Entry) integer.next();
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        //增强for 循环
        for (Object o : map.keySet()) {
            System.out.println(o);
            System.out.println(map.get(o));
        }

        //lambda
        map.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });
    }
}
