public class MmUno extends BaseModel {
    private double lambda, miu;

    public MmUno(double lambda, double miu, double cw, double cs) {
        super(cw, cs);
        this.lambda = lambda;
        this.miu = miu;
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


    public double cn(int a){
        return Math.pow((lambda/miu),a);
    }

    public double pn(int a){
        return (1-ro())*Math.pow(ro(),a);
    }

    public double ro(){
        //Factor utilizacion
        return lambda / miu;
    }

    public  double p0(){
        return 1 - ro();
    }

    public double lq(){
        //promedio de clientes en la cola
        double res = (lambda * lambda)/miu*(miu-lambda);
        return res;
    }

    public double l(){
        //número promedio de clientes en el sistema
        return (lambda/(miu-lambda));
    }

    public double wq(){
        //tiempo esperado en la cola
        return (lambda/(miu*(miu-lambda)));
    }

    public double w(){
        //tiempo promedio en el sistema
        return (1/(miu-lambda));
    }

    public double cost() {
        return this.cost(lq(), 1);
    }
}
