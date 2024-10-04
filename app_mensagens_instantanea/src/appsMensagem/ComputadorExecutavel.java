package appsMensagem;

import apps.FacebookMessenger;
import apps.MSNMessenger;
import apps.ServicoMensagemInstantanea;
import apps.Telegram;

public class ComputadorExecutavel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
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
		*/
		
		ServicoMensagemInstantanea 	smi = null;
		/*Não se Sabe qual
		 * mas qualquer um deverá enviar e receber mensagem
		 * */
		String appEscolhido = "tlg";
		if(appEscolhido.equals("msn")){
			smi = new MSNMessenger();
		}else if(appEscolhido.equals("fcb")) {
			smi = new FacebookMessenger();
		}else if(appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}
		smi.enviarMensagem();
		smi.receberMensagem();
	
		
		


	}

}
