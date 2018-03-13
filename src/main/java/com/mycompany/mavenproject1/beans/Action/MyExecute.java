/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.beans.Action;

import com.mycompany.mavenproject1.beans.user.User;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author jason email: 765798166@qq.com
 * @date 2018-3-10 19:15:51
 */
public class MyExecute extends ActionSupport {

    private User user;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
