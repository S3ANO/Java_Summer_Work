import java.util.Scanner;

class video7{
    public static void main (String args[]) {
        Scanner sean = new Scanner(System.in);
        double fnum, snum, answer;
        System.out.println("Enter first num:");
        fnum = sean.nextDouble();
        System.out.println("Enter second num:");
        snum = sean.nextDouble();
        answer = fnum + snum;
        System.out.println(answer);
    }
}