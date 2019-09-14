package main;

import java.util.ArrayList;
import java.util.List;

public class Code77PrefixesDivBy5 {



    public List<Boolean> prefixesDivBy5(int[] A) {
        ArrayList<Boolean> arrayList=new ArrayList<>();
        int res=0;
        for (int i = 0; i < A.length; i++) {
            res=(res*2+A[i])%5;
            arrayList.add(res==0);
        }
        return arrayList;
    }
}
