package com.accountbank.person.worker;

public class BackEndDeveloper extends Worker {
    public BackEndDeveloper(String name, long cpf) {
        super(name, cpf);
    }

    @Override
    public float getBonus() {
        return 0;
    }
}
