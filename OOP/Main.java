public class Main {

  public static void deliverTo(int n, int m, int[] numberOfRooms,int[] roomNumbers){
    int[] prefixSum = new int[numberOfRooms.length + 1];
    prefixSum[0] = 0;

    for (int i = 1; i < numberOfRooms.length + 1; i += 1){
      prefixSum[i] = prefixSum[i - 1] + numberOfRooms[i - 1];
    }

    int i = 0, j =0, k= 0;
    while (i < roomNumbers.length){
      if(roomNumbers[i] - prefixSum[j] < numberOfRooms[k]){
        int result = (roomNumbers[i] - prefixSum[j]) % numberOfRooms[k];
        System.out.println(k + 1 + "\t" + result);
        i += 1;
        continue;
      }
      if(roomNumbers[i] - prefixSum[j] == numberOfRooms[k]){
        int result = roomNumbers[i] - prefixSum[j];
        System.out.println(k + 1 +  "\t" + result);
        i += 1;
        continue;
      }
      else{
        j += 1;
        k += 1;
      }
    }
  }
  public static void main(String[] args) {
    int n=3,m=6;     //n=number of dormitories, m=number of letters
    int[] numberOfRooms={10,15,12};
    int[] roomNumbers={1,9,12,23,26,37};

    deliverTo(n,m,numberOfRooms,roomNumbers);
  }
}