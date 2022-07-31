/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mfaapplication.method;

/**
 *
 * @author jeeva
 */
public interface MFAuthenticationMethod<T, U> {
    public T send();
    public Boolean verify(U u);
}
