public class BoundedBuffer{
	private static final int BUFFER_SIZE = 5; // Tamanho do buffer
	private int count; // numero de itens no buffer
	private int in; // aponta para a pr�xima posi��o livre
	private int out; // aponta para a pr�xima posi��o cheia
	private Object[] buffer;

	public BoundedBuffer(){ // Construtor, apenas inicia as vari�veis
		count=0;
		in = 0;
		out = 0;
		buffer = new Object[BUFFER_SIZE]; // instancia o buffer com o tamanho definido acima em BUFFER_SIZE
	}

	public void insert(Object item){ // m�todo respons�vel por adicionar informa��o ao buffer
		while(count==BUFFER_SIZE) // se o m�todo estiver cheio
			;						// n�o faz nada (n�o adiciona mais nada)
		++count; // se n�o tiver cheio, vai incrementar o n�mero de itens no buffer
		buffer[in]=item; // adiciona a informa��o no buffer, na pr�xima posi��o livre
		in=(in+1) %BUFFER_SIZE;
	}
	
	public void showBufferData(){ // M�todo que criei para mostrar o que tem no buffer, s� para teste
		System.out.println("\n=== DATA ===");
		if (count==0)
			System.out.println("N�o h� informa��o no buffer");
			
		for (int i=0; i<count; i++)
			System.out.println(buffer[i].toString());
	}
		
	public Object remove(){ // Remove a �ltima posi��o do buffer
		Object item;
		while(count==0) // se o buffer estiver vazio
			;               // n�o faz nada (n�o tem o que remover)
		--count; // decresce o n�mero de itens no buffer
		item=buffer[out]; // guarda o que foi removido
		out=(out+1)%BUFFER_SIZE;
		return item; // retorna o que foi removido
	}

}