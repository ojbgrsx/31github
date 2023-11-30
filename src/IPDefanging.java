public class IPDefanging {
    public static String defangIPaddr(String address){
        return address.replaceAll("[^0-9]","[.]");
    }
}
