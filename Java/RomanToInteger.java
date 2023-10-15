package Java;

//Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)

public class RomanToInteger {
    public static void main(String[] args) {
        String romanNumber = "IX";
        System.out.println(romanToInt(romanNumber));
    }

    public static int romanToInt(String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            int currentValue = romanCharToInt(currentChar);

            if (i < s.length() - 1) {
                char nextChar = s.charAt(i + 1);
                int nextValue = romanCharToInt(nextChar);

                if (currentValue < nextValue) {
                    result -= currentValue;
                } else {
                    result += currentValue;
                }
            } else {
                result += currentValue;
            }
        }

        return result;
    }

    public static int romanCharToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}

// Output : 9
