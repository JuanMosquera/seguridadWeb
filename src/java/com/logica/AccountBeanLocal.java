/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.logica;

import javax.ejb.Local;

/**
 *
 * @author User
 */
@Local
public interface AccountBeanLocal {
    public void deposit(int acno,double amount);
     public void close(int acno);
     public double getBalance(int acno);
    
}
