public class Main {
    public static void main(String[] args) {
        MembershipPlan[] plans = new MembershipPlan[4];

        plans[0] = new GymMembershipPlan("GYM-001", "Adam Nowak", 6, 120.0, true, 12, true);
        plans[1] = new PersonalTrainingPlan("PT-001", "Anna Kowalska", 3, 200.0, false, 8, true);
        plans[2] = new OnlineCoachingPlan("ONL-001", "John Smith", 4, 90.0, true, 3, true);
        plans[3] = new CorporateWellnessPlan("CORP-001", "Tech Company", 12, 500.0, true, 25, true);

        for (MembershipPlan plan : plans) {
            plan.printSummary();

            if (plan instanceof Freezable) {
                Freezable freezablePlan = (Freezable) plan;
                System.out.println("Can freeze: " + freezablePlan.canFreeze());
            }

            if (plan instanceof RemoteAccess) {
                RemoteAccess remotePlan = (RemoteAccess) plan;
                System.out.println("Has online access: " + remotePlan.hasOnlineAccess());
            }

            System.out.println("=============================");
        }
    }
}
