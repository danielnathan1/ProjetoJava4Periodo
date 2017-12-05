package principal;

import java.text.SimpleDateFormat;

public class GerarHora {
	public String gerador(){
		
		String hora = "Hmmss";
		String hora1;
		java.util.Date agora = new java.util.Date();;
		SimpleDateFormat formata = new SimpleDateFormat(hora);
		formata = new SimpleDateFormat(hora);
		hora1 = formata.format(agora);
		
		return hora1;
	}

}
