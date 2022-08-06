import java.util.*;
class Solution {
    public static int romanToInt(String s) {
            List<String> mL = new ArrayList<String>(Arrays.asList(s.split("")));

            int total = 0;


            for(int i = mL.size()-1; i >= 0; i--) {
                if(mL.get(i).equals("I")) {    //1
                    total+=1;
                }

                else if(mL.get(i).equals("V")) {  //5
                    if(i > 0 && mL.get(i-1).equals("I")) {
                        total+=4;
                        i-=1;
                    } else total+=5;
                } else if(mL.get(i).equals("X")) { //10
                    if(i > 0 && mL.get(i-1).equals("I")) {
                        total+=9;
                        i-=1;
                    } else total+=10;
                } else if(mL.get(i).equals("L")) { //50
                    if(i > 0 && mL.get(i-1).equals("X")) {
                        total+=40;
                        i-=1;
                    } else total+=50;
                } else if(mL.get(i).equals("C")) { //100
                    if(i > 0 && mL.get(i-1).equals("X")) {
                        total+=90;
                        i-=1;
                    } else total+=100;
                } else if(mL.get(i).equals("D")) { //500
                    if(i > 0 && mL.get(i-1).equals("C")) {
                        total+=400;
                        i-=1;
                    } else total+=500;
                } else if(mL.get(i).equals("M")) { //1000
                    if(i > 0 && mL.get(i-1).equals("C")) {
                        total+=900;
                        i-=1;
                    } else total+=1000;
                }
            }

            return total;

        }
}