public class Main {
    public static void main(String[] args) {

        Child child = new Child();
        System.out.println(child.getX());
        Child child2 = new Child(102);
        System.out.println(child2.getX());
        Child child3 = new Child(110);
        System.out.println(child3.getX());

    }
}
