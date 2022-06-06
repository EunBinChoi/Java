package assignment6_1_2;

import java.util.Objects;

public class MobileElectronics extends Electronics implements MobileElectronicsControl {
    protected String userName;
    protected String paymentPolicy;
    protected String communicationMethod;
    protected double weight;
    protected boolean useCase;

    public MobileElectronics() {
        super();
    }

    public MobileElectronics(String serialNo) {
        super(serialNo);
    }

    public MobileElectronics(String userName, String paymentPolicy, String communicationMethod, double weight, boolean useCase) {
        this.userName = userName;
        this.paymentPolicy = paymentPolicy;
        this.communicationMethod = communicationMethod;
        this.weight = weight;
        this.useCase = useCase;
    }

    public MobileElectronics(String serialNo, String userName, String paymentPolicy, String communicationMethod, double weight, boolean useCase) {
        super(serialNo);
        this.userName = userName;
        this.paymentPolicy = paymentPolicy;
        this.communicationMethod = communicationMethod;
        this.weight = weight;
        this.useCase = useCase;
    }

    public MobileElectronics(String serialNo, String modelName, String companyName, String dateOfMade, String[] authMethod, String userName, String paymentPolicy, String communicationMethod, double weight, boolean useCase) {
        super(serialNo, modelName, companyName, dateOfMade, authMethod);
        this.userName = userName;
        this.paymentPolicy = paymentPolicy;
        this.communicationMethod = communicationMethod;
        this.weight = weight;
        this.useCase = useCase;
    }

    public String getUserName() {
        return userName;
    }

    public String getPaymentPolicy() {
        return paymentPolicy;
    }

    public String getCommunicationMethod() {
        return communicationMethod;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isUseCase() {
        return useCase;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPaymentPolicy(String paymentPolicy) {
        this.paymentPolicy = paymentPolicy;
    }

    public void setCommunicationMethod(String communicationMethod) {
        this.communicationMethod = communicationMethod;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setUseCase(boolean useCase) {
        this.useCase = useCase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MobileElectronics that = (MobileElectronics) o;
        return Double.compare(that.weight, weight) == 0 && useCase == that.useCase && Objects.equals(userName, that.userName) && Objects.equals(paymentPolicy, that.paymentPolicy) && Objects.equals(communicationMethod, that.communicationMethod);
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "MobileElectronics{" +
                "userName='" + userName + '\'' +
                ", paymentPolicy='" + paymentPolicy + '\'' +
                ", communicationMethod='" + communicationMethod + '\'' +
                ", weight=" + weight +
                ", useCase=" + useCase +
                '}';
    }
}
