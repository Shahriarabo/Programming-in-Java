public class Fruit {
   private double fprice;
   private String fname;
   Fruit(double fprice, String fname){
       fprice = fPrice;
       fname = fName;
   }
   Fruit(Fruit fruit){
       System.out.println("\nAfter invoking the Copy Constructor:\n");
       fprice = fruit.fprice;
       fname = fruit.fname;
   }
   double showPrice(){
       return fprice;
   }
   String showName(){
       return fname;
   }
   public static void main(String[] args){
       Fruit fone  = new Fruit(399,"Ruby Roman Grapes");
       System.out.println("Name of the Frist Fruit : "+fone.showName());
       System.out.println("Price of the Frist Fruit : "+fone.showPrice());

       Fruit ftwo = new Fruit(fone);
       System.out.println("Name of the Second Fruit : "+ftwo.showName());
       System.out.println("Name of the Second Fruit : "+ftwo.showName());
   }
}