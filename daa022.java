// Codigo inicial para o problema [DAA 022] Arvores Red-Black
// Pedro Ribeiro (DCC/FCUP)

import java.util.Scanner;

// Estrutura para representar um no da arvore
class Node {
    boolean isBlack;  // No preto?
    boolean isNull;   // No nulo?
    int value;        // Valor
    Node left, right; // Filhos

    Node(int v) {
		isNull  = (v==0);
		isBlack = (v>=0);
		value   = Math.abs(v);
    }
}

public class daa022 {
    // Ler input em preorder
    static Node readPreOrder(Scanner in) {
		int v = in.nextInt();
		Node aux = new Node(v);
		if (v!=0) {
	    	aux.left  = readPreOrder(in);
	    	aux.right = readPreOrder(in);
		}
		return aux;
    }

    // Menor valor da arvore
    static int minimum(Node t) {
		if (t.isNull) return Integer.MAX_VALUE;
		int minLeft  = minimum(t.left);
		int minRight = minimum(t.right);
		return Math.min(t.value, Math.min(minLeft, minRight));
    }

    // Maior valor da arvore
    static int maximum(Node t) {
		if (t.isNull) return Integer.MIN_VALUE;
		int minLeft  = maximum(t.left);
		int minRight = maximum(t.right);
		return Math.max(t.value, Math.max(minLeft, minRight));
    }

    // Quantidade de nos (internos)
    static int size(Node t) {
		if (t.isNull) return 0;
		return 1 + size(t.left) + size(t.right);
    }

    // ---------------------------------------------------

    public static boolean isBST(Node n){
    	if(n.isNull)
    		return true;
    	if(!n.left.isNull && maximum(n.left) > n.value)  
    		return false;  
    	if(!n.right.isNull && minimum(n.right) < n.value)  
    		return false;
    	if(!isBST(n.left) || !isBST(n.right))
    		return false;
    	return true;
    }

    public static boolean hasRootProp(Node n){
    	if(n.isBlack)
    		return true;
    	return false;
    }

    public static boolean hasRedProp(Node n){
    	if(n.isNull)
    		return true;
    	if(!n.isBlack && !n.left.isBlack)
    		return false;
    	if(!n.isBlack && !n.right.isBlack)
    		return false;
    	return hasRedProp(n.left) && hasRedProp(n.right);
    }

    public static int getBH(Node n){
    	if(n.isNull)
    		return 0;
    	
    	int leftHeight = getBH(n.left);
    	int rightHeight = getBH(n.right);
    	int currHeight = 0;

    	if(n.isBlack)
    		currHeight = 1;

    	if(leftHeight == -1 || rightHeight == -1 || leftHeight != rightHeight)
    		return -1;
    	else
    		return leftHeight + currHeight;
    }

    public static boolean hasBlackProp(Node n){
    	return getBH(n) != -1;
    }

    public static void main(String args[]) {
		Scanner stdin = new Scanner(System.in);
	
		int n =  stdin.nextInt();
		for (int i=0; i<n; i++) {
	    	Node root = readPreOrder(stdin);
	    	if(isBST(root) && hasRootProp(root) && hasRedProp(root) && hasBlackProp(root))
	    		System.out.println("SIM");
	    	else
	    		System.out.println("NAO");
		}	
    }
}