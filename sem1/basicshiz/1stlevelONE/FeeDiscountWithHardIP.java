class FeeDiscountWithHardIP{
	public static void main(String[] args){
		double fee, newFee;
		int discountPercentage;
		fee= 125000.0;
		discountPercentage=10;
		newFee=(double)(fee-((fee*discountPercentage)/100));
		System.out.println("The discount amount is INR "+fee*discountPercentage/100+" and final discount fee is INR "+newFee);
}}