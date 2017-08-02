class _Demo {
	public static void main(String[] args){
		if (args.length < 1){
			System.out.println("Please specify a number to generate a grid");
			System.exit(0);
		}
		ZeroMatrix zm = new ZeroMatrix(args[0]);
	}
}
