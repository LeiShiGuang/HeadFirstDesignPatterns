package com.ray.proxy.jdkproxy;

/**
 * @author leishiguang
 * @version v1.0.0
 * @since v1.0
 */
public class Test {
    public static void main(String[] args) {
        Person obj = (Person) new JdkMeipo().getInstance(new Customer());
        obj.findLove();
    }
}
