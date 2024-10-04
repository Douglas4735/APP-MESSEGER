package apps;

public class Telegram extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		ValidarConectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("ENVIANDO MENSAGEM PELO TELEGRAM");

	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("RECEBENDO MENSAGEM PELO TELEGRAM");

	}

	@Override
	protected void ValidarConectadoInternet() {
		// TODO Auto-generated method stub
		
	}

}
