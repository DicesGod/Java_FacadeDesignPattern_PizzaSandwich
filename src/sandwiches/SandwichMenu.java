package sandwiches;

import java.util.ArrayList;

import pizza5.PizzaMenu;
import pizza5.PizzaSize;
import pizza5.TypePizza;


public class SandwichMenu {
	
	public static class TypedSandwich{
		private Sandwich  sandwich;
		private SandwichType type;
		
		public TypedSandwich(Sandwich s, SandwichType tp) {
			this.sandwich = s;
			this.type=tp;
		}
		
		public Sandwich getSandwich() {
			return this.sandwich;
		}
		public SandwichType getType() {
			return this.type;
		}
	}
	
	public static TypedSandwich getMenuSandwich(SandwichType tp, SandwichSize s) {
	
		Sandwich sandwich=null; 
		
		if(tp == SandwichType.BLT) {
			sandwich=new Sandwich.Builder()
					  .size(s.getSize())
			          .bacon(true) 
			          .lettuce(true)
			          .tomato(true)
			          .build();
		}
		else if (tp==SandwichType.Hamburger) {
			sandwich=new Sandwich.Builder()
					  .size(s.getSize())
			          .hambuger(true) 
			          .pickles(true)
			          .build();
		}
		else if (tp==SandwichType.Cheeseburger) {
			sandwich =new Sandwich.Builder()	
					  .size(s.getSize())
			          .cheddar(true)
			          .hambuger(true)
			          .pickles(true)
			          .build();
		}
		else if (tp==SandwichType.House) {
			sandwich =new Sandwich.Builder()	
					  .size(s.getSize())
			          .hambuger(true)
			          .build();
		}
		return new TypedSandwich(sandwich,tp);
}
	
	public static ArrayList<Object> getSandwichPromo(SandwichPromotion pro) {
		ArrayList<Object> p = new ArrayList<Object>();
		
		 switch (pro) {
			case PromoA: {
				p.add(getMenuSandwich(SandwichType.BLT,SandwichSize.standard));
				p.add(PizzaMenu.getMenuPizza(TypePizza.House, PizzaSize.small));
				break;
			}
			case PromoB: {
				p.add(getMenuSandwich(SandwichType.Cheeseburger,SandwichSize.standard));
				p.add(PizzaMenu.getMenuPizza(TypePizza.House, PizzaSize.small));
				break;
			}
		}
		 return p;
	}

}
