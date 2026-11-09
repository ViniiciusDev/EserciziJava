public enum Role {
    DEV("Developer") {
        @Override
        double calcBonus(double salary) {
            return salary * 0.10;
        }
    },
    PM("Product Manager")   {
        @Override
        double calcBonus(double salary) {
            return salary * 0.20;
        }
    },
    DEVOPS("DevOps Engineer")   {
        @Override
        double calcBonus(double salary) {
            return salary * 0.15;
        }
    };

    private String description;
    abstract double calcBonus(double salary);

    Role(String description) {
        this.description = description;
    }

    public String getDescription()  {
        return description;
    }
}
