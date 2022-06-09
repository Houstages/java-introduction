package Lesson11;

public class PasswordMain {
    public static void main(String[] args) {

        String[] Upper = {"Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "A", "S", "D", "F", "G", "H", "J", "K", "L", "Z", "X", "C", "V", "B", "N", "M"};
        String[] Lower = {"q", "w", "e", "r", "t", "y", "u", "i", "o", "p", "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"};
        String[] Nums = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        String UndScr = "_";
        String[] Pass = new String[8];

        int rSymb, rCase, passLeng = 8;

        for(int i = 0; i < Pass.length; i++){
            rCase = 1 + (int) (Math.random() * 4);
            switch (rCase){
                case 1: rSymb = (int) (Math.random() * Upper.length);
                    Pass[i] = Upper[rSymb];
                    break;
                case 2: rSymb = (int) (Math.random() * Lower.length);
                    Pass[i] = Lower[rSymb];
                    break;
                case 3: rSymb = (int) (Math.random() * Nums.length);
                    Pass[i] = Nums[rSymb];
                    break;
                case 4: Pass[i] = UndScr;
            }
        }

        System.out.print("Generated password: ");
        for(int i = 0; i < Pass.length; i++) {
            System.out.print(Pass[i]);
        }
    }
}
/*
for(int i = 0; i < Pass.length; i++){
        rCase = 1 + (int) (Math.random() * 4);
        if(rCase == 1){
        rSymb = (int) (Math.random() * Upper.length);
        Pass[i] = Upper[rSymb];
        } else if (rCase == 2) {
        rSymb = (int) (Math.random() * Lower.length);
        Pass[i] = Lower[rSymb];
        } else if (rCase == 3) {
        rSymb = (int) (Math.random() * Nums.length);
        Pass[i] = Nums[rSymb];
        }
        else Pass[i] = UndScr;
}
 */

