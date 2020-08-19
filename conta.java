package conta_banco;

public class conta {
	public int numCOnta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	
	//metodos personalizados
	public void estadoAtual() {
		System.out.println("------------------------------");
		System.out.println("Conta: " + this.getNumCOnta());
		System.out.println("TIPO: " + this.getTipo());
		System.out.println("DONO: " + this.getDono());
		System.out.println("SALDO: " + this.getSaldo());
		System.out.println("STATUS: " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if (t =="CC") {
			this.setSaldo(50);
			System.out.println("Conta Corrente aberta com sucesso");
		}else if (t == "CP") {
			this.setSaldo(150);
			System.out.println("Conta Poupança aberta com sucesso");
			
		}else 
			System.out.println("Tipo de conta inexistente por favor defina como CC (conta corrente)ou CP(conta poupança)");
		}
	
	public void fecharConta(){
		if (this.getSaldo()>0) {
			System.out.println("Conta não pode ser fechada porque ainda tem dinheiro nela");
		}else if (this.getSaldo()<0) {
			System.out.println("Conta não pode ser fechada pois existe debitos a serem quitados");
		}else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso");
			
			
		}
		
	}
	
	
	public void depositar(float v) {
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo()+v);
			System.out.println("Deposito realizado na conta de" + this.getDono());
		}else {
			System.out.println("Impossivel depositar em uma conta fechada");
		}
	}
	
	
	
	public void sacar(float v) {
		if(this.getStatus()) {
			if(this.getSaldo()>=v) {
				this.setSaldo(this.getSaldo()-v);
				System.out.println("Saque realizado com de "+this.getDono());
				}else {
					System.out.println("Saldo insuficiente para saque");
				}
				
			}else {
				System.out.println("Impossivel sacar de uma conta fechada!");
		}
		
	}
	
	
	
	public void pagarMensal() {
		int v = 0;
		if(this.getTipo() =="CC") {
			v = 20;
		}else if(this.getTipo() == "CP") {
			v = 20;
			
		}
		
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo()-v);
			System.out.println("Mensalidade paga com sucesso por "+this.getDono());
		}else {
			System.out.println("Impossivel pagar uma conta fechada!");
		}
		
		
	}
	
	
	
	
	
	//metodos especiais 
	
	public conta() {
		
		this.saldo = 0;
		this.status = false;
		
	}
	
	
	//get e set

	public int getNumCOnta() {
		return numCOnta;
	}

	public void setNumCOnta(int numCOnta) {
		this.numCOnta = numCOnta;
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

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
