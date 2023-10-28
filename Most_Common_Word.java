class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        HashMap<String, Integer> word_count = new HashMap<String, Integer>();
        HashSet<String> banned_words = new HashSet<String>();
        
        for(String word : banned){
            banned_words.add(word);
        }
        String [] split_words = paragraph.toLowerCase().split("\\W+");

        for(String word : split_words){
            if(!banned_words.contains(word)){
                word_count.put(word, word_count.getOrDefault(word, 0)+1);
            }
        }

        int max = 0;
        String result = "";

        for(String word : word_count.keySet()){
            if(word_count.get(word) > max){
                max = word_count.get(word);
                result = word;
            }
        }

        return result;
    }
}