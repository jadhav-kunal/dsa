class MinStack {

    Stack<Integer> mainStack, minStack;
    
    public MinStack() {
        this.mainStack = new Stack<>();
        this.minStack = new Stack<>();
    }
    
    public void push(int val) {
        mainStack.push(val);
        if(minStack.isEmpty() || minStack.peek()>=val){
            minStack.push(val);
        }   
    }
    
    public void pop() {
        if(this.top()==this.getMin()){
            minStack.pop();
        }
        mainStack.pop();
    }
    
    public int top() {
        return this.mainStack.peek();
    }
    
    public int getMin() {
        return this.minStack.peek();
    }
}