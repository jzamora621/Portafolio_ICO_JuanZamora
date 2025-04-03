/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.tienda.service;

import org.springframework.security.core.userdetails.*;

public interface UsuarioDetailsService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

}
