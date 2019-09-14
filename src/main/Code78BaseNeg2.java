package main;

public class Code78BaseNeg2 {
    public String baseNeg2(int N) {
        String re = "";
        if (N == 0) {
            re+="0";
            return re;
        }
        int temp = N;
        while (temp != 0) {
            if (Math.abs(temp) % 2 == 1) {
                re+="1";
            } else re+="0";
            temp = (int) Math.ceil(temp / -2.0);
        }
        String s = "";
        for (int i = re.length()-1; i >=0; i--) {
            s+=(String.valueOf(re.charAt(i)));
        }
        return s;
    }
}
