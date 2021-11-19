import java.time.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        //Q11
        //Ans: A . 10 8 6 4 2 0
        /*int row = 10;
        for (; row > 0; ) {
            int col = row;
            while (col >= 0) {
                System.out.print(col + " ");
                col -= 2;
            }
            row = row / col;
        }*/

        //Q42
        //Ans: java jeve va
        //extends from super class and the subclass can be used in ArrayList<>
        //1. substring(int x) means start from this index, with this one
        //2. substring(int start, int end) means form start to end, left close, right open
        //3. String, concat means add that to the edn
        /*String s = "01234567";
        System.out.println(s.substring(2));
        System.out.println(s.substring(2, 6));
        System.out.println(s.concat("3"));*/
        /*class MyString {
            public String doStuff(String msg) {
                return msg;
            }
        }

        class MyStringSub extends MyString{
            public String doStuff(String msg) {
                return msg.replace('a', 'e');
            }
        }

        class MystringSubSub extends MyStringSub{
            public String doStuff(String msg) {
                return msg.substring(2);
            }
        }

        List<MyString> str = new ArrayList<MyString>();
        str.add(new MyString());
        str.add(new MyStringSub());
        str.add(new MystringSubSub());
        for (MyString s : str) {
            System.out.println(s.doStuff("java"));
        }*/

        //Q43
        //Ans: A. Runnable run = () -> {System.out.println("Run"))};
        /*Runnable run = new Runnable() {
            @Override
            public void run() {

            }
        };*/
        //Runnable run = () -> {System.out.println("Run");};

        //Q50
        //Ans: A Good Day! Good Luck!
        // 1. char number is char, int 'number' is its ASCII code
        // 2. char and number can be reversed!!!!
        /*char x = 8;
        int y = '8';
        doStuff(x);
        doStuff(y);*/

        //Q59
        //Ans: A. Ym Xm2
        /*class X {
            public void mX() {
                System.out.println("Xm1");
            }
        }

        class Y extends X {
            public void mX() {
                System.out.println("In Y !!!!!!! Xm2");
            }
            public void mY() {
                System.out.println("In Y !!!!!!! Ym");
            }


        }

        X xref = new Y();
        Y yref = (Y)xref;
        yref.mY();
        xref.mX();*/

        //Q60
        //Ans: for(;;) is also correct syntax!!!!!!!!!!

        //Q62
        //Ans: C A StringIndexOutOfBoundsException is thrown at Runtime.
        // index start from 0, and count carefully!!!! endIndex is length - 1!!!!
        /*String s = "Hello World";
        System.out.println(s.charAt(11));*/

        //Q65
        //Ans: A Super Sub Sub
        /*class Super implements Contract {}
        class Sub extends Super {}

        Contract c1 = new Super();
        Contract c2 = new Sub();
        Super s1 = new Sub();

        List objs = new ArrayList();
        objs.add(c1);
        objs.add(c2);
        objs.add(s1);

        for (Object item : objs) {
            System.out.println(item.getClass().getName());
        }*/

        //Q71
        //Ans: A. just simple read code....
        /*LocalDate date = LocalDate.of(2015, 3, 26);
        Period p = Period.ofDays(1);
        System.out.println(date.plus(p));*/

        //Q72
        //Ans: E compilation fail
        // 1. break, continue only in loop or switch!!!!!!!!!!!!
        /*int[] arr = {1, 2, 3, 4};
        for (int i : arr) {
            if (i % 2 == 0) {
                continue;
            } else {
                System.out.println(i);
            }
        }*/

        //Q73
        //Ans: D. The default constructor of a subclass always invokes the no-argument constructor of its uperclass

        //Q81
        //Ans: C.System.out.println(LocalTime.now());  many can be used : localdatetime, zoneddatetime localtime....
        //System.out.println(LocalTime.now());

        //Q85
        //Ans: B. log3 true log4 true. && || always priorize than =
        /*boolean a = (4 != 5) && (6.0 != 7.0);
        boolean b = (7 != 7) || (7.0 == 7.0);*/
        //System.out.println(a + " " + b );

        //Q87
        //Ans: E. The program prints nothing;
        // see class Series;

        //Q116
        //Ans: C.squarcire...., just simply execute...
        /*if (true) {
            System.out.print("s");
        } {
            System.out.print("c");
        } {
            System.out.print("....");
        }*/

        //Q119
        //Ans: C. int[][] arr = new int[2][]
        //     E. int[][] arr = new int[2][0]
        // can not use null as this will create nullpointerexception!!!!!
        //int[][] arr = null;
        /*int[][] arr = new int[2][];
        //int[][] arr = new int[2][0];

        arr[0] = new int[3];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[1] = new int[4];
        arr[1][0] = 10;
        arr[1][1] = 20;
        arr[1][2] = 30;
        arr[1][3] = 40;*/

        //Q120
        //Ans: B. unsuccessful str3 = nulljava, here no concate, just add in. string + c =string
        // String s = null means s is n u l l this four letter, exactly same like other character, no special meanings.
        /*String str1 = "java";
        char[] str2 = {'j', 'a', 'v', 'a'};
        String str3 = null;
        for (char c : str2) {
            str3 = str3 + c;
        }
        if (str3.equals(str1)) {
            System.out.println("Successful");
        } else {
            System.out.println("unsuccessful");
        }*/

        //Q134
        //Ans: E.Compilation faile!!!!!!!!!, this sum hasn't be initilizd, so in do block, it is not regnized!!!
        /*int num = 5;
        int sum;
        do {
            sum += num;
        } while ((num--) > 1);*/

        //Q136
        //Ans: false : true. mostly == can't be same unless str1 = str2
        /*String str1 = "java";
        String[] str2 = {"j", "a", "v", "a"};
        String str3 = "";
        for (String s : str2) {
            str3 += s;
        }
        System.out.print(str3 == str1);
        System.out.print(" : " + str3.equals(str1));*/

        //Q140.
        //D. A NumberFormatException will be thrown. int String, that's it!!!! All String ok, but 808.1 is not Integer/int
        //Integer a = Integer.valueOf("808.1");

        //Q233
        //Ans: C. compilation error at line (sb.concat(xxx))
        // 1. there is no method called concat in StringBuilder, this method is in String class
        // 2. here we should use append, and printout result is 1z0-808
        /*StringBuilder sb = new StringBuilder("1z0");
        //sb.concat(-808);
        sb.append("-808");
        System.out.println(sb);*/


    }

    //Q114


    //Q50
    public static void doStuff(char x) {
        System.out.println("Good day!");
    }

    public static void doStuff(int y) {
        System.out.println("Good Luck!");
    }
}
