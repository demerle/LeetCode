class Solution {
    public static List<String> fizzBuzz(int n) {
        List<String> answer = new ArrayList<>(n);
        int counter = 0;
        for (int i=0;i<n;i++){
            counter++;
            if (counter%3 == 0 && counter%5 == 0)
                answer.add("FizzBuzz");
            else if(counter%3 == 0)
                answer.add("Fizz");
            else if (counter%5 == 0)
                answer.add("Buzz");
            else{
                answer.add(String.valueOf(counter));
            }
        }
        return answer;
    }
}