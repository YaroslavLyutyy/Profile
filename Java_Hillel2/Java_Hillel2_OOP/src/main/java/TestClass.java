import com.ibm.icu.text.RuleBasedNumberFormat;

import java.util.Locale;

public class TestClass {
    public static void main(String[] args) {
        int number = 783234234;

        RuleBasedNumberFormat ruleBasedNumberFormat = new RuleBasedNumberFormat(new Locale("EN", "US"), RuleBasedNumberFormat.SPELLOUT);
        System.out.println(ruleBasedNumberFormat.format(number));
    }
}
