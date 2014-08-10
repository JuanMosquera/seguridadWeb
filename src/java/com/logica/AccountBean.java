/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.logica;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;

/**
 *
 * @author User
 */
@Stateless
@DeclareRoles({"admins","users","manager"})
public class AccountBean implements AccountBeanLocal {
public double a;
    
    @RolesAllowed("users")
    @Override
    public void deposit(int acno, double amount) {
      
    a=a+amount;
    System.out.println("Deposito de $" + a + " en la cuenta Nro " + acno);
    }

    @RolesAllowed("admins")
    @Override
    public void close(int acno) {
        a=0.0;
   System.out.println("La cuenta Nro " + acno + " ha sido cancelada y el valor del Saldo es $ " + a);
   
    }
    
    @PermitAll
    @Override
    public double getBalance(int acno) {
    System.out.println("Saldo para la cuenta Nro " + acno);
   return a;   
    
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
