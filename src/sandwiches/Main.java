package sandwiches;

import java.util.ArrayList;

import pizza5.*;
import pizza5.PizzaMenu.TypedPizza;
import sandwiches.SandwichMenu.TypedSandwich;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Sandwich p = new Sandwich(15, true , )
//		Sandwich p =new Sandwich.Builder()
//				          .size(12)
//				          .olives(true)
//				          .extra_cheese(true)
//				          .boiled_egg(true)
//				          .anchovi(true)
//				          .build();
//		
//		System.out.println("p");
//		System.out.println(" Size? "+p.getSize());
//		System.out.println(" Extra cheese? "+p.hasExtra_Cheese());
//		System.out.println(" Pepperoni? "+p.hasPepperoni());
		
		
		Sandwich p1 = SandwichMenu.getMenuSandwich(SandwichType.BLT, SandwichSize.standard).getSandwich();
		System.out.println("p1");
		System.out.println(" Size? "+p1.getSize());
		System.out.println(" Bacon? "+p1.hasBacon());
		System.out.println(" Lettuce? "+p1.hasLettuce());
		System.out.println(" Tomato? "+p1.hasTomato());
		
//		SandwichMenu.TypedSandwich p3 = SandwichMenu.getMenuSandwich(TypeSandwich.Pepperoni, SandwichSize.large);
//		System.out.println("p3");
//		System.out.println(" Size? "+p3.getSandwich().getSize());
//		System.out.println(" Type = "+p3.getType());
//		System.out.println(" Extra cheese? "+p3.getSandwich().hasExtra_Cheese());
//		System.out.println(" Pepperoni? "+p3.getSandwich().hasPepperoni());
//		
		ArrayList<Object> p2 = new ArrayList<Object>();
		p2=SandwichMenu.getSandwichPromo(SandwichPromotion.PromoA);
		
	
			System.out.println("p2[0]");
			System.out.println(" Size? "+((TypedSandwich) p2.get(0)).getSandwich().getSize());
			System.out.println(" Type = "+((TypedSandwich) p2.get(0)).getType());
			System.out.println(" Bacon? "+((TypedSandwich) p2.get(0)).getSandwich().hasBacon());
			System.out.println(" Lettuce? "+((TypedSandwich) p2.get(0)).getSandwich().hasLettuce());
			System.out.println(" Tomato? "+((TypedSandwich) p2.get(0)).getSandwich().hasTomato());
		
		
		
		System.out.println("p2[1]");
		System.out.println(" Size? "+((TypedPizza) p2.get(1)).getPizza().getSize());
		System.out.println(" Type = "+((TypedPizza) p2.get(1)).getType());
		System.out.println(" Cheeze? "+((TypedPizza) p2.get(1)).getPizza().hasExtra_Cheese());
		System.out.println(" Anchovy? "+((TypedPizza) p2.get(1)).getPizza().hasAnchovy());

	}

}
