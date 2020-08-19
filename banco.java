package conta_banco;

public class banco {
	public static void main(String[] args) {
		
		conta p1 = new conta();
		
		p1.setNumCOnta(0001);
		p1.setDono("RENAN");
		p1.abrirConta("CP");
		
		
		
		conta p2 = new conta();
		p2.setNumCOnta(0002);
		p2.setDono("MARIANA");
		p2.abrirConta("CC");
		
		
		
		p1.depositar(150);
		p2.depositar(200);
		
		
		p2.sacar(1000);
		
		
		p1.fecharConta();
		
		p1.sacar(300);
		
		p1.fecharConta();
		
		p1.depositar(100);
		
		
		
		
		p1.estadoAtual();
		p2.estadoAtual();
		
	}

}
