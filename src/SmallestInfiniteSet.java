import java.util.Arrays;

public class SmallestInfiniteSet {

    private boolean available[];
    int currentSmallest;
    public SmallestInfiniteSet() {
        // false means available
        available = new boolean[1001];
        for(int i = 1 ; i < 1001 ; i++){
            available[i] = true;
        }
        currentSmallest = 1;
    }

    public int popSmallest() {
        int prevSmallest = currentSmallest;
        // update next smallest
        for(int i = prevSmallest + 1 ; i < 1001 ; i++){
            if(available[i]){
                currentSmallest = i;
                break;
            }
        }
        return prevSmallest;
    }

    public void addBack(int num) {
        available[num] = true;
        if(num < currentSmallest){
            currentSmallest = num;
        }
    }

    public static void main(String[] args) {
        SmallestInfiniteSet obj = new SmallestInfiniteSet();
        //["SmallestInfiniteSet","addBack","popSmallest","popSmallest","popSmallest","addBack","popSmallest","popSmallest","popSmallest"]
        obj.addBack(2);
        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
        obj.addBack(1);
        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
        System.out.println(obj.popSmallest());
    }

}
