public class Mmsk implements IModel {
    private double lambda, miu;
    private int numOfServers;

    public Mmsk(double lambda, double miu, int numOfServers) {
        this.lambda = lambda;
        this.miu = miu;
        this.numOfServers = numOfServers;
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

    public int getNumOfServers() {
        return numOfServers;
    }

    public void setNumOfServers(int numOfServers) {
        this.numOfServers = numOfServers;
    }

    public double lambdae() {
        return 0;
    }

    @Override
    public double ro() throws InvalidSystemException {
        double ro = lambda / (numOfServers * miu);
        if (ro > 1) {
          throw new InvalidSystemException("Ro no dee ser mayor a 1.");
        }
        return ro;
    }

    @Override
    public double cn() {
        return 0;
    }

    @Override
    public double pn() {
        return 0;
    }

    @Override
    public double p0() {
        return 0;
    }

    @Override
    public double l() {
        return 0;
    }

    @Override
    public double lq() {
        return 0;
    }

    @Override
    public double w() {
        return 0;
    }

    @Override
    public double wq() {
        return 0;
    }
}
