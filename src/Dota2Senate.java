import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Dota2Senate {

    /*
    // Always try to solve naive first
    public String predictPartyVictory(String senate) {

      Stack<Character> stack = new Stack<>();
      for(char ch : senate.toCharArray()){
        if(stack.isEmpty()){
            stack.push(ch);
            continue;
        }
        char top = stack.peek();
        if(ch != top){
            stack.pop();
        }
        stack.push(ch);
      }
        return stack.peek() == 'D' ? "Dire" : "Radiant";
    }
    */

    private int findPolitician(Queue<Integer> queue, boolean[] isBanned){
        while(!queue.isEmpty()){
            int current = queue.remove();
            if(!isBanned[current]){
                return current;
            }
        }
        return -1;
    }

    private void fillQueues(String senate, Queue<Integer> votingQueue, Queue<Integer> republicanQueue, Queue<Integer> democratQueue){
        // Fill all queues
        for(int i = 0 ; i < senate.length() ; i++){
            votingQueue.add(i);
            if(senate.charAt(i) == 'R') {
                republicanQueue.add(i);
            }
            else{
                democratQueue.add(i);
            }
        }
    }

    public String predictPartyVictory(String senate) {

        boolean[] isBanned = new boolean[senate.length()];
        Queue<Integer> votingQueue = new LinkedList<>();
        Queue<Integer> republicanQueue = new LinkedList<>();
        Queue<Integer> democratQueue = new LinkedList<>();
        fillQueues(senate, votingQueue, republicanQueue, democratQueue);
        while(!votingQueue.isEmpty()){

            int currentVoter = votingQueue.remove();
            if(isBanned[currentVoter]){
                continue;
            }
            char currentVoterParty = senate.charAt(currentVoter);

            if(currentVoterParty == 'D'){
                int republicanPolitican = findPolitician(republicanQueue, isBanned);
                if(republicanPolitican == -1){
                    return "Dire";
                }
                isBanned[republicanPolitican] = true;

            }
            else{
                int democratPolitian = findPolitician(democratQueue, isBanned);
                if(democratPolitian == -1){
                    return "Radiant";
                }
                isBanned[democratPolitian] = true;
            }
            votingQueue.add(currentVoter);

        }
        return null;
    }

    public static void main(String[] args) {
        Dota2Senate obj = new Dota2Senate();
        System.out.println(obj.predictPartyVictory("DRRDRDRDRDDRDRDR"));
    }

}
