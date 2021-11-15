import jdk.jshell.execution.Util;

public class Mms extends BaseModel{
    private double lambda, miu;
    private int s;

    public Mms(double lambda, double miu, int s, double cw, double cs) {
        super(cw, cs);
        this.lambda = lambda;
        this.miu = miu;
        this.s = s;
    }

    public double getLambda() {
        return lambda;
    }

    public void setLambda(double lambda) {
        this.lambda = lambda;
    }

    public double getMiu() {
        return miu;
    }

    public void setMiu(double miu) {
        this.miu = miu;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    @Override
    public double ro() { return lambda/(s * miu); }

    @Override
    public double cn(int n) {
        if (n >= 1 && n < s){
            double top = Math.pow(lambda / miu, n);
            return top / Utils.factorial(n);
        }else{
            double top = Math.pow(lambda / miu, n);
            double bottom = Utils.factorial(s) * Math.pow(s, n - s);
            return top / bottom;
        }
    }

    @Override
    public double pn(int n) {
        if (n >= 0 && n <= s){
            double top = Math.pow(lambda / miu, n);
            double bottom = Utils.factorial(n);
            return (top / bottom) * p0();
        }else{
            double top = Math.pow(lambda / miu, n);
            double bottom = Utils.factorial(s) * Math.pow(s, n - s);
            return (top / bottom) * p0();
        }
    }

    @Override
    public double p0() {
        double factor1 = 0;
        for (int i = 0; i <= s - 1; i++) {
            double top = Math.pow(lambda / miu, i);
            factor1 += top / Utils.factorial(i);
        }

        double factor2top = Math.pow(lambda / miu, s);
        double factor2Bottom = Utils.factorial(s);
        double factor2 = factor2top / factor2Bottom;

        double factor3bottom = 1 - lambda / (s * miu);
        double factor3 = 1 / factor3bottom;

        double bottom = factor1 + (factor2 * factor3);
        return 1 / bottom;
    }

    @Override
    public double l() { return lq() + (lambda / miu); }

    @Override
    public double lq() {
        double top = p0() * Math.pow(lambda / miu, s) * ro();
        double bottom = Utils.factorial(s) * Math.pow(1 - ro(), 2);
        return top / bottom;
    }

    @Override
    public double w() { return wq() + (1 / miu); }

    @Override
    public double wq() { return lq() / lambda; }

    public double cost() {
        return this.cost(lq(), s);
    }
}
