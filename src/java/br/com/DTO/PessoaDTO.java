
package br.com.DTO;


public class PessoaDTO {
    private int id_cliente;
    private String cpf;
    private String name;
    private String date;
    private String email;
    private String sexo;
    private String password;

    
     public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_pessoa) {
        this.id_cliente = id_cliente;
    }
     
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
    
}
