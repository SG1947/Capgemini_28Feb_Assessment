package Week2.encap;

public class Haccount {
   private double bal=6000;
   private short pin =6598;
   public double getBal(short pin) {
	   if(this.pin==pin) return this.bal;
	   return -1;
   }
   public void setBalCredit(double amt) {
	   this.bal+=amt;
   }
   public void setBalDebit(double amt) {
	   this.bal-=amt;
   }
}
