public class RomanToNumber {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int value = 0, prev = 0;
        for (char ch : s.toCharArray()) {
            prev = switch (ch) {
                case 'I' -> {
                    value += 1;
                    yield 1;
                }
                case 'V' -> {
                    value += (prev == 1) ? 3 : 5;
                    yield 5;
                }
                case 'X' -> {
                    value += (prev == 1) ? 8 : 10;
                    yield 10;
                }
                case 'L' -> {
                    value += (prev == 10) ? 30 : 50;
                    yield 50;
                }
                case 'C' -> {
                    value += (prev == 10) ? 80 : 100;
                    yield 100;
                }
                case 'D' -> {
                    value += (prev == 100) ? 300 : 500;
                    yield 500;
                }
                case 'M' -> {
                    value += (prev == 100) ? 800 : 1000;
                    yield 1000;
                }
                default -> prev;
            };
        }
        System.out.println(value);
    }
}