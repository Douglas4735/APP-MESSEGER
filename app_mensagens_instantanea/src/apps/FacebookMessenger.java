package apps;

public class FacebookMessenger extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		ValidarConectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("ENVIANDO MENSAGEM PELO FACEBOOK");

	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("RECEBENDO MENSAGEM PELO FACEBOOK");

	}

	@Override
	protected void ValidarConectadoInternet() {
		// TODO Auto-generated method stub
		
	}

}
