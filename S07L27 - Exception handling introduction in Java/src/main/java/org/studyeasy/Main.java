package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.case2(10,1);

    }
    public void case1(int x, int y){
        if (y != 0){
            System.out.println("x/y="+x/y);
        }else{
            System.out.println("The value of y is 0, a possible exception");
        }
    }
    public void case2(int x, int y){
        try{
            System.out.println("x/y="+x/y);
        }catch (Exception e){
            System.out.println("The value of y is 0, a possible exception"+e);
        }
    }
}
