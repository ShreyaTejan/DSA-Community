import java.util.*;

public class trapRainwater {
    public static int trappedRW(int height[]){
        // calc left and r max boundaries-- arrays ki form mein hongi
        // loop --> LVL = L-R
        //TW = LVL - H

        int leftMax[]= new int[height.length];
        leftMax[0]= height[0];
        for(int i = 1; i<height.length; i++ ){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }

        int rightMax[]= new int[height.length];
        rightMax[height.length-1]=height[height.length-1];
        for(int i = height.length - 2 ; i>= 0; i-- ){
            rightMax[i]= Math.max(height[i], rightMax[i+1]);

        }


        int trapped= 0;
        // har baar waterlevelcalc krna
        for(int i =0; i < height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapped= trapped+ waterLevel - height[i];

        }
         return trapped;


    }

    public static void main(String[] args) {
        int height[]={21,33,45,12,30};
        System.out.println(trappedRW(height));
    }
}
