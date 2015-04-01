public class BoundedBuffer{
	private static final int BUFFER_SIZE = 5; // Tamanho do buffer
	private int count; // numero de itens no buffer
	private int in; // aponta para a próxima posição livre
	private int out; // aponta para a próxima posição cheia
	private Object[] buffer;

	public BoundedBuffer(){ // Construtor, apenas inicia as variáveis
		count=0;
		in = 0;
		out = 0;
		buffer = new Object[BUFFER_SIZE]; // instancia o buffer com o tamanho definido acima em BUFFER_SIZE
	}

	public void insert(Object item){ // método responsável por adicionar informação ao buffer
		while(count==BUFFER_SIZE) // se o método estiver cheio
			;						// não faz nada (não adiciona mais nada)
		++count; // se não tiver cheio, vai incrementar o número de itens no buffer
		buffer[in]=item; // adiciona a informação no buffer, na próxima posição livre
		in=(in+1) %BUFFER_SIZE;
	}
	
	public void showBufferData(){ // Método que criei para mostrar o que tem no buffer, só para teste
		System.out.println("\n=== DATA ===");
		if (count==0)
			System.out.println("Não há informação no buffer");
			
		for (int i=0; i<count; i++)
			System.out.println(buffer[i].toString());
	}
		
	public Object remove(){ // Remove a última posição do buffer
		Object item;
		while(count==0) // se o buffer estiver vazio
			;               // não faz nada (não tem o que remover)
		--count; // decresce o número de itens no buffer
		item=buffer[out]; // guarda o que foi removido
		out=(out+1)%BUFFER_SIZE;
		return item; // retorna o que foi removido
	}

}