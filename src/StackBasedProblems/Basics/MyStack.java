package StackBasedProblems.Basics;

import java.util.Arrays;

public class MyStack {

     int []arr;
    int size;
    int idx;

    public MyStack() {
        this.arr = new int[100];
    }

    public MyStack(int size, int idx) {
        this.size = 0;
        this.idx = -1;
    }

    public void push(int element) throws Exception{
        if(idx<arr.length){
            arr[++idx]=element;
            size++;
        }
        else  throw new Exception("Stack Over flow...");
    }

    public void pop() throws Exception {
        if(size>0){
            arr[--idx]=0;
            size--;
        }
        else throw new Exception("Stack Under flow...");
    }

    public int peek() throws Exception {
        if(size>0) return arr[idx-1];

        throw new Exception("Stack is already empty");
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public void display(){
        System.out.println(Arrays.toString(arr));
    }

    /*
    stack ops: add, push, pop,delete, peek, isEmpty, isFull, size
    * */

    public static void main(String[] args) throws Exception {
        MyStack myStack=new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.display();
    }
}
