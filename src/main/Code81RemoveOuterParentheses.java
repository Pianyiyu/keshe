package main;

public class Code81RemoveOuterParentheses {


    public String removeOuterParentheses(String S) {
        char[] chars=S.toCharArray();
        int index=0;
        for (int i = 1; i <= chars.length-2; ) {
            if (chars[i]=='('&&chars[i+1]==')'){
                index++;
                i+=1;
            }else {
                if (index!=0){
                    chars[i]='0';
                    chars[i-2*index]='0';
                    index =0;
                }
                i+=1;
            }
        }

        StringBuffer s=new StringBuffer("");
        for (int i = 0; i < chars.length; i++) {
            if (chars[i]!='0')
                s.append(chars[i]);
        }
        return s.toString();



//        var chars = Array(S)
//        var count = 0
//        var previousCount = 0
//        var resultArray = [Character]()
//
//        for i in 0..<chars.count {
//            previousCount = count
//            if chars[i] == "(" {
//                count += 1
//            } else if chars[i] == ")" {
//                count -= 1
//            }
//            if count != 0 && previousCount != 0 {
//                resultArray.append(chars[i])
//            }
//        }
//        let result = String(resultArray)
//        return result
    }
}
