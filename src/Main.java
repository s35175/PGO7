public class Main {
    public static void main(String[] args) {

        MembershipPlan[] plans = {
                new GymMembershipPlan("G1","Ali",6,100,true,10,true),
                new PersonalTrainingPlan("P1","Veli",3,200,false,8,2,true),
                new OnlineCoachingPlan("O1","Ayşe",4,150,true,5,true,true),
                new CorporateWellnessPlan("C1","Company",12,500,true,25,3,true)
        };

        for (MembershipPlan p : plans) {
            p.printSummary();
        }
    }
}
