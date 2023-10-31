package com.unocareer;
public class TotalPrice {
	
	//req1:The pair of shoe has 18% Gst and give discount 12%
	//req2:If we are members we get a discount 8% on Grocery & 10% on provisons
	//req3:if we pay through card we get an additional discount of 5%

	public static void main(String[] args) {

		final int GST=18;
		final int DISCOUNT_OF_SHOES=12;
		final int DISOUNT_OF_GROCERIES_FOR_MEMBER=8;
		final int DISOUNT_OF_GROCERIES=10;
		final int CARD_DISCOUNT=5;
		double priceOfshoes=Double.parseDouble(args[0]);
		double priceOfGroceries=Double.parseDouble(args[1]);
		double priceOfProvisons=Double.parseDouble(args[2]);
		boolean isMember=Boolean.parseBoolean(args[3]);
		boolean isCard=Boolean.parseBoolean(args[4]);

		//req1
		priceOfshoes=priceOfshoes+(GST*priceOfshoes)/100-(DISCOUNT_OF_SHOES*priceOfshoes)/100;

		//req2
		if (isMember) {
			priceOfGroceries= priceOfGroceries-(DISOUNT_OF_GROCERIES_FOR_MEMBER*priceOfGroceries)/100;
			priceOfProvisons= priceOfProvisons -(DISOUNT_OF_GROCERIES*priceOfProvisons)/100;
		}
		double totalPrice = priceOfshoes+priceOfGroceries+priceOfProvisons;
		
       //req3
		if (isCard) {
			totalPrice=totalPrice-(totalPrice*CARD_DISCOUNT)/100;
		}
		System.out.println("totalPrice :"+totalPrice);
	}
}
