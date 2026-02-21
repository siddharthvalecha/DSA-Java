class Solution {
    public String longestCommonPrefix(String[] strs) {
        // Handle the edge case of an empty input array
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Use the first string as the initial reference for the prefix
        for (int i = 0; i < strs[0].length(); i++) {
            char currentChar = strs[0].charAt(i);

            // Compare this character with the character at the same position in all other strings
            for (int j = 1; j < strs.length; j++) {
                // If the current string is shorter than the index or the characters don't match,
                // the common prefix ends here.
                if (i == strs[j].length() || strs[j].charAt(i) != currentChar) {
                    // Return the substring of the first string up to the mismatch point
                    return strs[0].substring(0, i);
                }
            }
        }

        // If the loop completes without a mismatch, the entire first string is the common prefix
        return strs[0];
    }
}

