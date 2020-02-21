package practica;

import javax.persistence.*;
import java.util.*;
import java.util.Set;

@Entity
public class Company extends Usuario {

    private String nameCompany;
    private String descripcion;
    private String ciudad;
    private String provincia;
    @OneToMany(mappedBy="company")
    private Collection<Ofertas> ofertas;


    public Company(){
        super( );
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }


}
