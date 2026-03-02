package DSA.corejava;

//Q13_InventoryManagement.java

interface StockService {
 void updateStock(int qty) throws InvalidStockException;
}

abstract class InventoryItem implements StockService {
 private String itemId;
 private String itemName;
 private int stock;

 protected int getStock() {
     return stock;
 }

 protected void setStock(int s) {
     stock = s;
 }
}

class PerishableItem extends InventoryItem {
 public void updateStock(int qty) throws InvalidStockException {
     if (qty < 0)
         throw new InvalidStockException("Invalid stock update");
     setStock(qty);
 }

 public void updateStock(int qty, boolean expired)
         throws InvalidStockException {
     updateStock(qty);
 }
}

class NonPerishableItem extends InventoryItem {
 public void updateStock(int qty) throws InvalidStockException {
     if (qty < 0)
         throw new InvalidStockException("Invalid stock update");
     setStock(qty);
 }
}

class InvalidStockException extends Exception {
 public InvalidStockException(String msg) {
     super(msg);
 }
}

class StockUnderflowException extends RuntimeException {
 public StockUnderflowException(String msg) {
     super(msg);
 }
}

public class Q13_InventoryManagement {
 public static void main(String[] args) throws InvalidStockException {
     StockService item = new PerishableItem();
     item.updateStock(100);
 }
}

