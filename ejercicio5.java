import java.util.*;

public class ejercicio5 {

	public static void main(String args[]) {
		
		int conteo_h, conteo_m;
		int e, i, n;
		String s;
		Scanner scanner = new Scanner(System.in);
		conteo_m = 0;
		conteo_h = 0;

		System.out.print(" Cuantas personas desea ingresar: ");
		n = scanner.nextInt();

		for (i=1;i<=n;i++) {
			System.out.print(" Registro "+i+") Ingrese la edad: ");
			e = scanner.nextInt();
			System.out.print(" Registro "+i+") Ingrese el sexo (f = femenino, m = masculino):  ");
			s = scanner.next();

			if ((e>=1) && (e<=100)) {
				if ((e>=18) && (s.equals("f"))) {
					conteo_m++;
					System.out.println(" Mujer Mayor ");
				}
				if ((e<=18) && (s.equals("m"))) {
					conteo_h++;
					System.out.println(" Hombre menor  ");
					System.out.println("\n");
				}

				System.out.println("Persona ingresada:"+i+" ");
				System.out.println("Mujeres Mayores: "+conteo_m+" ");
				System.out.println("Hombres menores: "+conteo_h+" ");
			}
		}
		System.out.println("\n");
		System.out.println("Personas ingresadas: "+n+" Personas Mayores de sexo Femenino: "+conteo_m+"  Personas menores de sexo Masculino: "+conteo_h+".");
	}
}
