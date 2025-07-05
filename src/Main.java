//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int numToExamine = 7;  //
        int modResult = numToExamine % 2;

        System.out.println("The result of numToExamine % 2 is: " + modResult);

        if (modResult == 0) {
            System.out.println(numToExamine + " is even.");
        } else {
            System.out.println(numToExamine + " is odd.");
        }
    }
}
