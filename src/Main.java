public class Main {
    public static void main(String[] args) {
        System.out.println("Max Min program!");

        System.out.println("Integer Max");
        System.out.println("Maximum of 3, 4, 5: " + MaxMin.findMax(3, 4, 5)); // tc 1.1
        System.out.println("Maximum of 5, 4, 3: " + MaxMin.findMax(5, 4, 3)); // tc 1.2
        System.out.println("Maximum of 4, 5, 3: " + MaxMin.findMax(4, 5, 3)); // tc 1.3

        System.out.println("Double Max");
        System.out.println("Maximum of 1.3, 2.4, 3.5: " + MaxMin.findMax(1.3, 2.4, 3.5)); // tc 2.1
        System.out.println("Maximum of 3.5, 1.3, 2.4: " + MaxMin.findMax(3.5, 1.3, 2.4)); // tc 2.2
        System.out.println("Maximum of 1.3, 3.5, 2.4: " + MaxMin.findMax(1.3, 3.5, 2.4)); // tc 2.3

        System.out.println("String Max");
        System.out.println("Maximum of Apple, Banana, Peach: " + MaxMin.findMax("Apple", "Banana", "Peach")); // tc 3.1
        System.out.println("Maximum of Peach, Apple, Banana: " + MaxMin.findMax("Peach","Apple", "Banana")); // tc 3.2
        System.out.println("Maximum of Apple, Peach, Banana: " + MaxMin.findMax("Apple", "Peach", "Banana")); // tc 3.3

        System.out.println(MaxMin.findMax(2, 3, 340, 5, 42)); //multiple parameters

        MaxMin.printMax(1.3, 3.4, 3.5, 4.5, 5.6); // printing using generic method
    }
}