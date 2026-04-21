public class CorporateWellnessPlan extends MembershipPlan implements RemoteAccess, Freezable {

    private int employeeCount;
    private int workshopsPerMonth;
    private boolean onlineDashboard;

    public CorporateWellnessPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew,
                                 int employeeCount, int workshopsPerMonth, boolean onlineDashboard) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
        this.employeeCount = employeeCount;
        this.workshopsPerMonth = workshopsPerMonth;
        this.onlineDashboard = onlineDashboard;
    }

    public String getPlanType() {
        return "Corporate";
    }

    public double calculateMonthlyNetPrice() {
        double price = baseMonthlyFee;
        price += employeeCount * 18;
        price += workshopsPerMonth * 220;
        if (employeeCount >= 20) price *= 0.88;
        if (onlineDashboard) price += 80;
        return price;
    }

    public boolean hasOnlineAccess() {
        return onlineDashboard;
    }

    public boolean canFreeze() {
        return true;
    }
}
