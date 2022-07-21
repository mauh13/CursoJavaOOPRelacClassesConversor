package senac.entra21.java.oop.lista04;

public class ConversaoDeUnidadesDeTempo {

	private static double minuto; 
	private static double hora;
	private static double dia;
	private static double mes;
	
	public static void converterAnos(int num) {
		System.out.print(String.format("%.2f", (mes = num * 365.25 / 30)) + " meses, ");
		converterMeses(mes);
	}
	
	public static void converterMeses(double num) {
		System.out.print(String.format("%.2f", (dia = num * 30)) + " dias, ");
		System.out.print(String.format("%.2f", (dia / 7)) + " semanas, ");
		converterDias(dia);
	}
	
	public static void converterDias(double num) {
		System.out.print(String.format("%.0f", (hora = num * 24)) + " horas, ");
		converterHoras(hora);
	}
	
	public static void converterHoras(double num) {
		System.out.print(String.format("%.0f", (minuto = num * 60)) + " minutos e ");
		converterMinutos(minuto);
	}
	
	public static void converterMinutos(double num) {
		System.out.print(String.format("%.0f", (num * 60)) + " segundos.\n");
	}
	
}
