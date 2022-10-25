package com.Entity;

public class Student extends User{
    private Classe classe;

    public Student(Classe classe) {
        this.classe = classe;
    }

    public Student(int id, String name, String lastname, String email, String password, Role role, Classe classe) {
        super(id, name, lastname, email, password, role);
        this.classe = classe;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }
}
