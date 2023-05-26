class Membership {
    private final String name;
    private final double monthlyFee;

    public Membership(String name, double monthlyFee) {
        this.name = name;
        this.monthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return monthlyFee;
    }

    public void getDescription() {
        System.out.println("Membership: " + name);
        System.out.println("Monthly fee: " + monthlyFee);
    }

    public double calculateDiscount() {
        return 0;
    }

    static class BasicMembership extends Membership {
        private final boolean accessToClasses;

        public BasicMembership(String name, double monthlyFee, boolean accessToClasses) {
            super(name, monthlyFee);
            this.accessToClasses = accessToClasses;
        }

        public boolean hasAccessToClasses() {
            return accessToClasses;
        }

        public void classOfferings() {
            System.out.println("Some of our class offerings include:");
            System.out.println("- Kickboxing");
            System.out.println("- Spin Class");
            System.out.println("- Yoga");
            System.out.println("- Pilates");
            System.out.println("- Zumba");
            System.out.println("...and more!");
        }

        @Override
        public void getDescription() {
            super.getDescription();
            System.out.println("Our basic gym membership!");
            System.out.println("Grants you exclusive access to top-of-the-line equipment and classes at an unbeatable price.");
        }

        @Override
        public double calculateDiscount() {
            return getMonthlyFee() * 0.1;
        }
    }

    static class PremiumMembership extends Membership {
        private final boolean personalTrainerSessions;

        public PremiumMembership(String name, double monthlyFee, boolean personalTrainerSessions) {
            super(name, monthlyFee);
            this.personalTrainerSessions = personalTrainerSessions;
        }

        public boolean hasPersonalTrainerSessions() {
            return personalTrainerSessions;
        }

        public void personalTrainers() {
            System.out.println("Meet our personal trainers!\n");
            System.out.println("Maverick \"The Motivator\" Monroe:");
            System.out.println("A charismatic personal trainer known for his high-energy workouts and motivating personality.");
            System.out.println("He pushes his clients to their limits while keeping the atmosphere fun and exciting, always incorporating upbeat music and creative exercises to keep things fresh.\n");

            System.out.println("Luna \"The Zen Master\" Ramirez:");
            System.out.println("A calm and serene personal trainer who specializes in holistic fitness.");
            System.out.println("Luna emphasizes the mind-body connection, incorporating yoga, meditation, and mindfulness practices into her sessions.");
            System.out.println("She helps clients find balance, reduce stress, and achieve inner peace along with physical fitness.\n");

            System.out.println("Jackson \"The Muscle Magician\" Reed:");
            System.out.println("A personal trainer with an impressive physique and a knack for building muscle.");
            System.out.println("Jackson's workouts are intense and focused on strength training.");
            System.out.println("He's known for his expertise in bodybuilding techniques, offering personalized workout plans and nutritional advice to help clients sculpt their bodies and reach their muscle-building goals.\n");
        }

        @Override
        public void getDescription() {
            super.getDescription();
            System.out.println("The very best gym membership!");
            System.out.println("Access to all facilities, and one-on-one sessions with our awesome personal trainers. You know you want it!");
        }

        @Override
        public double calculateDiscount() {
            return getMonthlyFee() * 0.2;
        }
    }
}