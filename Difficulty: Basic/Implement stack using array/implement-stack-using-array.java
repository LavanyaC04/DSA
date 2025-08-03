class MyStack {
    private int[] arr;
    private int top;

    public MyStack() {
        arr = new int[1000];
        top = -1;
    }

    public void push(int x) {
        if (top == arr.length - 1) {
            return;
        }
        arr[++top] = x;
    }

    public int pop() {
        if (top == -1) {
            return -1; 
        }
        return arr[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1; 
        }
        return arr[top];
    }
}
