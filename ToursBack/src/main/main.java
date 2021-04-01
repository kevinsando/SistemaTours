/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import BLL.ToursBLL;

/**
 *
 * @author Kevin Sandoval
 */
public class main {

    public static void main(String[] args) {
        System.out.println("USUARIO:");
        System.out.println(ToursBLL.getInstance().getDestinos());
    }
}
