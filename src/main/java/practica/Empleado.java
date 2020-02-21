package practica;

import javax.persistence.CascadeType;
import javax.persistence.*;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.*;

@Entity
public class Empleado extends Usuario {


   @ManyToMany(mappedBy = "empleados")
       private Collection<Ofertas> ofertas;

    private Date nacimiento;

    public Empleado(){
        super( );
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }


}
