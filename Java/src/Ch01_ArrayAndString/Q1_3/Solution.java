package Ch01_ArrayAndString.Q1_3;

public class Solution {
    public static char[] URLify(char[] s, int trueLength){ //s =[a, , b, , , , , ,c , d,       ], 6
        //count space in s
        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) { //trueLength
            if (s[i] == ' ') {
                spaceCount++;
            }
        }

        int newLength = trueLength + spaceCount * 2;
        int i = trueLength - 1;
        int j = newLength - 1;

        while(i >= 0 && i < j){ //stops when all space are replaced. newLength - position of the first space
            if(s[i] == ' '){
                s[j] = '0';
                s[j - 1] = '2';
                s[j - 2] = '%';
                j -= 3;
                i--;
            }else{
                char temp = s[i];
                s[i] = s[j];
                s[j] = temp;
                i--;
                j--;

            }
        }

        return s;
    }

    public static void main(String[] args) {
        String[] inputString = {"oh my god", "kai xin  ", "     "};
        for (String input : inputString) {
            char[] s = input.toCharArray();
            //expand s
            char[] s_ = new char[s.length * 4];
            System.arraycopy(s, 0, s_, 0, s.length);
            URLify(s_, s.length);
            System.out.println(s_);
        }

    }
}
