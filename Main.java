package BT_pack;
public class Main {
	public static void main(String[]args)
	{
		long count;
		count=Math.round(Math.random()*100+25);
		BinaryTree main_derevo = new BinaryTree(0.5);
		main_derevo.BinaryTreeRun(main_derevo, count);
		System.out.println("_|_|_|_|_");
		main_derevo.walk(main_derevo);
		System.out.println(main_derevo.get_count());
	}
	

}
