package factoryDesignPattern;

public class PlanFactory {
    public Plan getPlan(String planType) {
        if (planType == null) {
            return null;
        }
        if (planType.equalsIgnoreCase("Domestic")) {
            return new DomesticPlan();
        }
        if (planType.equalsIgnoreCase("Institutional")) {
            return new InstitutionalPlan();
        }
        if (planType.equalsIgnoreCase("Commercial")) {
            return new CommercialPlan();
        }
        return null;
    }
}
