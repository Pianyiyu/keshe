package main;

public class Code80ConvertToBase7 {
    public String convertToBase7(int num) {

        if (num==0)return "0";
        StringBuilder re=new StringBuilder("");
        int temp=num;
        if (temp>0){
            while (temp!=0){
                re.append(""+temp%7);
                temp=temp/7;
            }
        }else if (temp<0){
            while (temp!=0){
                re.append(""+Math.abs(temp)%7);
                temp=(int) Math.ceil(temp/7);
            }
            re.append("-");
        }
        re.reverse();
        return String.valueOf(re);
    }
}
