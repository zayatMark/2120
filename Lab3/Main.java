public class Main {
    public static void main(String[] args) {
        GymRecord<String> gymRecord1 = new GymRecord<>("Cardio", 60);
        GymRecord<String> gymRecord2 = new GymRecord<>("Strength training", 45);

        String sessionType1 = gymRecord1.getSessionType();
        int duration1 = gymRecord1.getDuration();
        System.out.println("Session Type: " + sessionType1);
        System.out.println("Duration: " + duration1 + " minutes");

        String sessionType2 = gymRecord2.getSessionType();
        int duration2 = gymRecord2.getDuration();
        System.out.println("Session Type: " + sessionType2);
        System.out.println("Duration: " + duration2 + " minutes");

        Membership.BasicMembership basicMembership = new Membership.BasicMembership("Basic", 29.99, true);
        basicMembership.getDescription();
        basicMembership.classOfferings();
        boolean accessToClasses = basicMembership.hasAccessToClasses();
        System.out.println("Access to classes: " + accessToClasses);

        Membership.PremiumMembership premiumMembership = new Membership.PremiumMembership("VIP", 79.99, true);
        premiumMembership.getDescription();
        premiumMembership.personalTrainers();
        boolean personalTrainerSessions = premiumMembership.hasPersonalTrainerSessions();
        System.out.println("Personal trainer sessions: " + personalTrainerSessions);

        Membership[] memberships = new Membership[2];
        memberships[0] = basicMembership;
        memberships[1] = premiumMembership;

        for (Membership membership : memberships) {
            double discount = membership.calculateDiscount();
            System.out.println("Discount: " + discount);
        }
    }
}