package intro_pt2.HashMap;

import java.util.HashMap;

public class IOU
{
    private HashMap<String, Double> balanceLog;

    public IOU() {
        balanceLog = new HashMap<>();
    }

    public void setSum(String toWhom, double amount) {
        balanceLog.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        for (String lender : balanceLog.keySet()) {
            if (lender.equals(toWhom)) {
                return this.balanceLog.getOrDefault(toWhom, 0.00);
            }
        }
        return 0.00;
    }


    public static void main(String[] args) {
        IOU myIOU = new IOU();
        myIOU.setSum("Jim", 51.5);
        myIOU.setSum("Hyronomous Lex", 30);

        System.out.println(myIOU.howMuchDoIOweTo("Jim"));
        System.out.println(myIOU.howMuchDoIOweTo("Hyronomous Lex"));
    }
}
