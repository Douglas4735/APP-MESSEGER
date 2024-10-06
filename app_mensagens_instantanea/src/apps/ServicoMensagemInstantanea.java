package apps;

public abstract class ServicoMensagemInstantanea {

	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	protected void ValidarConectadoInternet() {
		System.out.println("VALIDANDO SE ESTÁ CONECTADO A INTERNET");
	}
}
