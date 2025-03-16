public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return coffee.getCost() + 1.25;
    }
    public String getDescription(){
        return coffee.getDescription() + ", with chocolate syrup";
    }
}