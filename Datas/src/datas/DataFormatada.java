package datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataFormatada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calendar c  = Calendar.getInstance();
		Date data = c.getTime();
		
		DateFormat f = DateFormat.getDateInstance(DateFormat.FULL); // data completa
		System.out.println("Data Brasileira : " + f.format(data));
		
		
		 f = DateFormat.getDateInstance(DateFormat.LONG); // data completa
		System.out.println("Data sem o dia escrito : " + f.format(data));
		
		
		
		 f = DateFormat.getDateInstance(DateFormat.MEDIUM); // data completa
		System.out.println("Data média 1 : " + f.format(data));
		
		
		 f = DateFormat.getDateInstance(DateFormat.SHORT); // data completa
		System.out.println("Data curta 2 : " + f.format(data));
		
		SimpleDateFormat datinha = new SimpleDateFormat("dd/MM/yyy");
		System.out.println("Data Formatada " + datinha.format(data));
		

	}

}
