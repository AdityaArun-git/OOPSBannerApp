public class OOPSBannerApp3 {

    public static void main(String[] args) {

        String[] line1 = {"O", " ", "O", "O", "O", " ", "P", "P", "P", " ", "S", "S", "S"};
        String[] line2 = {"O", " ", " ", " ", "O", " ", "P", " ", "P", " ", "S", " ", "S"};
        String[] line3 = {"O", " ", " ", " ", "O", " ", "P", "P", "P", " ", "S", "S", " "};
        String[] line4 = {"O", " ", " ", " ", "O", " ", "P", " ", " ", " ", " ", "S", " ", "S"};
        String[] line5 = {"O", "O", "O", "O", "O", " ", "P", " ", " ", " ", "S", "S", "S"};
        
        System.out.println(String.join("", line1));
        System.out.println(String.join("", line2));
        System.out.println(String.join("", line3));
        System.out.println(String.join("", line4));
        System.out.println(String.join("", line5));
    }
}
