
package controller;

import ejb.PersonaFacadeLocal;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import model.Persona;

@Named("personaController")
@ViewScoped
public class personaController  implements Serializable{
    private Persona persona;
    @EJB
    private PersonaFacadeLocal personaEJB;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public PersonaFacadeLocal getPersonaEJB() {
        return personaEJB;
    }

    public void setPersonaEJB(PersonaFacadeLocal personaEJB) {
        this.personaEJB = personaEJB;
    }
    
    @PostConstruct
    public void init(){
        persona = new Persona();
    }
    
    public void crearPersona(){
        try {
            personaEJB.create(persona);
        } catch (Exception e) {
            
        }
    }
}
