import java.time.*;
import java.util.*;

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

        //Q141
        // implement an interface needs exactly use the same access modifier;

        //Q147
        //Ans: D. 0 0 0
        /*for (int i = 0; i < 3; i++) {
            int count = 0;
            for (int j = 3; j < 0; j--) {
                if (i == j) {
                    ++count;
                    break;
                }
            }
            System.out.println(count);
            continue;
        }*/

        //Q148
        //Ans: C. sb.delete(int start, int end), sb.length()
        //1. Stringbuilder only has delete with two int as parameter, and StringBuilder only has sb.length().
        /*StringBuilder sb = new StringBuilder();
        sb.delete(0, sb.length());*/

        //Q150
        //Ans: default.
        // From Java SE 8, we can use static and/or default methods in interfaces, but they should be
        //non abstract methods. SO in this case using default in blank is completely legal. Hence
        //option C is correct.

        //Q151
        //Ans: A. 1.01 1
        /*float f = 22.01f % 3.00f;
        int i = 22 % 3;
        System.out.println(f + " " + i);*/

        //Q154
        //Ans:D.
        // while (index < 5) {if (key == myarrary[index]) {isFound = true; break;} index++;}
        /*float myarray[] = {10.20f, 20.30f, 30.40f, 40.50f, 50.60f};
        int index = 0;
        boolean isFound = false;
        float key = 30.40f;
        while (index < 5) {
            if (key == myarray[index]) {
                isFound = true;
                break;
            }
            index++;
        }
        System.out.println(index);
        System.out.println(isFound);*/

        //Q159
        //Ans: D sc : class anotherSampleClass   asc : class anotherSampleClass
        // it is covered, so all the same to anotherSampleClass
        /*AnotherTest at = new AnotherTest();
        Test t = new Test();
        t = at;
        System.out.println(t.getClass());
        System.out.println(at.getClass());*/

        //Q160
        //Ans: B. ++a, b--
        /*int a = -10;
        int b = 17;
        int c = ++a;
        int d = b--;
        c++;
        d--;
        System.out.println(c + " " + d);*/

        //Q163
        //Ans: C. An Exception is thrown at runtime.
        // if array is null, then standard loop and enhanced loop will all be nullpointerexception.
        // primitive and wrap up class same. if new keyword is used, then will be only 0000 or nothing.
        /*int[] xx = null;
        for (int i : xx) {
            System.out.println(i);
        }*/
        /*for (int i = 0; i < xx.length; i++) {
            System.out.println(xx[i]);
        }*/

        /*List<Integer> a = null;
        for (Integer s : a) {

            System.out.println(s);
        }*/

        //Q166
        //Ans: C. false true;
        /*Test t = new Test();
        System.out.println(isAva);
        isAva = doStuff();
        System.out.println(isAva);*/

        //Q169
        //Ans: C. true true
        // calculation operator higher than comparsion!!!!!
        //System.out.println(28 + 5 <= 4 + 29);
        //System.out.println((28 + 5) <= (4 + 29));

        //Q170
        //Ans: B. 9
        // 1. String.trim() method, leading and tailing spaces is omitted!!!! head, end, no in between.
        // 2. no change of the original s. just return the changed copy.
        /*String s = " java Duke ";
        System.out.println(s.trim().length());
        System.out.println(s.length());*/

        //Q172
        //Ans: only I and III
        // I: defualt constructor is empty, so ONLY!!!! contains super(); call
        // II: ANY modifier can be used for constructor, private, public, default, protected, all ok!
        // III: NO return tyep for constructor, otherwise if constructor called and return somthing, will be troble
        // for creating new object.
        // Which statement is/are true?
        //I. Default constructor only contains "super();" call.
        //II. We can't use any access modifier with a constructor.
        //III. A constructor should not have a return type.
        //A. Only I.
        //B. Only II.
        //C. Only I and II.
        //D. Only I and III.
        //E. ALL

        //Q186
        /*int[] arr = {10, 20, 30};
        doChange(arr);
        for (int x : arr) {
            System.out.println(x + " , ");
        }
        doChange(arr);
        System.out.println(Arrays.toString(arr));*/

        //Q191
        //Ans: Compilation Fails!!!!
        // ANY variable created inside the for loop are LOCAL VARIABLE TO THE LOOP!!!!!!!!!!


        //Q192
        //Ans: A hEllO jAvA!
        /*StringBuilder sb = new StringBuilder("hello java! ");
        int pos = 0;
        try {
            for (pos = 0; pos < 12; pos++) {
                switch (sb.charAt(pos)) {
                    case 'a':
                    case 'e':
                    case 'o':
                        String uc = Character.toString(sb.charAt(pos)).toUpperCase();
                        sb.replace(pos, pos + 1, uc);
                    }
                }
            } catch (Exception e) {
                System.out.println("Out of limit");
            }
        System.out.println(sb);*/

        //Q193
        //Which two statements are true for a two-dimensional array of primitive data type?
        //C. At the declaration time, the number of elements of the array in each dimension must be specified.
        //D. All methods of the class object may be invoked on the two-dimensional array.

        //Q194
        //Ans: print 1 2 3 4 5 six times!!!!!

        //Q210
        //public static void main(String[] args) ====== static public void main(String[] args)

        //Q221
        //Ans: B.NegativeArraySizeException

        //Q227
        /*int ar1[] = {2, 4, 6, 8};
        int ar2[] = {1, 3, 5, 7, 9};
        ar2 = ar1;
        for (int e2 : ar2) {
            System.out.print(" " + e2);
        }*/

        //Q228
        //Ans: A. Call to super() must be the first line in the constructor!!!!

        //Q233
        //Ans: C. compilation error at line (sb.concat(xxx))
        // 1. there is no method called concat in StringBuilder, this method is in String class
        // 2. here we should use append, and printout result is 1z0-808
        /*StringBuilder sb = new StringBuilder("1z0");
        //sb.concat(-808);
        sb.append("-808");
        System.out.println(sb);*/

        //Q234
        StringBuilder sb = new StringBuilder(5);
        String s = "";
        System.out.println(sb.equals(s));
        System.out.println(sb.toString().equals(s.toString()));
    }



    }

    //Q186
    /*public static void doChange(int[] arr) {
        for (int pos = 0; pos < arr.length; pos++) {
            arr[pos] = arr[pos] + 1;
        }
    }*/

    //Q166
    /*static boolean isAva = false;
    public static boolean doStuff() {
        return !isAva;
    }*/

    //Q114


    //Q50
    /*public static void doStuff(char x) {
        System.out.println("Good day!");
    }

    public static void doStuff(int y) {
        System.out.println("Good Luck!");
    }*/



class AnotherTest extends Test {}


