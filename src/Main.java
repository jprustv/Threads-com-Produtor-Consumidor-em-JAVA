public class Main{
	
	      // ================= Exercicio 2 ===========================
	/*
	public static void main(String args[]){ // Primeira classe a ser executada, Main
		MessageQueue msg = new MessageQueue();
		Produtor prod = new Produtor(msg);
		Consumidor consu = new Consumidor(msg);
		Thread produtor = new Thread(prod); // Instancia as Threads
		Thread consumidor = new Thread(consu);
		produtor.start(); // Starta as threads
		consumidor.start();
	}
	*/
		// ==================== FIM Exercicio 2 ========================
	
	// ==================  Exercicio 1 =================== 
	public static void main(String args[]){
BoundedBuffer BF = new BoundedBuffer();
BF.insert("Qualquer informa��o");
BF.insert("Teste");
BF.showBufferData();
BF.remove(); // Remove a �ltima posi��o do buffer, no caso, "Teste"
BF.remove(); // Remove a �ltima posi��o denovo, nesse caso, "Qualquer informa��o", j� que o Teste ja havia sido removido
BF.showBufferData(); // Mostra resultado
BF.insert("Nova informa��o");
String itemRemovido = (String) BF.remove(); // Guarda a �ltima informa��o removida do buffer
System.out.println("\n=== �ltimo item removido === \n"+itemRemovido);

} 

	// =============== FIM Exercicio 1 ========================

}
