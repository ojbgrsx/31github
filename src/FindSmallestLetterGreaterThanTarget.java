class FindSmallestLetterGreaterThanTarget {
    public char nextGreatestLetter(char[] letters, char target) {
        String targetString = String.valueOf(target);
        for (Character i : letters) {
            String letter = String.valueOf(i);
            if (letter.compareTo(targetString) > 0) {
                return i;
            }
        }
        return letters[0];
    }
}
