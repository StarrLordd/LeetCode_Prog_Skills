class Solution {
    
    public List<Integer> preorder(Node root) {
        List<Integer> ans=new ArrayList<>();
        helper(root,ans);
        return ans;
    }
    
    public void helper(Node root,List<Integer> ans)
    {
        if(root==null)
            return;
        ans.add(root.val);
        for(Node temp:root.children)
            helper(temp,ans);
    }
}