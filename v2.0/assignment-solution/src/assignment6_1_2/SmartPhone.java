package assignment6_1_2;

import java.util.Objects;

public class SmartPhone extends MobileElectronics implements SmartPhoneControl {
    private String phoneNum;
    private int numOfCameras;
    private int numOfSensors;

    public SmartPhone() {
        super();
    }

    public SmartPhone(String serialNo) {
        super(serialNo);
    }

    public SmartPhone(String serialNo, String phoneNum) {
        super(serialNo);
        this.phoneNum = phoneNum;
    }

    public SmartPhone(String phoneNum, int numOfCameras, int numOfSensors) {
        this.phoneNum = phoneNum;
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public SmartPhone(String serialNo, String phoneNum, int numOfCameras, int numOfSensors) {
        super(serialNo);
        this.phoneNum = phoneNum;
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public SmartPhone(String userName, String paymentPolicy, String communicationMethod, double weight, boolean useCase, String phoneNum, int numOfCameras, int numOfSensors) {
        super(userName, paymentPolicy, communicationMethod, weight, useCase);
        this.phoneNum = phoneNum;
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public SmartPhone(String serialNo, String userName, String paymentPolicy, String communicationMethod, double weight, boolean useCase, String phoneNum, int numOfCameras, int numOfSensors) {
        super(serialNo, userName, paymentPolicy, communicationMethod, weight, useCase);
        this.phoneNum = phoneNum;
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public SmartPhone(String serialNo, String modelName, String companyName, String dateOfMade, String[] authMethod, String userName, String paymentPolicy, String communicationMethod, double weight, boolean useCase, String phoneNum, int numOfCameras, int numOfSensors) {
        super(serialNo, modelName, companyName, dateOfMade, authMethod, userName, paymentPolicy, communicationMethod, weight, useCase);
        this.phoneNum = phoneNum;
        this.numOfCameras = numOfCameras;
        this.numOfSensors = numOfSensors;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public int getNumOfCameras() {
        return numOfCameras;
    }

    public void setNumOfCameras(int numOfCameras) {
        this.numOfCameras = numOfCameras;
    }

    public int getNumOfSensors() {
        return numOfSensors;
    }

    public void setNumOfSensors(int numOfSensors) {
        this.numOfSensors = numOfSensors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SmartPhone that = (SmartPhone) o;
        return numOfCameras == that.numOfCameras && numOfSensors == that.numOfSensors && Objects.equals(phoneNum, that.phoneNum);
    }

    @Override
    public String toString() {
        return super.toString() + ", " +
                "SmartPhone{" +
                "phoneNum='" + phoneNum + '\'' +
                ", numOfCameras=" + numOfCameras +
                ", numOfSensors=" + numOfSensors +
                '}';
    }
}
