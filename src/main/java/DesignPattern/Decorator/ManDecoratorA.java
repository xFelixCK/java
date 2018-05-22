package DesignPattern.Decorator;

public class ManDecoratorA extends Decorator {
    public void eat() {
        super.eat();
        reEat();
        System.out.println("ManDecoratorA类");
    }

    private void reEat() {
        System.out.println("man eat again");
    }
}
