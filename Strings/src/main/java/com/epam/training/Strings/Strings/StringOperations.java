package com.epam.training.Strings.Strings;

/**
 *
 * @author Aishwarya_Bommisetty
 *
 */
public class StringOperations {
    /**
     *
     * @param input a string input
     * @return Capitalized String
     */
final String capitalize(final String input) {
    String result;
    char[] stringToChar = input.toCharArray();
    stringToChar[0] = Character.toUpperCase(stringToChar[0]);
    result = new String(stringToChar);
    return result;
}
/**
 *
 * @param string a string input
 * @param input a char for xor operation
 * @return String that has been encoded
 */
final String encode(final String string, final char input) {
    String result;
    char[] stringToChar = string.toCharArray();
    for (int i = 0; i < stringToChar.length; i++) {
        stringToChar[i] = (char) (stringToChar[i] ^ input);
    }
    result = new String(stringToChar);
    return result;
}
/**
 *
 * @param string a string input
 * @param input a character to decode to get original string
 * @return String the decoded string
 */
final String decode(final String string, final char input) {
    String result;
    char[] stringToChar = string.toCharArray();
    for (int i = 0; i < stringToChar.length; i++) {
        stringToChar[i] = (char) (stringToChar[i] ^ input);
    }
    result = new String(stringToChar);
    return result;
}
}
