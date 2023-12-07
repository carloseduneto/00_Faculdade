package radioRelogio;

public class Main {

	public static void main(String[] args) {
		radioRelogio radioRelogio = new radioRelogio();
		
		radioRelogio.setEmissora("Rádio AM");
		radioRelogio.setTipodeEmissora("AM");
		radioRelogio.setVolumeRadio(70);
		
		radioRelogio.setHorario("08h00");
		radioRelogio.setHorarioAlarme("03h00");
		radioRelogio.ligarAlarme();
		radioRelogio.setVolume(7);
		
		System.out.println("Emissora: "+ radioRelogio.getEmissora());
		System.out.println("Tipo de Emissora: " + radioRelogio.getTipoEmissora());
		System.out.println("Volume do Rádio: "+ radioRelogio.getVolumeRadio());
		
		
		System.out.println("Horário: "+radioRelogio.getHorario());
		System.out.println("Horário do Alarme: "+ radioRelogio.getHorarioAlarme());
		System.out.println("Alarme: "+ radioRelogio.isAlarme());
		System.out.println("Volume: "+ radioRelogio.getVolume());

	}

}
