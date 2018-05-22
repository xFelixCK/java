package DesignPattern.Decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        man man = new man();
        ManDecoratorA decoratorA = new ManDecoratorA();
        ManDecoratorB decoratorB = new ManDecoratorB();

        decoratorA.setPerson(man);
        decoratorB.setPerson(man);
        decoratorA.eat();
        decoratorB.eat();
    }
}
