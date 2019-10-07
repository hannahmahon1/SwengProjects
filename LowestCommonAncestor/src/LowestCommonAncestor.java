import java.util.ArrayList; 
import java.util.List; 
  
//sourced from geeksForgeeks 

class Node { 
    int data; 
    Node left, right; 
  
    Node(int value) { 
        data = value; 
        left = right = null; 
    } 
} 
  
public class LowestCommonAncestor  
{ 
  
    Node root; 
    private List<Integer> pathOne = new ArrayList<>(); 
    private List<Integer> pathTwo = new ArrayList<>(); 
   
    int findLCA(int x, int y) { 
        pathOne.clear(); 
        pathTwo.clear(); 
        return findLCAInternal(root, x, y); 
    } 
  
    private int findLCAInternal(Node root, int x, int y) { 
  
        if (!findPath(root, x, pathOne) || !findPath(root, x, pathTwo)) { 
            return -1; 
        } 
  
        int i; 
        for (i = 0; i < pathOne.size() && i < pathTwo.size(); i++) { 
              
      
            if (!pathOne.get(i).equals(pathTwo.get(i))) 
                break; 
        } 
  
        return pathOne.get(i-1); 
    } 
      
  
    private boolean findPath(Node root, int n, List<Integer> path) 
    { 
     
        if (root == null) { 
            return false; 
        } 
          
      
        path.add(root.data); 
  
        if (root.data == n) { 
            return true; 
        } 
  
        if (root.left != null && findPath(root.left, n, path)) { 
            return true; 
        } 
  
        if (root.right != null && findPath(root.right, n, path)) { 
            return true; 
        } 
  
     
        path.remove(path.size()-1); 
  
        return false; 
    } 
}