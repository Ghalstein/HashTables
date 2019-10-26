public class SingleNumber {

  public int singleNumber(int[] nums) {
        
    Map<Integer, Integer> map = new HashMap<>();
    
    for (int val : nums) {
        if (map.containsKey(val)) {
            if (map.get(val) == 2) {
                map.remove(val, 2);
            }else {
                map.put(val, map.get(val) + 1);
            }
        }
        else {
            map.put(val, 1);
        }
    }
    
    for(int key : map.keySet()) {
        return key;
    }
    return -1;
  }
  public static void main(String[] args) {
    
  }
}