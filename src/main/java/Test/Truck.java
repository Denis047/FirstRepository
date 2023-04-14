package Test;
public class Truck {
    private final String owner;
    private final String stsNumber;
    private final int year;
    private final String trailer;
    private final String driver;
    private final String date;
    private final String xxxx;

    public Truck(String owner, String stsNumber, int year, String trailer, String driver, String date, String xxxx) {
        this.owner = owner;
        this.stsNumber = stsNumber;
        this.year = year;
        this.trailer = trailer;
        this.driver = driver;
        this.date = date;
        this.xxxx = xxxx;
    }
    public static TruckBuilder builder(){
        return new TruckBuilder();
    }
    public static class TruckBuilder{
        private String owner;
        private String stsNumber;
        private int year;
        private String trailer;
        private String driver;
        private  String date;
        private String xxxx;

        public TruckBuilder owner(String owner){
            this.owner = owner;
            return this;
        }
        public TruckBuilder stsNumber(String stsNumber){
            this.stsNumber = stsNumber;
            return this;
        }
        public TruckBuilder year(int year){
            this.year = year;
            return this;
        }
        public TruckBuilder trailer(String trailer){
            this.trailer = trailer;
            return this;
        }
        public TruckBuilder driver(String driver){
            this.driver = driver;
            return this;
        }
        public TruckBuilder xxxx(String xxxx){
            this.xxxx = xxxx;
            return this;
        }
        public TruckBuilder date(String date){
            this.date = date;
            return this;
        }
        public Truck build(){
            return new Truck(owner,stsNumber,year,trailer, driver, date, xxxx);
        }


    }
}