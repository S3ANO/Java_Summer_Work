class video23_class1{
    public static void main (String args[]) {
        double amount;
        double principal = 10000;
        double rate = 0.01;

        for(int day = 1; day <= 20; day++) {
            amount = principal * Math.pow(1 + rate, day); //A = P (1 + R) ^n
            System.out.println(day + "  " + amount);
        }
    }
}