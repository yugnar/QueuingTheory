public class Mmsk extends BaseModel {
    private double lambda, miu;
    private int s, k;

    public Mmsk(double lambda, double miu, int s, int k, double cw, double cs) {
        super(cw, cs);
        this.lambda = lambda;
        this.miu = miu;
        this.s = s;
        this.k = k;
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

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public double lambdae() {
        return lambda * (1 - pn(k));
    }

    @Override
    public double ro() {
        return lambda / (s * miu);
    }

    @Override
    public double cn(int n) {
        if (n < s) {
            double top = Math.pow(lambda / miu, n);
            return top / Utils.factorial(n);
        } else if (n >= s && n <= k) {
            double top = Math.pow(lambda / miu, n);
            double bottom = Utils.factorial(s) * Math.pow(s, n - s);
            return top / bottom;
        }
        return 0;
    }

    @Override
    public double pn(int n) {
        if (n >= 1 && n < s) {
            double top = Math.pow(lambda / miu, n);
            double bottom = Utils.factorial(n);
            return (top / bottom) * p0();
        } else if (n >= s && n <= k) {
            double top = Math.pow(lambda / miu, n);
            double bottom = Utils.factorial(s) * Math.pow(s, n - s);
            return (top / bottom) * p0();
        }
        return 0;
    }

    @Override
    public double p0() {
        double factor1 = 0;
        for (int i = 0; i <= s; i++) {
            double top = Math.pow(lambda / miu, i);
            factor1 += top / Utils.factorial(i);
        }

        double factor2top = Math.pow(lambda / miu, s);
        double factor2Bottom = Utils.factorial(s);
        double factor2 = factor2top / factor2Bottom;

        double factor3 = 0;
        for (int i = s + 1; i <= k; i++) {
            double fraction = lambda / (s * miu);
            factor3 += Math.pow(fraction, i - s);
        }

        double bottom = factor1 + (factor2 * factor3);

        return 1 / bottom;
    }

    @Override
    public double l() {
        return lambdae() * w();
    }

    @Override
    public double lq() {
        double factor1Top = p0() * Math.pow(lambda / miu, s) * ro();
        double factor1Bottom = Utils.factorial(s) * Math.pow(1 - ro(), 2);
        double factor2 = 1 - Math.pow(ro(), k - s) - ((k - s) * Math.pow(ro(), k - s) * (1 - ro()));
        return (factor1Top / factor1Bottom) * factor2;
    }

    @Override
    public double w() {
        return wq() + (1 / miu);
    }

    @Override
    public double wq() {
        return lq()/ lambdae();
    }

    public double cost() {
        return this.cost(lq(), s);
    }
}
