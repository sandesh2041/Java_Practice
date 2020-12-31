package com.sandesh;

public class Main {

    public static void main(String[] args) {
       /* final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        //Requesting Input for Principal
        System.out.print("Principal:");
        long loanAmount = scanner.nextLong();

        //Requesting Input for Interest Rate
        System.out.print("Annual Interest Rate:");
        float AnnualInterestRate = scanner.nextFloat();
        float MonthlyInterestRate = AnnualInterestRate / (MONTHS_IN_YEAR * PERCENT);

        //Requesting Input for Loan Period
        System.out.print("Period (Years):");
        int LoanPeriod = scanner.nextInt();
        int NumberOfPayment = LoanPeriod * MONTHS_IN_YEAR;

        //Calculation of Mortgage
        double Numerator = MonthlyInterestRate * Math.pow((1+MonthlyInterestRate), NumberOfPayment);
        double Denominator = (Math.pow((1+MonthlyInterestRate), NumberOfPayment)) - 1;
        double Mortgage  = loanAmount * Numerator / Denominator;

        String FinalMortgage = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("Mortgage: " + FinalMortgage);

        MapPractice MP = new MapPractice();
        System.out.println(MP.MapTest("Hello World"));

        */
        Person info = new Person();
        info.setFirstName("Subash");
        info.setLastName("Kharel");
        info.setAge(55);

        Person info1 = new Person("Sandesh", "Maskey", 18);

        System.out.println(info);
        System.out.println(info1);
        System.out.println(info.getLastName());
    }
}