import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;
//import java.util.LinkedList;
public class test {
    public static void main(String[] args) {

//

//        System.out.println(arrayStringsAreEqual(new String[]{"ab", "c"}, new String[]{"a", "bc"}));

        int []a = {1,2,3,4,5,5};
        int []b = new int[]{1,2,3,4,5};
//        int []c = new int[10];
//        c = {1,2,3,4,5,6,7,8,9,2};

        int[] d = new int[10];
        d = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 2};

//        int []a1 = new int[]{1,2,3,4,5};
        int []a2 = new int[]{1,2,3,4,5};

        System.out.println(backspaceCompare("aaa###a","aaaa###a"));


    }

    public static boolean backspaceCompare(String s, String t) {

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (int i=0; i < s.length() ; i++)
        {
            if (s.charAt(i)=='#')
            {
                try {
                    s1.pop();
                }catch (Exception e)
                {

                }

            }else {
                s1.push(s.charAt(i));
            }
        }
        for (int i=0; i < t.length() ; i++)
        {
            if (t.charAt(i)=='#')
            {
                try {
                    s2.pop();
                }catch (Exception e)
                {

                }
            }else {
                s2.push(t.charAt(i));
            }
        }

        StringBuilder s11 = new StringBuilder();
        StringBuilder s22 = new StringBuilder();

        while (!s1.isEmpty()){
            s11.append(s1.pop());
        }
        while (!s2.isEmpty()){
            s22.append(s2.pop());
        }


        if (s11.toString().equals(s22.toString()))
        {
            return true;
        }else {
            return false;
        }

    }

    public static String largestGoodInteger(String num) {

        int []arr = new int[10];

        for (int i = 0; i < num.length(); i++) {
            arr[Integer.valueOf(num.charAt(i))]++;
        }

        num.contains("111");
        StringBuilder s = new StringBuilder();

        return s.toString();

    }




    public static int minTimeToVisitAllPoints(int[][] points) {

        int []p1;
        int []p2;
        int x =0;
        int y =0;
        int extra =0;
        int count =0;

        for (int i = 0; i < points.length-1; i++) {  //{1,1},{3,4},{-1,0}
            p1 = points[i];
            p2 = points[i+1];

            x = Math.abs(p1[0] - p2[0]);//2
            y = Math.abs(p1[1] - p2[1]);//3

            extra = Math.abs(x-y); //1

            count += extra + Math.min(x,y);
        }



        return count;


    }
 
    public static int countCharacters(String[] words, String chars) {

        char[] alphabet = new char[26];

        int flag = 0;
        int count = 0;

        for (int i = 0; i < chars.length(); i++) {
            alphabet[chars.charAt(i)-'a'] ++;
        }

        for (int i = 0; i < words.length; i++) {

            flag = 0 ;
            char [] temp = new char[26];


            for (int j = 0; j < words[i].length(); j++) {
                temp[words[i].charAt(j)-'a'] ++;
            }
            //checking if both the arrays are same
            for (int j = 0; j < 26; j++) {

                if (temp[j] > alphabet[j])
                {
                    flag = 1 ;
                }

            }

            if (flag == 0)
            {
                count += words[i].length();
            }

        }

        return count;

    }

    public static void stringIsSubset(String string1 , String string2)
    {


    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();

        for (int i = 0 ; i < word1.length ; i++)
        {
            temp1.append(word1[i]);
        }

        for (int i = 0 ; i < word2.length ; i++)
        {
            temp2.append(word2[i]);
        }



        return temp1.toString().equals(temp2.toString());

    }

    public static int calPoints(String[] operations) {

        Stack<Integer> stack = new Stack<>();
        int temp1=0;
        int temp2=0;
        for (int i =0 ; i<operations.length ; i ++)
        {
            switch (operations[i])
            {
                case "D":
                    temp1 = stack.peek();
                    stack.push(temp1*2);
                    break;

                case "C":
                    stack.pop();
                    break;
                case "+":
                    temp1 = stack.pop();
                    temp2 = stack.peek();

                    stack.push(temp1);
                    stack.push(temp1+temp2);
                    break;

                default : stack.push(Integer.parseInt(operations[i]));
            }
        }

        temp1 = 0;
        for (int i =0 ; i < stack.size() ; i++)
        {
            temp1 += stack.elementAt(i);
        }

        return temp1;

    }

    public static void printArray(int [] arr)
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


    public static int[] finalPrices(int[] prices) {


        int []solution = new int[prices.length];
        int k =0;
        int flag =0;

        for (int i =0 ; i < prices.length ; i++)
        {

            flag = 0;

            for (int j = i+1 ; j < prices.length ; j++)
            {
                if (prices[j] < prices[i])
                {
                    solution[k] = prices[i]-prices[j];
                    k++;
                    flag=1;
                    break;
                }
            }

            if (flag == 0)
            {
                solution[k] = prices[i];
                k++;

            }
        }

        return solution;
    }

    public static String removeOuterParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i < s.length() ; i++)
        {
            if (s.charAt(i) == '(')
            {
                if (!stack.isEmpty())
                {
                    stringBuilder.append('(');
                }
                stack.push(s.charAt(i));

            }else{
                stack.pop();
                if (stack.isEmpty())
                {
                    continue;
                }
                stringBuilder.append(s.charAt(i));
            }
        }

        return stringBuilder.toString();

    }

    public static void reverseStack()
    {
        int temp = 0;

    }
}
