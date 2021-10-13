package Exercicio;

import java.util.Calendar;

public class Calendars {
	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		System.out.println(hoje);

		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);

		System.out.println(dia + "-" + mes + "-" + ano);
		System.out.println(hora);

		System.out.printf("Hoje �: %02d/%02d/%d",dia,mes + 1,ano);
		System.out.printf("\nHora: %d:%d:%02d",hora,minutos,segundos);
	}
}
