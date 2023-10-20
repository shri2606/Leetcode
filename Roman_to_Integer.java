class Solution {
    public int romanToInt(String s) {
        HashMap <Character, Integer> num = new HashMap<>();

        num.put('I', 1);
        num.put('V', 5);
        num.put('X', 10);
        num.put('L', 50);
        num.put('C', 100);
        num.put('D', 500);
        num.put('M', 1000);

        int result = num.get(s.charAt(s.length()-1));
        for (int i = s.length() - 2; i >= 0; i--){
            if(num.get(s.charAt(i)) < num.get(s.charAt(i+1))){
                result -=num.get(s.charAt(i));
            }
            else{
                result +=num.get(s.charAt(i));
            }
        }

        return result; 

    }
}