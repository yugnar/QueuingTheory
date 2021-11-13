public abstract class BaseModel implements IModel {
    protected double cw, cs;

    public BaseModel(double cw, double cs) {
        this.cw = cw;
        this.cs = cs;
    }

    public double cost(double lq, int s) {
        return (lq * cw) + (s * cs);
    }
}
