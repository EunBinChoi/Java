package assignment6_1_2;

public class TabletPC extends MobileElectronics {
    private boolean canWrite;

    public TabletPC(){
        super();
    }
    public TabletPC(boolean canWrite) {
        this.canWrite = canWrite;
    }

    public TabletPC(String serialNo){
        super(serialNo);
    }

    public TabletPC(String serialNo, boolean canWrite) {
        super(serialNo);
        this.canWrite = canWrite;
    }

    public TabletPC(String userName, String paymentPolicy, String communicationMethod, double weight, boolean useCase, boolean canWrite) {
        super(userName, paymentPolicy, communicationMethod, weight, useCase);
        this.canWrite = canWrite;
    }

    public TabletPC(String serialNo, String userName, String paymentPolicy, String communicationMethod, double weight, boolean useCase, boolean canWrite) {
        super(serialNo, userName, paymentPolicy, communicationMethod, weight, useCase);
        this.canWrite = canWrite;
    }

    public TabletPC(String serialNo, String modelName, String companyName, String dateOfMade, String[] authMethod, String userName, String paymentPolicy, String communicationMethod, double weight, boolean useCase, boolean canWrite) {
        super(serialNo, modelName, companyName, dateOfMade, authMethod, userName, paymentPolicy, communicationMethod, weight, useCase);
        this.canWrite = canWrite;
    }

    public boolean isCanWrite() {
        return canWrite;
    }

    public void setCanWrite(boolean canWrite) {
        this.canWrite = canWrite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TabletPC tabletPC = (TabletPC) o;
        return canWrite == tabletPC.canWrite;
    }

    @Override
    public String toString() {
        return super.toString() + "," +
                "TabletPC{" +
                "canWrite=" + canWrite +
                '}';
    }
}
