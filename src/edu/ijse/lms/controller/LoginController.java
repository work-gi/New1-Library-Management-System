/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.lms.controller;

import edu.ijse.lms.dto.LoginDto;
import edu.ijse.lms.service.ServiceFactory;
import edu.ijse.lms.service.custom.LoginService;

/**
 *
 * @author DELL
 */
public class LoginController {
    private LoginService Loginservice=(LoginService)ServiceFactory.getInstance().getService(ServiceFactory.ServiceType.LOGIN);

    public String getLogin(LoginDto dto)throws Exception{
        return Loginservice.getLogin(dto);
    }
}
