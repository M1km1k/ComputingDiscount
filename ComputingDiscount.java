import javax.swing.*;

public class ComputingDiscount{

private int price;
private double discount;
private double discountrate = .10;

public ComputingDiscount(int price){

this.price = price;

}

public int getprice(){

return this.price;

}

public void displayDiscount(){

if(getprice() > 1000){

discount = getprice() * discountrate;

System.out.printf("Discount is          : %.2f",discount);

}

else {

System.out.print("Discount is          : No discount");

}

}


}