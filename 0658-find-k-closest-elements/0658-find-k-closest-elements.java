class Solution {
    public class Pair
    {
        int val;
        int diff;

        Pair(int diff,int val)
        {
            this.diff=diff;
            this.val=val;
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->{
            if(a.diff==b.diff) return b.val-a.val;
            return b.diff-a.diff;
        });

        for(int num:arr)
        {
            int diff=Math.abs(num-x);

            pq.add(new Pair(diff,num));

            if(pq.size()>k)
            {
                pq.remove();
            }
        }

        List<Integer> list=new ArrayList<>();

        while(!pq.isEmpty())
        {
            list.add(pq.remove().val);
        }
        Collections.sort(list);

        return list;
    }
}