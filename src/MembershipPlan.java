public abstract class MembershipPlan implements Billable {

    private String planCode;
    private String clientName;
    private int months;
    protected double baseMonthlyFee;
    protected boolean autoRenew;

    public MembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew) {
        this.planCode = planCode;
        this.clientName = clientName;
        this.months = months;
        this.baseMonthlyFee = baseMonthlyFee;
        this.autoRenew = autoRenew;
    }

    public abstract String getPlanType();

  
    @Override
    public abstract double calculateMonthlyNetPrice();

    z
    @Override
    public double calculateMonthlyGrossPrice() {
        return calculateMonthlyNetPrice() * 1.23;
    }

    public double calculateTotalNetPrice() {
        return calculateMonthlyNetPrice() * months;
    }

    public final void printSummary() {
        System.out.println(toString());
        System.out.println("Monthly Net: " + calculateMonthlyNetPrice());
        System.out.println("Monthly Gross: " + calculateMonthlyGrossPrice());
        System.out.println("Total Net: " + calculateTotalNetPrice());
        System.out.println("-------------");
    }

  
    @Override
    public String toString() {
        return "Plan: " + planCode + ", Client: " + clientName + ", Months: " + months;
    }
}
}
