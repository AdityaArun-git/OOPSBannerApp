public class OOPSBannerApp4 {

    public static void main(String[] args) {

        // Store banner lines in a String array
        String[] banner = {
            String.join("", "*", "*", "*", "*", "*", "*", "*"),
            String.join("", "*", " ", " ", "O", "O", " ", " ", "*"),
            String.join("", "*", " ", "O", " ", " ", "O", " ", "*"),
            String.join("", "*", " ", " ", "O", "O", " ", " ", "*"),
            String.join("", "*", "*", "*", "*", "*", "*", "*")
        };

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
