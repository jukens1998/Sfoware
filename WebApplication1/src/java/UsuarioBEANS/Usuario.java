package UsuarioBEANS;

public class Usuario {
    private String cod,nom;
    private int edad;
    private String sexo,pass;

    public Usuario(String cod, String nom, 
            int edad, String sexo, String pass) {
        this.cod = cod;
        this.nom = nom;
        this.edad = edad;
        this.sexo = sexo;
        this.pass = pass;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
    
    
    
    
    
    
}
