import java.util.*;

public class TestComputingDiscount{

public static void main(String [] args){

int price;

Scanner input = new Scanner(System.in);

System.out.print("Enter value for price: ");
price = input.nextInt();

ComputingDiscount c = new ComputingDiscount(price);
c.displayDiscount(); 

}

}