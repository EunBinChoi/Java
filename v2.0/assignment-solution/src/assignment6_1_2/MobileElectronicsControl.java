package assignment6_1_2;

public interface MobileElectronicsControl {
    static boolean canBuyMobileElectronics(double kg, double n){
        return kg <= n;
    }

    static boolean canChangePaymentMethod(String communicationMethod, String paymentMethod){
        if(communicationMethod == null || paymentMethod == null) return false;
        return communicationMethod.toUpperCase().equals("5G") && paymentMethod.compareTo("10") <= 0;
    }

}
