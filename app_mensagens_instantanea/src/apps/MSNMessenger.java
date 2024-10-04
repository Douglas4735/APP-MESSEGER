package apps;

public class MSNMessenger extends ServicoMensagemInstantanea{
	
	@Override
	public void enviarMensagem() {
		ValidarConectadoInternet();
		// TODO Auto-generated method stub
		System.out.println("ENVIANDO MENSAGEM PELO MESSENGER");
	}

	@Override
	public void receberMensagem() {
		// TODO Auto-generated method stub
		System.out.println("RECEBENDO MENSAGEM PELO MESSENGER");

	}

	@Override
	protected void ValidarConectadoInternet() {
		// TODO Auto-generated method stub
		
	}

}
