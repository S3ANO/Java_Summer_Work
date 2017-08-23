import java.util.Scanner;

class video16_class1{
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        video16_class2 object = new video16_class2();
        System.out.println("Enter name of first gf here: ");
        String temp = input.nextLine();
        object.setName(temp);
        object.saying();
    }
}