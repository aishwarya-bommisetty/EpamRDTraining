package com.epam.training.Strings.Strings;

/**
 *
 * @author Aishwarya_Bommisetty
 *
 */
public final class StringTest {
    /**
     *
     */
    private StringTest() {
    }
    /**
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        StringOperations operations = new StringOperations();
        System.out.println(operations.capitalize("aishwarya"));
        System.out.println(operations.encode("aishwarya", 'a'));
        System.out.println(operations.decode(
                operations.encode("aishwarya", 'a'), 'a'));
    }
}
