package radioRelogio;

public interface Relogio {
	String getHorario();
	void setHorario(String horario);
	
	String getHorarioAlarme();
	void setHorarioAlarme(String horarioAlarme);
	
	boolean isAlarme();
	void ligarAlarme();
	void desligarAlarme();
	
	int getVolume();
	void setVolume(int Volume);

}
