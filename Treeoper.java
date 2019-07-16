class Treeoper
{
	void zigZagTraversal(Node root)
	{
	    
	   
	   Stack<Node> stack1 = new Stack<Node>() ;
	   Stack<Node> stack2 = new Stack<Node>() ;
	   stack1.push(root);
	   StringBuffer sb = new StringBuffer();
	   while(!stack1.isEmpty() || !stack2.isEmpty()){
	       while(!stack1.isEmpty()){
	           Node node = stack1.pop();
	           sb.append(node.data);
    	       sb.append(" ");
	           if(node.left!=null){
	               stack2.push(node.left);
	           }
	           if(node.right!=null){
	               stack2.push(node.right);
	           }
	       }
	       
	       while(!stack2.isEmpty()){
	           Node node = stack2.pop();
	           sb.append(node.data);
    	       sb.append(" ");
	           if(node.right!=null){
	               stack1.push(node.right);
	           }
	           if(node.left!=null){
	               stack1.push(node.left);
	           }
	       }
	   }
	   
	   System.out.print(sb.toString());
	}
}
