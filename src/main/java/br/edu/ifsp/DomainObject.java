package br.edu.ifsp;

public class DomainObject {
    protected String name;

    public DomainObject() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
