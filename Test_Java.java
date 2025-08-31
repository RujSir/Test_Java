public class Test_Java {

    private int getValue(char ch) {
        if (ch == 'A') return 1;
        else if (ch == 'B') return 5;
        else if (ch == 'Z') return 10;
        else if (ch == 'L') return 50;
        else if (ch == 'C') return 100;
        else if (ch == 'D') return 500;
        else if (ch == 'R') return 1000;
        else return 0;
    }

    public int alienToInt(String s) {
        if (s == null || s.isEmpty()) return 0;

        int total = 0;

        for (int i = 0; i < s.length(); i++) {
            int current = getValue(s.charAt(i));

            if (i + 1 < s.length()) {
                int next = getValue(s.charAt(i + 1));
                if (current < next) {
                    total -= current;
                    continue;
                }
            }

            total += current;
        }

        return total;
    }

    public static void main(String[] args) {
        Test_Java convert = new Test_Java();

        System.out.println(convert.alienToInt("AAA"));     
        System.out.println(convert.alienToInt("LBAAA"));    
        System.out.println(convert.alienToInt("RCRZCAB"));  

    }
}