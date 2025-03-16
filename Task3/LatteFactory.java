public class LatteFactory extends CoffeeFactory {
    public Coffee createCoffee(){
        return new Latte();
    }
}
