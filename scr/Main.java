public class Main {
    public static void main(String[] args) {
        Stack<Integer> intstack = new Stack<>(5);
        try {
            intstack.push(1);
            intstack.push(2);
            intstack.push(3);
            intstack.push(4);
            intstack.push(5);

            System.out.println(intstack);

            intstack.push(6);
        } catch (StackFullException e) {
            System.out.println("Stack is full");
        }
        Stack<String> stringstack = new Stack<>();
        try {
            stringstack.pop();
        } catch (StackEmptyException e) {
            System.out.println("Stack is empty");
        }
        try {
            stringstack.push("Hello");
            stringstack.push("World");
            stringstack.push("Im here");
            stringstack.push("to say");
            stringstack.push("Hello");
        } catch (StackFullException e) {
            System.out.println("Stack is full");
        }
        System.out.println(stringstack.toString());
    }
}