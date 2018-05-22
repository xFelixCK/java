package DesignPattern.Singleton;

public class Singleton {
    //懒汉模式和饿汉模式
    private Singleton() {
    }

    private static Singleton singleton = null;

    //线程不安全
    public static Singleton getInstance1() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    //加上同步
    public static synchronized Singleton getInstance2() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    //双重检查锁
    public static synchronized Singleton getInstance3() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
