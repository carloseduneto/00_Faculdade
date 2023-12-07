package radioRelogio;

public class radioRelogio implements Radio, Relogio {
	private String emissora;
	private String tipoEmissora;
	private int volumeRadio;
	private String horario;
	private String horarioAlarme;
	private boolean alarme;
	private int volume;
	
	
	public radioRelogio(String emissora, String tipoEmissora, int volumeRadio, String horario, String horarioAlarme,
			boolean alarme, int volume) {
		super();
		this.emissora = emissora;
		this.tipoEmissora = tipoEmissora;
		this.volumeRadio = volumeRadio;
		this.horario = horario;
		this.horarioAlarme = horarioAlarme;
		this.alarme = alarme;
		this.volume = volume;
	}

	public void setTipoEmissora(String tipoEmissora) {
		this.tipoEmissora = tipoEmissora;
	}

	public void setVolumeRadio(int volumeRadio) {
		this.volumeRadio = volumeRadio;
	}

	public void setAlarme(boolean alarme) {
		this.alarme = alarme;
	}

	public radioRelogio() {
		
	}

	@Override
	public String getHorario() {
		// TODO Auto-generated method stub
		return horario;
	}

	@Override
	public void setHorario(String horario) {
		this.horario = horario;
		
	}

	@Override
	public String getHorarioAlarme() {
		// TODO Auto-generated method stub
		return horarioAlarme;
	}

	@Override
	public void setHorarioAlarme(String horarioAlarme) {
		this.horarioAlarme = horarioAlarme;
		
	}

	@Override
	public boolean isAlarme() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void ligarAlarme() {
		System.out.println("Alarme ligado");
		
	}

	@Override
	public void desligarAlarme() {
		System.out.println("Alarme desligado");
		
	}

	@Override
	public int getVolume() {
		// TODO Auto-generated method stub
		return volume;
	}

	@Override
	public void setVolume(int Volume) {
		this.volume = Volume;
		
	}

	@Override
	public String getEmissora() {
		
		return emissora;
	}

	@Override
	public void setEmissora(String emissora) {
		this.emissora= emissora;
		
	}

	@Override
	public String getTipoEmissora() {
		// TODO Auto-generated method stub
		return tipoEmissora;
	}

	@Override
	public void setTipodeEmissora(String tipoDeEmissora) {
		this.tipoEmissora = tipoDeEmissora;
		
	}

	@Override
	public int getVolumeRadio() {
		// TODO Auto-generated method stub
		return volumeRadio;
	}

	@Override
	public void setVolumeRedio(int voumeRadio) {
		this.volumeRadio = voumeRadio;
		
	}

}
