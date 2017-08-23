import java.util.Scanner;

class video8{
    public static void main (String args[]) {
        Scanner sean = new Scanner(System.in);
        
        int girls, boys, people;
        girls = sean.nextInt();
        boys = sean.nextInt();
        people = girls % boys;
        System.out.println(people);
    }
}