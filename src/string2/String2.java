package string2;

public class String2 {

    public String doubleChar(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            result.append(str.charAt(i)).append(str.charAt(i));
        }
        return result.toString();
    }

    public int countCode(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 3; i++) {
            if (str.substring(i, i + 2).equals("co") && str.charAt(i+3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public boolean bobThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                return true;
            }
        }
        return false;
    }

    public String repeatEnd(String str, int n) {
        String result = "";
        String lastN = str.substring(str.length() - n);

        for (int i = 0; i < n; i++) {
            result += lastN;
        }

        return result;
    }

    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        return str.indexOf(prefix, n) != -1;
    }

    public boolean sameStarChar(String str) {
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) == '*') {
                if (str.charAt(i - 1) != str.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }

    public String starOut(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                continue;
            }
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }
            if (i < str.length() - 1 && str.charAt(i + 1) == '*') {
                continue;
            }
            result += str.charAt(i);
        }
        return result;
    }

    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i <str.length() -1; i++) {
            if(str.substring(i,i+2).contains("hi")){
                count++;
            }
        }
        return count;
    }

    public boolean endOther(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();
        if (a.endsWith(b) || b.endsWith(a)) {
            return true;
        }
        return false;
    }

    public boolean xyBalance(String str) {
        int lastX = str.lastIndexOf('x');
        int lastY = str.lastIndexOf('y');

        if (lastX == -1) {
            return true;
        }
        return lastY > lastX;
    }

    public String repeatFront(String str, int n) {
        String result = "";
        for (int length = n; length > 0; length--) {
            result += str.substring(0, length);
        }
        return result;
    }

    public boolean xyzMiddle(String str) {
        int n = str.length();
        for (int i = 0; i <= n - 3; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                int left = i;
                int right = n - (i + 3);
                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public String oneTwo(String str) {
        String result = "";
        for (int i = 0; i + 2 < str.length(); i += 3) {
            result += str.substring(i + 1, i + 3) + str.charAt(i);
        }
        return result;
    }

    public String plusOut(String str, String word) {
        String result = "";
        int i = 0;

        while (i < str.length()) {
            if (i + word.length() <= str.length()
                    && str.substring(i, i + word.length()).equals(word)) {
                result += word;
                i += word.length();
            } else {
                result += "+";
                i++;
            }
        }
        return result;
    }

    public boolean catDog(String str) {
        int countCat = 0;
        int countDog = 0;
        for (int i = 0; i <str.length() -2; i++) {
            if(str.substring(i, i+3).equals("cat")){
                countCat++;
            }
            if(str.substring(i,i+3).equals("dog")){
                countDog++;
            }
        }
        return countCat == countDog;
    }

    public boolean xyzThere(String str) {
        for (int i = 0; i < str.length() - 2; i++) {
            if (str.substring(i, i + 3).equals("xyz")) {
                if (i == 0 || str.charAt(i - 1) != '.') {
                    return true;
                }
            }
        }
        return false;
    }

    public String mixString(String a, String b) {
        StringBuilder result = new StringBuilder();
        int minLength = Math.min(a.length(), b.length());
        for (int i = 0; i < minLength; i++) {
            result.append(a.charAt(i));
            result.append(b.charAt(i));
        }
        result.append(a.substring(minLength));
        result.append(b.substring(minLength));

        return result.toString();
    }

    public String repeatSeparator(String word, String sep, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(word);
            if (i < count - 1) {
                result.append(sep);
            }
        }
        return result.toString();
    }

    public String getSandwich(String str) {
        int first = str.indexOf("bread");
        int last = str.lastIndexOf("bread");

        if (first == -1 || first == last) {
            return "";
        }
        return str.substring(first + 5, last);
    }

    public String zipZap(String str) {
        String result = "";
        int i = 0;
        while (i < str.length()) {
            if (i + 2 < str.length()
                    && str.charAt(i) == 'z'
                    && str.charAt(i + 2) == 'p') {
                result += "zp";
                i += 3;
            } else {
                result += str.charAt(i);
                i++;
            }
        }
        return result;
    }



}
