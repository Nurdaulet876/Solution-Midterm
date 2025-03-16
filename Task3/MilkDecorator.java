public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return coffee.getCost() + 0.25;
    }
    public String getDescription(){
        return coffee.getDescription() + ", with milk";
    }
}
