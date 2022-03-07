package examen;
/**
 * Clase hora que sirve para comprobar si una hora es correcta o no
 * @author DAW113
 *
 */
public class Hora {
	/**
	 * Atributo público de la clase hora, con el cual verificamos si la hora es correcta o no. Y que hemos inicializado en el metodo validarHota
	 */
	public static boolean horaValida;
/**
 * Método público que devuelve un booleano y que usamos para verificar si una hora es valida o no
 * @param segundos
 * @param minutos
 * @param horas
 * @return horaValida (true o false)
 */
	public static boolean validarHora(int segundos, int minutos, int horas) {
		horaValida = true;
		/**
		 * Condiciones que se utilizan para verificar si es correcta o no la hora
		 */
		if ((horas >= 0) && (minutos >= 0) && (segundos >= 0)) {
			if (horas > 23) {
				horaValida = false;
			} else if (minutos > 59) {
				horaValida = false;
			} else if (segundos > 59) {
				horaValida = false;
			}
		} else {
			horaValida = false;
		}
		return horaValida;
	}
}