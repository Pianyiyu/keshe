package main;

import java.util.*;

public class Code95TopKFrequent {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else map.put(nums[i],map.get(nums[i])+1);
        }
        //小顶堆
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return map.get(o1)-map.get(o2);
            }
        });
        for (int key:map.keySet()){
            if (priorityQueue.size()<k){
                priorityQueue.add(key);
            }else if (map.get(key)>map.get(priorityQueue.peek())){
                priorityQueue.poll();
                priorityQueue.add(key);
            }
        }

        LinkedList<Integer> linkedList = new LinkedList<>();
        while(!priorityQueue.isEmpty()) {
            linkedList.addFirst(priorityQueue.poll());
        }
        return linkedList;
    }
}
