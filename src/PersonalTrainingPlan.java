public class PersonalTrainingPlan extends MembershipPlan implements Freezable {
    private int sessionsPerMonth;
    private boolean dietConsultation;

    public PersonalTrainingPlan(String planCode, String clientName, int months, double baseMonthlyFee, boolean autoRenew,
                                int sessionsPerMonth, boolean dietConsultation) {
        super(planCode, clientName, months, baseMonthlyFee, autoRenew);
        this.sessionsPerMonth = sessionsPerMonth;
        this.dietConsultation = dietConsultation;
    }

    @Override
    public String getPlanType() {
        return "Personal Training Plan";
    }

    @Override
    public double calculateMonthlyNetPrice() {
        double price = baseMonthlyFee;

        price += sessionsPerMonth * 35;

        if (dietConsultation) {
            price += 40;
        }

        if (autoRenew) {
            price -= 15;
        }

        return price;
    }

    @Override
    public boolean canFreeze() {
        return true;
    }
}
