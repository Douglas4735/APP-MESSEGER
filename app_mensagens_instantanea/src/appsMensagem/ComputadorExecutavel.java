package appsMensagem;

public class ComputadorExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("MESSENGER"); 
		
		MSNMessenger msn = new MSNMessenger();
		msn.receberMensagem();
		msn.enviarMensagem();
		System.out.println("-----------------");

		System.out.println("FACEBOOK");

		FacebookMessenger fcb = new FacebookMessenger();
		fcb.receberMensagem();
		fcb.enviarMensagem();
		System.out.println("------------------");

		System.out.println("TELEGRAM");

		Telegram tlg = new Telegram();
		tlg.receberMensagem();
		tlg.enviarMensagem();
		


	}

}
