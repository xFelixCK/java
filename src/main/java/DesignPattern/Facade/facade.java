package DesignPattern.Facade;

public class facade {
    public void fun() {
        module1 mod1 = new module1();
        mod1.fun1();

        module2 mod2 = new module2();
        mod2.fun2();
    }
}
