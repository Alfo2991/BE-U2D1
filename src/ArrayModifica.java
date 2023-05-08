import java.util.Random;
import java.util.Scanner;

public class ArrayModifica {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int[] arr = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(10) + 1;
		}
		
		while (true) {
			System.out.println("Array corrente: " + arrayToString(arr));

			int pos, val;
			try {
				System.out.print("Inserisci la posizione da modificare (0-4): ");
				pos = input.nextInt();
				if (pos < 0 || pos > 4) {
					throw new IllegalArgumentException("Posizione non valida");
				}
				
				System.out.print("Inserisci il nuovo valore (1-10): ");
				val = input.nextInt();
				if (val < 1 || val > 10) {
					throw new IllegalArgumentException("Valore non valido");
				}

				arr[pos] = val;
				
			} catch (Exception e) {
				System.out.println("Errore: " + e.getMessage());
				input.nextLine();
				continue;
			}
			
			if (val == 0) {
				break;
			}
		}
		
		System.out.println("Programma terminato");
		input.close();
	}
	
	private static String arrayToString(int[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i < arr.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		return sb.toString();
	}
}
