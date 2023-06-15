package l2.project_affectation.model;

import javafx.beans.property.*;
import java.sql.Date;


public class Employee {
    // Declare employee table columns
    private StringProperty  num_empl;
    private StringProperty  civilite;
    private StringProperty  nom_empl;
    private StringProperty  prenoms_empl;
    private StringProperty  email;
    private StringProperty  poste;
    private StringProperty  lieu;

    // Raha nombre dia atao hoe IntegerProperty


    // Constructor
    public Employee(){
        this.num_empl = new SimpleStringProperty();
        this.civilite = new SimpleStringProperty();
        this.nom_empl = new SimpleStringProperty();
        this.prenoms_empl = new SimpleStringProperty();
        this.email = new SimpleStringProperty();
        this.poste = new SimpleStringProperty();
        this.lieu = new SimpleStringProperty();
    }

    // num_empl

    public String getNumEmpl(){
        return num_empl.get();
    }
    public void setNumEmpl(String numEmpl){
        this.num_empl.set(numEmpl);
    }

    public StringProperty numEmplProperty(){
        return num_empl;
    }

    //civilite

    public String getCivilite(){
        return civilite.get();
    }
    public void setCivilite(String Civilite){
        this.civilite.set(Civilite);
    }

    public StringProperty civiliteProperty(){
        return civilite;
    }

    //Nom

    public String getNomEmpl(){
        return nom_empl.get();
    }
    public void setNom_empl(String NomEmpl){
        this.nom_empl.set(NomEmpl);
    }

    public StringProperty nomEmplProperty(){
        return nom_empl;
    }

    //Prenoms

    public String getPrenomEmpl(){
        return prenoms_empl.get();
    }
    public void setPrenoms_empl(String prenomEmpl){
        this.prenoms_empl.set(prenomEmpl);
    }

    public StringProperty prenomEmplProperty(){
        return prenoms_empl;
    }

    //Email

    public String getEmail(){
        return email.get();
    }
    public void setEmail(String Emails){
        this.email.set(Emails);
    }

    public StringProperty emailProperty(){
        return email;
    }

    //Poste

    public String getPoste(){
        return poste.get();
    }
    public void setPoste(String Postes){
        this.poste.set(Postes);
    }

    public StringProperty posteProperty(){
        return poste;
    }

    //Lieu

    public String getLieu(){
        return lieu.get();
    }
    public void setLieu(String Lieu){
        this.num_empl.set(Lieu);
    }

    public StringProperty lieuProperty(){
        return lieu;
    }
}
