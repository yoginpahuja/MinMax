

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
    }
}