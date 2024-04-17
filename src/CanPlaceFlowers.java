public class CanPlaceFlowers {

    private boolean isFlowerPlotAvailable(int[] flowerbed, int pos){

        return flowerbed[pos] != 1 && (pos - 1 < 0 ? true : flowerbed[pos - 1] == 0)
                && (pos + 1 >= flowerbed.length ? true : flowerbed[pos + 1] == 0);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int i = 0;
        while(n > 0 && i < flowerbed.length){
            if(isFlowerPlotAvailable(flowerbed, i)){
                flowerbed[i] = 1;
                n--;
            }
            i++;
        }

        return n == 0;
    }

    public static void main(String[] args) {
        int[] array = {1,0,0,0,1};
        CanPlaceFlowers obj = new CanPlaceFlowers();
        System.out.print(obj.canPlaceFlowers(array, 2));
    }

}
