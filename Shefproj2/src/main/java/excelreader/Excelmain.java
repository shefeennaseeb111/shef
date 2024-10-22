package excelreader;

import java.io.IOException;

public class Excelmain {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println(Excelcode.getStringData(1, 0));
		System.out.println(Excelcode.getIntegerData(1, 1));

	}

}
