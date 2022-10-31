public class Main {
    public static void main(String[] args) {
        String phoneNumber = "8(916)-111-11-11";
        System.out.println(PhoneNumberUtility.removeUselessSymbols(phoneNumber));
        System.out.println(PhoneNumberUtility.validateCountryCode(phoneNumber));
        String correctedPhoneNumber = PhoneNumberUtility.removeUselessSymbols(phoneNumber);
        PhoneNumberUtility.printOperatorByPhone(correctedPhoneNumber);
        //PhoneNumberUtility myUtility = new PhoneNumberUtility();

    }
}