package main;

    //在《英雄联盟》的世界中，有一个叫 “提莫” 的英雄，他的攻击可以让敌方英雄艾希（编者注：寒冰射手）进入中毒状态。现在，给出提莫对艾希的攻击时间序列和提莫攻击的中毒持续时间，你需要输出艾希的中毒状态总时长。
    //
    //        你可以认为提莫在给定的时间点进行攻击，并立即使艾希处于中毒状态。
    //
    //        示例1:
    //
    //        输入: [1,4], 2
    //        输出: 4
    //        原因: 在第 1 秒开始时，提莫开始对艾希进行攻击并使其立即中毒。中毒状态会维持 2 秒钟，直到第 2 秒钟结束。
    //        在第 4 秒开始时，提莫再次攻击艾希，使得艾希获得另外 2 秒的中毒时间。
    //        所以最终输出 4 秒。
    //        示例2:
    //
    //        输入: [1,2], 2
    //        输出: 3
    //        原因: 在第 1 秒开始时，提莫开始对艾希进行攻击并使其立即中毒。中毒状态会维持 2 秒钟，直到第 2 秒钟结束。
    //        但是在第 2 秒开始时，提莫再次攻击了已经处于中毒状态的艾希。
    //        由于中毒状态不可叠加，提莫在第 2 秒开始时的这次攻击会在第 3 秒钟结束。
    //        所以最终输出 3。
public class Code115FindPoisonedDuration {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(duration==0||timeSeries.length==0){return 0;}
        int res = 0;
        int max = timeSeries[0] + duration - 1;
        for(int i=1;i<timeSeries.length;i++){
            if(timeSeries[i]<=max){
                res += timeSeries[i] - timeSeries[i-1];
            }else {
                res += duration;
            }
            max = timeSeries[i] + duration - 1;
        }
        res += duration;
        return res;
    }
}
