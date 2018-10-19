import java.util.Scanner;
class MethodDropp {

    static Scanner sc = new Scanner(System.in);
    static String[] names = new String[5];
    static int[] numbers = new int[5];
    static int[] score = new int[]{0, 0, 0, 0, 0};

		 public static void main(String[] args) {
			getData();
			calMax();
    }
    
		 public static void getData() {
			 for (int i = 0; i < 5; i++) {
				 System.out.print("Input Prime Minister ID => ");
            int number = sc.nextInt();
					System.out.print("Input Prime Minister Name => ");
					String name = sc.next();
						names[i] = name;
						numbers[i] = number;
        }
    }

		public static void calMax() {
			 for (int count = 0; count < 10; count++) {
			    int selected = 0;
					do {
						System.out.print("Vote ID = ");

                int id = sc.nextInt();
             for (int i = 0; i < 5; i++) {
                    if (id == numbers[i]) {
                        score[i]++;
							System.out.println("NAME :" + names[i]);
							System.out.println(" ");
                        selected = 1;
                    }
                }
					 if (selected == 0) {
							System.out.println("Invalid number");
                }
            }		while (selected == 0);
        }
				 int max = 0;
			for (int i = 0; i < 5; i++) {
					if (score[max] < score[i])
						 max = i;
        }
        System.out.printf("Winner is %s with score %d points", names[max], score[max]);
    }
}