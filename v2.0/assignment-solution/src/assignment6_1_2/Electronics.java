package assignment6_1_2;

import java.util.Arrays;
import java.util.Objects;

public class Electronics {
    protected String serialNo;
    protected String modelName;
    protected String companyName;
    protected String dateOfMade; // YYYY-MM-dd
    protected String[] authMethod;

    public Electronics() {}
    public Electronics(String serialNo) {
        this.serialNo = serialNo;
    }
    public Electronics(String serialNo, String modelName, String companyName, String dateOfMade, String[] authMethod) {
        this.serialNo = serialNo;
        this.modelName = modelName;
        this.companyName = companyName;
        this.dateOfMade = dateOfMade;
        this.authMethod = authMethod;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public String getModelName() {
        return modelName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getDateOfMade() {
        return dateOfMade;
    }

    public String[] getAuthMethod() {
        return authMethod;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setDateOfMade(String dateOfMade) {
        this.dateOfMade = dateOfMade;
    }

    public void setAuthMethod(String[] authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Electronics that = (Electronics) o;
        return Objects.equals(serialNo, that.serialNo) && Objects.equals(modelName, that.modelName) && Objects.equals(companyName, that.companyName) && Objects.equals(dateOfMade, that.dateOfMade) && Arrays.equals(authMethod, that.authMethod);
    }

    @Override
    public String toString() {
        return "Electronics {" +
                "serialNo='" + serialNo + '\'' +
                ", modelName='" + modelName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", dateOfMade='" + dateOfMade + '\'' +
                ", authMethod=" + Arrays.toString(authMethod) +
                '}';
    }
}
