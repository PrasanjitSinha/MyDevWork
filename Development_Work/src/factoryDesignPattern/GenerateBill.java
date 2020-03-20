package factoryDesignPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PlanFactory plan = new PlanFactory();
        String planName = br.readLine();
        int unit = Integer.parseInt(br.readLine());
        Plan p = plan.getPlan(planName);
        p.getRate();
        p.calculateBill(unit);
    }
}
