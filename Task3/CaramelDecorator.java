public class CaramelDecorator extends CoffeeDecorator {
    public CaramelDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return coffee.getCost() + 1.25;
    }
    public String getDescription(){
        return coffee.getDescription() + ", with caramel syrup";
    }
}
