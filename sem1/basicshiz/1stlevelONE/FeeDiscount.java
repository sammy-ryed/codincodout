import java.util.*;
class FeeDiscount{
	public static void main(String[] args){
		double fee, newFee;
		int discountPercentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your tution fees:\n");
		fee=(double)sc.nextDouble();
		System.out.println("Enter the applicable discount percentage:\n");
		discountPercentage= sc.nextInt();
		newFee=(double)(fee-(fee*discountPercentage/100));
		System.out.println("The discount amount is INR "+fee*discountPercentage/100+" and final discount fee is INR "+newFee);
		sc.close();
}}