package contas;

public class ControleContas {

	public static void main(String[] args) {
		ContaBanco c1 = new ContaBanco (123,"corrente","manu" ,5f ,true );
		c1.depositar(200);
		c1.status();

	}

}
