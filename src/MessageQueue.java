import java.util.*;
public class MessageQueue{ // Ou "Mailbox"
	private Vector queue; // vetor para fila
	public MessageQueue(){
		queue = new Vector();
		
	}
	
	public void send(Object item){ // método para enviar a mensagem
		queue.addElement(item); // adiciona a mensagem na fila
	}
	public Object receive(){ // método para receber a mensagem
		if(queue.size()==0) // fila vazia
			return null;
		else
			return queue.remove(0); // retorna a mensagem e remove-a (passa para a próxima mensagem da fila)
	}

}
