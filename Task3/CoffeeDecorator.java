public abstract class CoffeeDecorator implements Coffee {
    public Coffee coffee;
    public CoffeeDecorator(Coffee coffee){
        this.coffee = coffee;
    }
    public double getCost(){
        return coffee.getCost();
    }
    public String getDescription(){
        return coffee.getDescription();
    }
}
