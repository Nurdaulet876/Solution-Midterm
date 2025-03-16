public class CreamDecorator extends CoffeeDecorator {
    public CreamDecorator(Coffee coffee){
        super(coffee);
    }
    public double getCost(){
        return coffee.getCost() + 0.75;
    }
    public String getDescription(){
        return coffee.getDescription() + ", with whipped cream";
    }
}
