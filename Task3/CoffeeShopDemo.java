public class CoffeeShopDemo {
    public static void main(String[] args) {
        Coffee latte = new Latte();
        System.out.println(latte.getDescription() + " will cost $" + latte.getCost());
        latte = new MilkDecorator(latte);
        System.out.println(latte.getDescription() + " will cost $" + latte.getCost());
        latte = new ChocolateDecorator(latte);
        System.out.println(latte.getDescription() + " will cost $" + latte.getCost());
    }
}
