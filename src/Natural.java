//Q194
//Ans: D. Print 1 2 3 4 5 six times
public class Natural {

    private int i;
    void disp(){
        while (i <= 5) {
            for (int i = 1; i <= 5;) {
                System.out.print(i + " ");
                i++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        new Natural().disp();
    }

}
