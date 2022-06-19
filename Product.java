//NAMA : INDA FITRIA MAHARISTY
//NIM  : 203010503017
package Inventory;

public class Product {
	//Instance field declarations
	 private int Stock;
	 private String NumberID, Name, StatusString;
	 private double Price;
	 private boolean Status;
	 
	//Konstruktor default ini menginisialisasi variabel kelas numerik ke nol dan variabel objek (Seperti String) ke null.
	 public Product() {
	  
	 }
	 
	 public Product (String IdInput, String NameInput, int StockInput, double PriceInput, boolean StatusInput) {
	 this.NumberID = IdInput;
	 this.Name = NameInput;
	 this.Stock = StockInput;
	 this.Price = PriceInput;
	 this.Status = StatusInput;
	 }
	 
	 //Setter untuk mengubah nilai dari setiap variabel kelas.
	 //Getter untuk mengembalikan nilai dari setiap variabel kelas.
	  
	 //Method getter dan setter untuk attribute atau fields NumberID.
	 //Getter (getter berfungsi untuk mendapatkan sebuah value atau nilai pada atribut setter).
	 public String getNumberID() {
	  return NumberID;
	 }
	 
	//Setter (setter berfungsi untuk meng-set atau mengatur nilai yang terdapat pada sebuah atribut).
	 public void setNumberID(String NumberID) {
	  this.NumberID = NumberID;
	 }
	 
	 //Method getter dan setter untuk attribute atau fields Stock.
     //Getter (getter berfungsi untuk mendapatkan sebuah value atau nilai pada atribut setter).
	 public int getStock() {
	  return Stock;
	 }
	 
	//Setter (setter berfungsi untuk meng-set atau mengatur nilai yang terdapat pada sebuah atribut).
	 public void setStock(int Stock) {
	  this.Stock = Stock;
	 }
	 
	 //Method getter dan setter untuk attribute atau fields Name.
     //Getter (getter berfungsi untuk mendapatkan sebuah value atau nilai pada atribut setter).
	 public String getName() {
	  return Name;
	 }
	 
	 //Setter (setter berfungsi untuk meng-set atau mengatur nilai yang terdapat pada sebuah atribut).
	 public void setName(String Name) {
	  this.Name = Name;
	 }
	 
	 //Method getter dan setter untuk attribute atau fields Price.
     //Getter (getter berfungsi untuk mendapatkan sebuah value atau nilai pada atribut setter).
	 public double getPrice() {
	  return Price;
	 }
	 
	 //Setter (setter berfungsi untuk meng-set atau mengatur nilai yang terdapat pada sebuah atribut).
	 public void setPrice(double Price) {
	  this.Price = Price;
	 }
	 
	 //Method getter dan setter untuk attribute atau fields Status.
     //Getter (getter berfungsi untuk mendapatkan sebuah value atau nilai pada atribut setter).
	 public boolean isStatus() {
	  return Status;
	 }
	 
	 //Setter (setter berfungsi untuk meng-set atau mengatur nilai yang terdapat pada sebuah atribut).
	 public void setStatus(boolean Status) {
	  this.Status = Status;
	 }
	 
	 
	 public String toString() {
	  String s1;
	  StatusString = (this.Status == true)? "Active" : "Discontinued";
	  s1 = "Item Number                     : " + this.NumberID + "\n" +
	       "Name                            : " + this.Name + "\n" +
	       "Quantity in Stock               : " + this.Stock + "\n" +
	       "Price                           : " + this.Price + "\n" +
	       "Stock Value                     : " + getInventoryValue() + "\n" +
	       "Product Status                  : " + this.StatusString + "\n";
	  return s1;
	 }
	 
	 //Metode getInventoryValue()
	 double getInventoryValue() {
	 //Variabel baru untuk menghitung nilai persediaan (Quantity in Stock)
	 double Value = this.Stock*this.Price;
	 return Value;
	 }
}


