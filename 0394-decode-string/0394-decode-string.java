class Solution {
    public String decodeString(String s) {
        while (s.contains("[")) {
            int close = s.indexOf(']');
            int open = close;

            while (s.charAt(open) != '[') {
                open--;
            }

            String part = s.substring(open + 1, close);

            int numStart = open - 1;
            while (numStart >= 0 && Character.isDigit(s.charAt(numStart))) {
                numStart--;
            }
            numStart++;

            int repeat = Integer.parseInt(s.substring(numStart, open));

            StringBuilder repeated = new StringBuilder();
            for (int i = 0; i < repeat; i++) {
                repeated.append(part);
            }

            s = s.substring(0, numStart)
              + repeated.toString()
              + s.substring(close + 1);
        }

        return s;
    }
}