//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
import java.lang.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Max Min program!");

        System.out.println("Integer Max");
        System.out.println("Maximum of 3, 4, 5: " + MaxMin.findMax(3, 4, 5)); // tc 1.1
        System.out.println("Maximum of 5, 4, 3: " + MaxMin.findMax(5, 4, 3)); // tc 1.2
        System.out.println("Maximum of 4, 5, 3: " + MaxMin.findMax(4, 5, 3)); // tc 1.3
    }
}