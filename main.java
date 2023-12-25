
package mapplestory;

/**
 *
 * @author Zannat Ul Ferdous
 */
public class main {
    public static void main(String[] args) {
        // Test the Aran class
        System.out.println("PTM              :     " + Aran.isValid("PTM"));
        System.out.println("PTMMTP           :     " + Aran.isValid("PTMMTP"));
        System.out.println("BPTMBPTM         :     " + Aran.isValid("BPTMBPTM"));
        System.out.println("PT               :     " + Aran.isValid("PT"));

        Aran aran1 = new Aran();
        System.out.println("\nAran Info \n" + aran1);

        Aran aran2 = new Aran(5);
        System.out.println("\nAran Info\n" + aran2);
    }
}
