class Solution {

    public String interpret(String command) {
        StringBuilder result = new StringBuilder();
        System.out.println(command);
        for (int a = 0; a < command.length(); a++) {
            if (command.charAt(a) == '(' && command.charAt(a + 1) == ')') {
                result.append('o');
                a++;
            } else if (command.charAt(a) == '(' && command.charAt(a + 3) == ')') {
                a+=3;
                result.append("al");
            } else {
                result.append(command.charAt(a));
            }
        }
        return result.toString();
    }
}
