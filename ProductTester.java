//NAMA : INDA FITRIA MAHARISTY
//NIM  : 203010503017
package Inventory;
import java.util.Scanner;
public class ProductTester {
	public static void main(String[]args) {
		  //Variabel lokal yang akan menyimpan nilai untuk setiap atribut dari kelas Produk.
		  String tempNumber, tempName;
		  int tempStock;
		  double tempPrice;
		  boolean tempStatus = true;
		  Scanner in = new Scanner(System.in);
		  
		  System.out.println("[===============SOFTWARE EDITING===============]");
		  System.out.print("Enter Item Number \t: ");
		  tempNumber = in.nextLine();
		  System.out.print("Enter Name \t\t: ");
		  tempName = in.nextLine();
		  System.out.print("Enter Quantity in Stock : ");
		  tempStock = in.nextInt();
		  System.out.print("Enter Price \t\t: ");
		  tempPrice = in.nextDouble();
		  System.out.print("Enter Product Status\t: ");
		  tempStatus = in.nextBoolean();
		  System.out.println();
		  
		  Product p1 = new Product(tempNumber, tempName, tempStock, tempPrice, tempStatus);
		  Product p2 = new Product();
		  Product p3 = new Product("0071", "Filmora", 19, 150000, true);
		  Product p4 = new Product("0072", "Adobe Premiere Pro", 35, 170000, false);
		  Product p5 = new Product("0073", "Adobe After Effects", 40, 180000, true); 
		  Product p6 = new Product("0074", "Sony Vegas Pro", 13, 155000,false);
		  Product p7 = new Product("00075", "Camtasia", 12, 140000,true); 
		  Product p8 = new Product("0076", "Corel Video Studio", 21, 130000,false); 
		  
		  System.out.println(p1);
		  System.out.println(p2);
		  System.out.println(p3);
		  System.out.println(p4);
		  System.out.println(p5);
		  System.out.println(p6);
		  System.out.println(p7);
		  System.out.println(p8);
		  
		  /*
		  boolean loop = true;
		  do {
		      System.out.print("Enter Item Number \t:");
		      tempNumber = in.nextLine();
		      System.out.print("Enter Name \t:");
		      tempName = in.nextLine();
		      System.out.print("Enter Quantity in Stock \t:");
		      tempStock = in.nextInt();
		      System.out.print("Enter Price \t\t:");
		      tempPrice = in.nextDouble();
		      System.out.print("Enter Product Status\t:");
		      tempStatus = in.nextBoolean();
		      System.out.println();
		      
		      Product p = new Product(tempNumber, tempName, tempStock, tempPrice, tempStatus);
		      System.out.println(p);
		      
		      System.out.println("Do you want to input another product? (Y/N)");
		      loop = (int.next().toUpperCase().charAt(0) == 'Y') ? true : false;
		      
		      //Tydying
		      in.nextLine(); //Clean scanner
		      System.out.println(); //Enter once
		  }
		  while (loop==true);
		  in.close();  
		  */
		  }
}



