package assignment6_1_2;

import java.util.Arrays;

public class AssignSixMain {
    public static void main(String[] args) {
        // Q1. Sally can buy mobile electronics?
        MobileElectronics[] mobileElectronicsSally = {
                new SmartPhone("Sally", "10","5G", 0.5, true, "010-1234-5678", 3, 20),
                new TabletPC("Sally", "0", "wifi", 2, true, true)
        };

        // Suppose Sally wants to buy another table PC which is ..
        TabletPC newTablePC = new TabletPC("Sally", "5", "5G", 1.2, true, true);
        boolean canBuyTablePC = MobileElectronicsControl.canBuyMobileElectronics(newTablePC.getWeight(), 2);
        System.out.println("Sally can buy new table PC ? " + canBuyTablePC);
        ///////////////////////////////////////////////////////////////////////////////////////////////

        // Q2. Kalen can change phone number?
        // Suppose Kalen's phone number is at index 3
        SmartPhone[] smartPhones = {
                new SmartPhone("1", "010-1111-5678"),
                new SmartPhone("2", "010-2222-5678"),
                new SmartPhone("3", "010-3333-5678"),
                new SmartPhone("4", "010-4444-5678")
        };
        boolean canChangePhoneNumber = SmartPhoneControl.canPhoneNumber("010-5555-5678", "5678");
        System.out.println("Kalen can chage phone number ? " + canChangePhoneNumber);
        ///////////////////////////////////////////////////////////////////////////////////////////////

        // Q3. Philip's family can change payment method?
        MobileElectronics[] mobileElectronicsPhilips = {
                new SmartPhone("Philip", "10","5G", 0.5, true, "010-1234-5678", 3, 20),
                new TabletPC("Pin", "0", "wifi", 2, true, true)
        };
        boolean canChangePaymentMethod =  MobileElectronicsControl.canChangePaymentMethod("20", "5G");
        System.out.println("Philip's family can change payment method? " + canChangePaymentMethod);



        ///////////////////////////////////////////////////////////////////////////////////////////////
        // size getter() test in NonMobileElectronics
        NonMobileElectronics nonMobileElectronics = new NonMobileElectronics("Sally", "5G", "42.2:35.5", "Living Room", true);
        double width = Double.parseDouble(nonMobileElectronics.getSize().split(":")[0]);
        System.out.println("width : " + width);
        double height = Double.parseDouble(nonMobileElectronics.getSize().split(":")[1]);
        System.out.println("height : " + height);

        // autoMethod setter() test in Electronics
        Electronics electronics = new Electronics();
        electronics.setAuthMethod(new String[]{"fingerprint", "pin"});
        System.out.println(Arrays.toString(electronics.getAuthMethod()));
    }
}
