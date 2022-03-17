package ch.juventus.logging;

//1.) Klasse "Bank" erstellt, die für alle sichtbar ist > public
//2.) Variable mit Name "balance" erstellt und auf 0 gesetzt (Startwert)
public class Bank {
    private double balance = 0;
  // Methode erstellt zur Addition von beliebigem Betrag
    public void deposit(double amount){
      balance=balance+amount;
    }
}
