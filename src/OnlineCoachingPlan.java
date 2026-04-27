public class OnlineCoachingPlan extends MembershipPlan implements RemoteAccess {
    private int videoConsultations;
    private boolean progressReports;

    public OnlineCoachingPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew,
                              int videoConsultations, boolean progressReports) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
        this.videoConsultations = videoConsultations;
        this.progressReports = progressReports;
    }

    @Override
    public String getPlanType() {
        return "Online Coaching Plan";
    }

    @Override
    public double calculateMonthlyNetPrice() {
        double price = baseMonthlyFee;

        price += videoConsultations * 20;

        if (progressReports) {
            price += 30;
        }

        if (autoRenew) {
            price -= 8;
        }

        return price;
    }

    @Override
    public boolean hasOnlineAccess() {
        return true;
    }
}
