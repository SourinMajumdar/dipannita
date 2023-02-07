public public class Main {
    public static void main(String[] args) {
        StringBuffer buffer1 = new StringBuffer();
        StringBuffer buffer2 = new StringBuffer(10);
        StringBuffer buffer3 = new StringBuffer("Java");

        System.out.println("Buffer 1: ");
        System.out.println("Content: " + buffer1);
        System.out.println("Length: " + buffer1.length());
        System.out.println("Capacity: " + buffer1.capacity());
        System.out.println();

        System.out.println("Buffer 2: ");
        System.out.println("Content: " + buffer2);
        System.out.println("Length: " + buffer2.length());
        System.out.println("Capacity: " + buffer2.capacity());
        System.out.println();

        System.out.println("Buffer 3: ");
        System.out.println("Content: " + buffer3);
        System.out.println("Length: " + buffer3.length());
        System.out.println("Capacity: " + buffer3.capacity());
        System.out.println();
    }
}