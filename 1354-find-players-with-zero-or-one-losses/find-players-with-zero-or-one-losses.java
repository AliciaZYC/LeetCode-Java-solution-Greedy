class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer>winner=new HashMap<>();
        HashMap<Integer,Integer>loser=new HashMap<>();
        for (int[] match:matches){
            winner.put(match[0], winner.getOrDefault(match[0], 0) + 1);
            loser.put(match[1],loser.getOrDefault(match[1],0)+1);
        }
        ArrayList<Integer> notLost = new ArrayList<>();
        ArrayList<Integer> oneLoss = new ArrayList<>();
       for (int playerId : winner.keySet()) {
           if (!loser.containsKey(playerId)) {
               notLost.add(playerId);
           }
       }

       for (int playerId : loser.keySet()) {
           if (loser.get(playerId) == 1) {
               oneLoss.add(playerId);
           }
       }

       Collections.sort(oneLoss);
       Collections.sort(notLost);

       ArrayList<List<Integer>> ans = new ArrayList<>();
       ans.add(notLost);
       ans.add(oneLoss);
       return ans;
    }
}