import java.util.Date;
public class Consumidor implements Runnable {
	MessageQueue mailBox = new MessageQueue();
	
	public Consumidor(MessageQueue msg){
		mailBox=msg;
	}
	
	public void run(){ // é executado quando a thread for instanciada
		while(true){ // fica "esperando" pela mensagem
			Date message = (Date) mailBox.receive();
			
			if (message!=null) // verifica se não está vazio
				System.out.println(message.toString()); // printa na tela a mensagem (data)
		}
	}
}