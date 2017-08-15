
public class Soy extends CondimentDecorator {
	Beverage beverage;
	public Soy(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
    public String getDescription() {
    	// TODO Auto-generated method stub
    	return beverage.getDescripion()+ ",Soy";
    	
    }
    public double cost(){
    	return 0.15+ beverage.cost();	
	}
}