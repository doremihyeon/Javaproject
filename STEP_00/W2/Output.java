package STEP_00.W2;

class Output {
	public static void main(String args[]) {
        int i;
        System.out.print("Output test...\n");
        System.out.println("Output test...");
        System.out.println(args.length);
        System.out.printf("%d\n", args.length);
        for(i=0; i < args.length; i++)
            System.out.println(args[i]);
	}
}
