package pizza5;

import sandwiches.SandwichMenu;
import sandwiches.SandwichSize;
import sandwiches.SandwichType;

public class PizzaMenu {
	
	public static class TypedPizza{
		private Pizza  pizza;
		private TypePizza type;
		
		public TypedPizza(Pizza p, TypePizza tp) {
			this.pizza =p;
			this.type=tp;
		}
		
		public Pizza getPizza() {
			return this.pizza;
		}
		public TypePizza getType() {
			return this.type;
		}
	}
	
	public static TypedPizza getMenuPizza(TypePizza tp, PizzaSize s) {
	
		Pizza p=null; 
		
		if(tp == TypePizza.Pepperoni) {
			p=new Pizza.Builder()
					  .size(s.getSize())
			          .pepperoni(true) 
			          .build();
		}
		else if (tp==TypePizza.Cheese) {
			p=new Pizza.Builder()
					  .size(s.getSize())
			          .extra_cheese(true) 
			          .build();
		}
		else if (tp==TypePizza.House) {
			p =new Pizza.Builder()	
					  .size(s.getSize())
			          .olives(true)
			          .extra_cheese(true)
			          .boiled_egg(true)
			          .anchovi(true)
			          .build();
		}
		return new TypedPizza(p,tp);
}
	
	public static Object[] getPizzaPromo(PizzaPromotion pro) {
		Object[] p=new Object[2];
		 switch (pro) {
			case PromoPepperoni: {
				p[0]=getMenuPizza(TypePizza.Pepperoni,PizzaSize.large);
				p[1]=SandwichMenu.getMenuSandwich(SandwichType.Cheeseburger,SandwichSize.junior);
				break;
			}
			case PromoCheese: {
				p[0]=getMenuPizza(TypePizza.Cheese,PizzaSize.large);
				p[1]=SandwichMenu.getMenuSandwich(SandwichType.Cheeseburger,SandwichSize.junior);
				break;
			}
			}
		 return p;
	}

}
