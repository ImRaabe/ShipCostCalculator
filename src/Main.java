import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the cost of your item");
    float itemCost = in.nextFloat();
    float shippingCost;

    if(itemCost >= 100)
    {
        shippingCost = 0;
    }
    else
    {
        shippingCost = (float) (0.02 * itemCost);
    }
    float totalCost = itemCost + shippingCost;
    System.out.print("The calculated shipping cost for your item is: $" + shippingCost + " and the total cost is: $" + totalCost);
    }
}