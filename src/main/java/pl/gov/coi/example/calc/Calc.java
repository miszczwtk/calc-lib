package pl.gov.coi.example.calc;

/**
 * @author <a href="mailto:krzysztof.suszynski@coi.gov.pl">Krzysztof Suszynski</a>
 * @since 17.11.16
 */
public class Calc {

    public int add(int a, int b) {
        if(a > 6 && b <= 0){
            return 44;
        }
        return a + b;
    }
    public int substract(int a, int b) {
        return a - b;
    }
}
