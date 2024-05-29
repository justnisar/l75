/*
class TrieNode{

    TrieNode[] chars;
    boolean found;


    public TrieNode() {
        chars = new TrieNode[26];
        found = false;
    }
}

public class Trie {

    TrieNode head;
    public Trie() {
        head = new TrieNode();
    }

    public void insert(String word) {
        TrieNode current = head;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.chars[index] == null){
                current.chars[index] = new TrieNode();
            }
            else{
                current = current.chars[index];
            }
        }
        current.found = true;
    }

    public boolean search(String word) {
        TrieNode terminalNode = getTerminalNode(word);
        if (terminalNode == null) return false;
        return terminalNode.found;
    }

    private TrieNode getTerminalNode(String word) {
        TrieNode current = head;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.chars[index] == null){
                return null;
            }
            else{
                current = current.chars[index];
            }
        }
        return current;
    }

    public boolean startsWith(String prefix) {
        TrieNode terminalNode = getTerminalNode(prefix);
        return terminalNode != null;
    }

    public static void main(String[] args) {
        /*
        ["Trie","insert","search","search","startsWith","insert","search"]
        [[],["apple"],["apple"],["app"],["app"],["app"],["app"]]
         */
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("apple"));
        System.out.println(trie.search("app"));
        System.out.println(trie.startsWith("app"));
        trie.insert("app");
        System.out.println(trie.search("app"));
    }
}
*/
/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */