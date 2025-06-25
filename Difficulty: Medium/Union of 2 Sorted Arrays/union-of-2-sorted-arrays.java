import java.util.*;

class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int n = a.length;
        int m = b.length;
        HashSet<Integer> s = new HashSet<>();
        ArrayList<Integer> Union = new ArrayList<>();
        
        for (int i = 0; i < n; i++)
            s.add(a[i]);
        for (int i = 0; i < m; i++)
            s.add(b[i]);
        
        for (int it : s)
            Union.add(it);
        
        Collections.sort(Union); 
        
        return Union;
    }
}
