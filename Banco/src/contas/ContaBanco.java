package contas;

public class ContaBanco {

	private int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public  ContaBanco(int nc, String t, String d, float s, boolean st) {
		this.numConta=nc;
		this.tipo=t;
		this.dono=d;
		this.saldo=s;
		this.status=st;
		this.setSaldo(0);
	}
	
	public void abrirconta(String t) {
		setTipo(t);
		setStatus(true);
		if(t=="CORRENTE") {
			setSaldo(50);
		}else {
			setSaldo(150);
	}
	}
	public void fecharconta() {
		if(saldo>0) {
			System.out.println("saque que saldo de R$" + saldo +" para poder fechar sua conta ");
		}else if(saldo<0) {
			System.out.println("pague sua dívida de R$" + saldo + " para poder fechar sua conta");
		}else {
			setStatus(false);
			System.out.println("conta fechada");
		}
	}
	public void depositar(int v) {
		if(status=true) {
			setSaldo(getSaldo()+v);
		}else {
			System.out.println("esta conta não existe");
		}
	}
	public void sacar(int m) {
		if(status=true) {
			if(getSaldo()>m) {
				setSaldo(getSaldo()-m);
			}
			else {
				System.out.println("saldo insuficiente");
			}
		}else {
			System.out.println("esta conta não existe");
		}
	}
	public void pagarMensal() {
		int v;
		if(getTipo()=="CORRENTE") {
			v=12;	
		}else {
			v=20;
		}
		if(status=true) {
			if(getSaldo()>=v) {
				setSaldo(getSaldo()-v);
			}else {
				System.out.println("saldo insuficiente");
			}
		}
		else {
			System.out.println("esta conta não existe");
		}
	}
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void status() {
		System.out.println("numero:" + this.getNumConta()+ "saldo:" + this.getSaldo() );
	}
	
	
	
}


