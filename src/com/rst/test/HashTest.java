package com.rst.test;

import org.junit.Test;

import java.util.HashMap;

public class HashTest {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("sss", 1);
        map.put("aaa", 2);
    }

    @Test
    public void testIntern() {
        String a = "aaaa";
        String b = "aaaa";
        String c = new String("aaaa");
        String d = a.intern();
        String e = c.intern();
        System.out.println(c == b);
        System.out.println(c == d);
        System.out.println(a == d);
        System.out.println(d.equals(c));
        System.out.println(c == e);
        System.out.println("b:" + b.hashCode());
        System.out.println("c:" + c.hashCode());

        String s1 = "ab" + "cd";
        String s2 = "abc" + "d";
        System.out.println(s1 == s2);

    }
}
