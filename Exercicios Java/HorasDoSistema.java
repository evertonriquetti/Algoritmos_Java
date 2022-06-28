/*Exercicios para coletar a hora, idioma e a resolução do Sistema. */
//Autor: Everton Riquetti
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

public class HorasDoSistema {

	public static void main(String[] args) {
		Date relogio = new Date();
		Locale loc = Locale.getDefault();
		Toolkit tk;
        tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
		System.out.println("A hora do sistema: ");
		System.out.println(relogio.toString());
		System.out.println("O idioma do sistema operacional: ");
        System.out.println (loc.getDisplayLanguage());
        System.out.print("Sua resolção é de ");
        System.out.println(d.width+" X "+d.height);
	}

}
