package Salud;

public class Empleado extends Persona3 {
private String cargo;
private int valorhora;
private int horastrabajadas;
private String departamento;
//getters
public String getCargo() {
    return cargo;
}
public int getValorhora() {
    return valorhora;
}
public int getHorastrabajadas() {
    return horastrabajadas;
}
public String getDepartamento() {
    return departamento;
}
//setters
public void setCargo(String cargo) {
    this.cargo = cargo;
}
public void setValorhora(int valorhora) {
    this.valorhora = valorhora;
}
public void setHorastrabajadas(int horastrabajadas) {
    this.horastrabajadas = horastrabajadas;
}
public void setDepartamento(String departamento) {
    this.departamento = departamento;
}
//metodos
public double calcularhorarios(int valorhora, int horastrabajadas) {
    this.valorhora=valorhora;
    this.horastrabajadas=horastrabajadas;
    int calcularhorarios;
    double reteica;
    calcularhorarios=valorhora*horastrabajadas;
    reteica=(calcularhorarios* 0.9666)/100;
    double valortotal=calcularhorarios-reteica;
    return valortotal;
}

}
