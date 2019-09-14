package main;

import java.util.Stack;

public class Code47stackqueue {

    public static void main(String[] args) {

        int[] arr={1,2,3,4,5};
        TwoStackToQueue(arr);
    }

    //两个栈实现队列
    public static void TwoStackToQueue(int[] arr) {
        Stack<Integer> stack1 = new Stack<Integer>();
        Stack<Integer> stack2 = new Stack<Integer>();
     // 入队
        for (int i = arr.length - 1; i >=0; i--) {
            stack1.push(arr[i]);
        }
        //出队
        if (stack2.isEmpty()){
            //将stack1倒入stack2
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        while (!stack2.isEmpty()){
            System.out.println(stack2.pop());
        }
    }
}
