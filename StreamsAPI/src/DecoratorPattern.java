class DecoratorPattern
{

	

	public static void main(String[] args)
	{
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()+": $ "+beverage.cost());
		
		Beverage beverage2 = new Espresso();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		
		System.out.println(beverage2.getDescription()+": $ "+beverage2.cost());

		Beverage beverage3 = new DarkRoast();
		beverage3 = new Whip(beverage3);
		beverage3 = new Mocha(beverage3);
		
		System.out.println(beverage3.getDescription()+": $ "+beverage3.cost());
		
	}

}
abstract class Beverage
{
	String description;
	
	public Beverage()
	{
		description = "Unknown Beverage";
	}

	public abstract double cost();
	

	public String getDescription()
	{
		return description;
	}
	
}
abstract class CondimentDecorator extends Beverage
{
	public abstract String getDescription();
}
class Espresso extends Beverage
{
	
	@Override
	public double cost()
	{
		return 4.99;
	}
	public String getDescription()
	{
		return "Espresso";
	}

}
class DarkRoast extends Beverage
{

	@Override
	public double cost()
	{
		return 1.2;
	}
	public String getDescription()
	{
		return "DarkRoast";
	}

}
class Mocha extends CondimentDecorator
{
	Beverage beverage;
	public Mocha(Beverage beverage2)
	{
		this.beverage=beverage2;
	}

	@Override
	public double cost()
	{
		return beverage.cost()+ 5.2;
	}

	@Override
	public String getDescription()
	{
		return beverage.getDescription()+ "Mocha";
	}

}
class Whip extends CondimentDecorator
{
	Beverage beverage;

	public Whip(Beverage beverage2)
	{
		this.beverage=beverage2;
	}

	@Override
	public double cost()
	{
		return beverage.cost()+ 5.2;
	}

	@Override
	public String getDescription()
	{
		return beverage.getDescription()+ "Whip";
	}

}