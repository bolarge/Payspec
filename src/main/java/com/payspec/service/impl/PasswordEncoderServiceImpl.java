/*
package com.payspec.payspec.service.api.service;

public class PasswordEncoderServiceImpl implements PasswordEncoder {

    private StringDigester passwordEncryptor;

    public PasswordEncoderServiceImpl(){}

    public void setPasswordEncryptor(StringDigester passwordEncryptor){
        this.passwordEncryptor = passwordEncryptor;
    }

    @Override
    public String encode(CharSequence charSequence) {
        String encryptedPassword = passwordEncryptor.digest(charSequence.toString());
        return encryptedPassword;
    }

    @Override
    public boolean matches(CharSequence charSequence, String encryptedPassword) {
        return passwordEncryptor.matches(charSequence.toString(), encryptedPassword);
    }

}
*/
