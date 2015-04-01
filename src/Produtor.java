import java.util.Date;

public class Produtor implements Runnable {
	MessageQueue mailBox = new MessageQueue(); // Instancia a caixa de correio da classe MessageQueue
	public Produtor(MessageQueue msg){
		mailBox=msg;
	}
	public void run(){ // é executado quando a thread for instanciada
		while(true){ // fica mandando a mensagem infinitamente
			Date message = new Date();
			mailBox.send(message);
		}
	}

}