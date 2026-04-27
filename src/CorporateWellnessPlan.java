public class CorporateWellnessPlan extends MembershipPlan implements RemoteAccess {
    private int employeeCount;
    private boolean monthlyWorkshop;

    public CorporateWellnessPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew,
                                 int employeeCount, boolean monthlyWorkshop) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
        this.employeeCount = employeeCount;
        this.monthlyWorkshop = monthlyWorkshop;
    }

    @Override
    public String getPlanType() {
        return "Corporate Wellness Plan";
    }

    @Override
    public double calculateMonthlyNetPrice() {
        double price = baseMonthlyFee;

        price += employeeCount * 12;

        if (monthlyWorkshop) {
            price += 100;
        }

        if (autoRenew) {
            price -= 25;
        }

        return price;
    }

    @Override
    public boolean hasOnlineAccess() {
        return true;
    }
}
