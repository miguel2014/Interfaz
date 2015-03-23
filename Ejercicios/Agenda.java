package Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Agenda {

	List <Persona> agenda;
	
	public Agenda(){
		agenda=new ArrayList<Persona>();		
	}
	public void addAgenda(Persona p){
		agenda.add(p);
	}
	public Persona getAgenda(Persona p,int i){
		return agenda.get(i);
	}
	public void rellenarAgenda(){
		addAgenda(new Persona("ABC","DEF","9855858","Calle1"));
		addAgenda(new Persona("DEF","FGH","9456218","Calle2"));
		addAgenda(new Persona("IJK","LMÑ","9123458","Calle3"));
		addAgenda(new Persona("OPQ","RST","9812348","Calle4"));
	}
	public int getsize(){
		return agenda.size();
	}
}
