package assignment6_1_2;

public interface SmartPhoneControl {
    static boolean canPhoneNumber(String candidateNumber, String strMustIncluded){
        if(candidateNumber == null || strMustIncluded == null) return false;
        return candidateNumber.substring(4, 8).equals(strMustIncluded) || candidateNumber.substring(9, 13).equals(strMustIncluded);
    }
}
