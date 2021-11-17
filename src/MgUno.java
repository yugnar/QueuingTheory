public class MgUno extends BaseModel{

    /*
    Model case codes:
    1 - Model M/G/1
    2 - Model M/D/1
    3 - Model M/Ek/1
     */

    private double lambda, miu, varianza, k;

    public MgUno(double lambda, double miu, double cw, double cs, double varianza, double k){
        super(cw, cs);
        this.lambda = lambda;
        this.miu = miu;
        this.varianza = varianza;
        this.k = k;
    }

    public double getLambda() {return lambda; }

    public void setLambda(double lambda) {this.lambda = lambda; }

    public double getMiu() {
        return miu;
    }

    public void setMiu(double miu) {
        this.miu = miu;
    }

    public double getVarianza() {return varianza; }

    public void setVarianza(double varianza) {this.varianza = varianza; }

    public double getK() {return k; }

    public void setK(double k) { this.k = k; }

    @Override
    public double cn(int n){
        //cn is not defined for M/G/1, M/D/1, M/Ek/1
        return -1;
    }

    @Override
    public double ro() { return lambda/(1 * miu); }

    @Override
    public double pn(int a){
        return (1-ro())*Math.pow(ro(),a);
    }

    @Override
    public double p0(){
        return 1 - ro();
    }

    @Override
    //Default call returns standard model: M/G/1
    public double l(){
       return l(1);
    }

    public double l(int selection) {
        double result = 0;
        switch (selection){
            case 1:
            case 2:
                result = ro() + lq();
                break;
            case 3:
                result = lambda * w(3);
                break;
        }
        return result;
    }

    @Override
    public double lq(){
        return lq(1);
    }

    public double lq(int selection){
        double result = 0;
        switch(selection){
            case 1:
            case 2:
                //Fórmula de Pollaczek-Khintchine
                result = ((lambda * lambda * varianza * varianza) + (ro() * ro()))/(2 * (1 - ro()));
                break;
            case 3:
                result = ((1 + k)/(2*k)) * ((lambda * lambda)/(miu * (miu - lambda)));
                break;
        }
        return result;
    }

    @Override
    public double wq(){
        return wq(1);
    }

    public double wq(int selection){
        double result = 0;
        switch(selection){
            case 1:
            case 2:
                result = lq()/lambda;
                break;
            case 3:
                result = lq(3)/lambda;
                break;
        }
        return result;
    }

    @Override
    public double w(){
        return w(1);
    }

    public double w(int selection){
        double result = 0;
        switch(selection){
            case 1:
            case 2:
                result = wq() + (1/miu);
                break;
            case 3:
                result = wq(3) + (1/miu);
                break;
        }
        return result;
    }

    public double cost() {
        return this.cost(lq(), 1);
    }
}
