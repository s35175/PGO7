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

    @Override
    public double calculateMonthlyGrossPrice() {
        return calculateMonthlyNetPrice() * 1.23;
    }

    public double calculateTotalNetPrice() {
        return calculateMonthlyNetPrice() * months;
    }

    public final void printSummary() {
        System.out.println(toString());
        System.out.println("Plan Type: " + getPlanType());
        System.out.println("Monthly Net Price: " + calculateMonthlyNetPrice());
        System.out.println("Monthly Gross Price: " + calculateMonthlyGrossPrice());
        System.out.println("Total Net Price: " + calculateTotalNetPrice());
        System.out.println("-----------------------------");
    }

    @Override
    public String toString() {
        return "Plan Code: " + planCode + ", Client: " + clientName + ", Months: " + months;
    }
}
