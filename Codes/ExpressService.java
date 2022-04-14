public class ExpressService implements ShipmentStrategy{

    private float rate;
    private String est;
    
    public ExpressService() {
        rate = 0;
        est = "1-2 days";
    }

    @Override
    public void count(float weight) {
        this.rate = weight * 14000;
    }

    @Override
    public String getServiceName() {
        return "Express";
    }

    @Override
    public float getRate() {
        return rate;
    }

    @Override
    public String getEst() {
        return est;
    }

}
