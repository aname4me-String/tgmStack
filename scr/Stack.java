public class Stack <D>{
    private final D[] stack;
    private int count = 0;

    public Stack() {
        stack = (D[]) new Object[10];
    }

    public Stack(int length) {
        stack = (D[]) new Object[length];
    }

    public void push(D data) throws StackFullException {
        if(count == stack.length) {
            throw new StackFullException("");
        }
        stack[count++] = data;
    }

    public D pop() throws StackEmptyException {
        if(count == 0) {
            throw new StackEmptyException("");
        }
        return stack[--count];
    }

    public D peek() throws StackEmptyException {
        if(count == 0) {
            throw new StackEmptyException("");
        }
        return stack[count - 1];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (D i : stack) {
            sb.append(i.toString()).append(";\n");
        }
        return sb.toString();
    }
}
