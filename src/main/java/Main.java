import java.util.Scanner;
public class Main {
static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    BankAccount Bob = new BankAccount("Bob",1000);
    BankAccount Lisa = new BankAccount("Lisa",1000);
    Bob.transfer(Lisa,1600);
}
}