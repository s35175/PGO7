public class GymMembershipPlan extends MembershipPlan implements Freezable {

    private int entriesPerMonth;
    private boolean saunaAccess;

    public GymMembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew,
                             int entriesPerMonth, boolean saunaAccess) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
        this.entriesPerMonth = entriesPerMonth;
        this.saunaAccess = saunaAccess;
    }

    public String getPlanType() {
        return "Gym";
    }

    public double calculateMonthlyNetPrice() {
        double price = baseMonthlyFee;
        price += entriesPerMonth * 4;
        if (saunaAccess) price += 25;
        if (autoRenew) price -= 10;
        return price;
    }

    public boolean canFreeze() {
        return true;
    }
}public class GymMembershipPlan extends MembershipPlan {

    public GymMembershipPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
   
}
