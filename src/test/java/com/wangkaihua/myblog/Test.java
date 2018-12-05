package com.wangkaihua.myblog;

/**
 * @author wangkaihua
 * @create 2018-12-05 17:18
 **/
public class Test {

    public static void main(String [] args){
        testStringSubString();
    }

    private static void testStringSubString() {
        StringBuilder sb = new StringBuilder();
        sb.append("aa");
        sb.append("、");
        sb.append("bb");
        sb.append("、");
        sb.append("我爱中国共产党");
        sb.append("、");

        String result = sb.toString();
        int length = result.length()-1;
        System.out.println(result.substring(0,length));
    }
}
