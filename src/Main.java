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
BF.insert("Qualquer informação");
BF.insert("Teste");
BF.showBufferData();
BF.remove(); // Remove a última posição do buffer, no caso, "Teste"
BF.remove(); // Remove a última posição denovo, nesse caso, "Qualquer informação", já que o Teste ja havia sido removido
BF.showBufferData(); // Mostra resultado
BF.insert("Nova informação");
String itemRemovido = (String) BF.remove(); // Guarda a última informação removida do buffer
System.out.println("\n=== Último item removido === \n"+itemRemovido);

} 

	// =============== FIM Exercicio 1 ========================

}
