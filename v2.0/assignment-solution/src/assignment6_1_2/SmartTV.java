package assignment6_1_2;

public class SmartTV extends NonMobileElectronics {
    private int numOfChannel;

    public SmartTV(){
        super();
    }
    public SmartTV(int numOfChannel) {
        this.numOfChannel = numOfChannel;
    }

    public SmartTV(String serialNo) {
        super(serialNo);
    }

    public SmartTV(String serialNo, int numOfChannel) {
        super(serialNo);
        this.numOfChannel = numOfChannel;
    }

    public SmartTV(String representativeName, String paymentPolicy, String size, String locationOfInstall, boolean isPowerConnected, int numOfChannel) {
        super(representativeName, paymentPolicy, size, locationOfInstall, isPowerConnected);
        this.numOfChannel = numOfChannel;
    }

    public SmartTV(String serialNo, String representativeName, String paymentPolicy, String size, String locationOfInstall, boolean isPowerConnected, int numOfChannel) {
        super(serialNo, representativeName, paymentPolicy, size, locationOfInstall, isPowerConnected);
        this.numOfChannel = numOfChannel;
    }

    public SmartTV(String serialNo, String modelName, String companyName, String dateOfMade, String[] authMethod, String representativeName, String paymentPolicy, String size, String locationOfInstall, boolean isPowerConnected, int numOfChannel) {
        super(serialNo, modelName, companyName, dateOfMade, authMethod, representativeName, paymentPolicy, size, locationOfInstall, isPowerConnected);
        this.numOfChannel = numOfChannel;
    }

    public int getNumOfChannel() {
        return numOfChannel;
    }

    public void setNumOfChannel(int numOfChannel) {
        this.numOfChannel = numOfChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartTV smartTV = (SmartTV) o;
        return numOfChannel == smartTV.numOfChannel;
    }

    @Override
    public String toString() {
        return super.toString() + ","+
                "SmartTV{" +
                "numOfChannel=" + numOfChannel +
                '}';
    }
}
