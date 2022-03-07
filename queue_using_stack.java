class MyQueue {
    private Stack<Integer> stk;
    public MyQueue() {
        stk=new Stack<Integer>();
    }
    
    public void push(int x) {
        stk.push(x);
    }
    
    public int pop() {
        Stack<Integer> backup=new Stack<Integer>();
        int front=stk.firstElement();
        while(!stk.empty()){
            backup.push(stk.pop());
        }
        backup.pop();
        while(!backup.empty()){
            stk.push(backup.pop());
        }
        return front;
    }
    
    public int peek() {
        return stk.firstElement();
    }
    
    public boolean empty() {
        return stk.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */