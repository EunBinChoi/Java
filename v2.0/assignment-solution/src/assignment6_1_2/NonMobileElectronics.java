package assignment6_1_2;

import java.util.Objects;

public class NonMobileElectronics extends Electronics {
    protected String representativeName;
    protected String paymentPolicy;
    protected String size; // width:height
    protected String locationOfInstall;
    protected boolean isPowerConnected;

    public NonMobileElectronics() {
        super();
    }

    public NonMobileElectronics(String serialNo) {
        super(serialNo);
    }

    public NonMobileElectronics(String representativeName, String paymentPolicy, String size, String locationOfInstall, boolean isPowerConnected) {
        this.representativeName = representativeName;
        this.paymentPolicy = paymentPolicy;
        this.size = size;
        this.locationOfInstall = locationOfInstall;
        this.isPowerConnected = isPowerConnected;
    }

    public NonMobileElectronics(String serialNo, String representativeName, String paymentPolicy, String size, String locationOfInstall, boolean isPowerConnected) {
        super(serialNo);
        this.representativeName = representativeName;
        this.paymentPolicy = paymentPolicy;
        this.size = size;
        this.locationOfInstall = locationOfInstall;
        this.isPowerConnected = isPowerConnected;
    }

    public NonMobileElectronics(String serialNo, String modelName, String companyName, String dateOfMade, String[] authMethod, String representativeName, String paymentPolicy, String size, String locationOfInstall, boolean isPowerConnected) {
        super(serialNo, modelName, companyName, dateOfMade, authMethod);
        this.representativeName = representativeName;
        this.paymentPolicy = paymentPolicy;
        this.size = size;
        this.locationOfInstall = locationOfInstall;
        this.isPowerConnected = isPowerConnected;
    }

    public String getRepresentativeName() {
        return representativeName;
    }

    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    public String getSize() {
        return size;
    }

    public String getLocationOfInstall() {
        return locationOfInstall;
    }

    public boolean isPowerConnected() {
        return isPowerConnected;
    }

    public void setRepresentativeName(String representativeName) {
        this.representativeName = representativeName;
    }

    public void setPaymentPolicy(String paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setLocationOfInstall(String locationOfInstall) {
        this.locationOfInstall = locationOfInstall;
    }

    public void setPowerConnected(boolean powerConnected) {
        isPowerConnected = powerConnected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NonMobileElectronics that = (NonMobileElectronics) o;
        return isPowerConnected == that.isPowerConnected && Objects.equals(representativeName, that.representativeName) && Objects.equals(paymentPolicy, that.paymentPolicy) && Objects.equals(size, that.size) && Objects.equals(locationOfInstall, that.locationOfInstall);
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "NonMobileElectronics{" +
                "representativeName='" + representativeName + '\'' +
                ", paymentPolicy='" + paymentPolicy + '\'' +
                ", size='" + size + '\'' +
                ", locationOfInstall='" + locationOfInstall + '\'' +
                ", isPowerConnected=" + isPowerConnected +
                '}';
    }

}
