package UsuarioBEANS;

public class Usuario {
    private String nombre;
    private String Apellido;
    private String Cedula;
    private String Contraseña;
    private int Telefono;
    private String Sexo;
    private String Departamento;
    private String Localidad;

    public Usuario(String nombre, String Apellido, String Cedula, String Contraseña, int Telefono, String Sexo, String Departamento, String Localidad) {
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Contraseña = Contraseña;
        this.Telefono = Telefono;
        this.Sexo = Sexo;
        this.Departamento = Departamento;
        this.Localidad = Localidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public String getLocalidad() {
        return Localidad;
    }

    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }
    

    
    
    
    
    
    
}
