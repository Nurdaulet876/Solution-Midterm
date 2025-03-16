public class AmericanoFactory extends CoffeeFactory {
    public Coffee createCoffee(){
        return new Americano();
    }
}
