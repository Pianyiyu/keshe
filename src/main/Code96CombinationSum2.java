package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Code96CombinationSum2 {


    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
//        HashSet<List<Integer>> set=new HashSet<>();
        Arrays.sort(candidates);
        combine(candidates,target,0,list,lists);
//        for (List<Integer> list1:set){
//            lists.add(list1);
//        }
        return lists;
    }
    public static void combine(int[] candidates,int target,int index,List<Integer> temp,List<List<Integer>> set){
        if (target<0)
            return;
        if(target==0){
            set.add(new ArrayList<>(temp));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            if(candidates[i]>target)
                break;
            temp.add(candidates[i]);
            combine(candidates,target-candidates[i],i+1,temp,set);
            temp.remove(temp.size()-1);
        }
    }


}
