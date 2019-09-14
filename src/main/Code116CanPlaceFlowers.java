package main;

public class Code116CanPlaceFlowers {
    public static void main(String[] args) {

        int[] a = {1, 0, 0, 0, 1};
        System.out.println(canPlaceFlowers(a, 1));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (flowerbed.length<0) return false;
        if (flowerbed.length==1){
            if ((n==1&&flowerbed[0]==0)||(n==0&&flowerbed[0]==1)||n==0&&flowerbed[0]==0){
                return true;
            }else return false;
        }
        if (flowerbed[0]==0)if (flowerbed[1]==0){n--;flowerbed[0]=1;}
        for (int i = 1; i < flowerbed.length-2; i++) {
            if (flowerbed[i]==0){
                int pre=i-1;
                int next=i+1;
                if (flowerbed[pre]==0&&flowerbed[next]==0){
                    n--;
                    flowerbed[i]=1;
                }
            }
        }
        if (flowerbed[flowerbed.length-1]==0&&flowerbed[flowerbed.length-2]==0){
            n--;
        }
        if (n<=0){
            return true;
        }else return false;
    }
}
