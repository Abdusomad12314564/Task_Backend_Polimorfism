public class Main {
    public static void main(String[] args) {
        Backend java = new Java();
        Backend python = new Python();
        Backend sharp = new Sharp();

        Backend [] backends = {java, python, sharp};
        for (Backend arr:backends) {
            System.out.println(arr);
        }
        System.out.println(java.getClass());
        System.out.println(python.getClass());
        System.out.println(sharp.getClass());
    }
}