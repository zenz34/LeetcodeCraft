class TreeNode{ 

​	int val, l, r; 

​	TreeNode left;

 ​	TreeNode right; ​	 ​	

public TreeNode(int v, int le, int ri){ ​		

val = v; ​		

l = le; ​		

r = ri; ​	

} }	

  public TreeNode build(int nums){ ​	

​	int len = nums.length;

 ​	return generateNode(nums, 0, len-1); }

  public TreeNode generateNode(int[] nums, int l, int r){ 

​	if(l > r) return null; ​	

if(l == r) return new TreeNode(nums[l], l, r); ​	

int sum = 0; ​	

for(int i:nums) ​			

sum+= i; ​	

TreeNode node = new TreeNode(sum, l, r); ​	

node.left = generateNode(nums, l, (l+r)/2); ​	

node.right = generateNode(nums, (l+r)/2+1, r); }