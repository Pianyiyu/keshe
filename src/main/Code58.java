package main;

import java.util.Arrays;
import java.util.Stack;

//根据每日 气温 列表，请重新生成一个列表，对应位置的输入是你需要再等待多久温度才会升高的天数。如果之后都不会升高，请输入 0 来代替。
//
//        例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
//
//        提示：气温 列表长度的范围是 [1, 30000]。每个气温的值的都是 [30, 100] 范围内的整数。
public class Code58 {


    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack=new Stack<>();
        int length=T.length;
        int[] arr=new int[length];
        Arrays.fill(arr,0);
        for (int i = 0; i < length; i++) {
            while (!stack.isEmpty()&&T[stack.peek()]<T[i]){
                int t=stack.pop();
                arr[i]=i-t;
            }
           stack.push(i);
        }
        return arr;
    }
}
