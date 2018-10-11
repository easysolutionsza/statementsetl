package com.xmlprocess.controller;


import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.xmlprocess.service.XmlProcessService;
import com.xmlprocess.model.UserDetail;

    @ManagedBean
    @RequestScoped
    public class ProcessController {



   @EJB
       private  XmlProcessService xmlservice;
        private   UserDetail userdetail;

       @PostConstruct

        public void init()
        {
            userdetail=new UserDetail();
        }

        public UserDetail getUserDetail() {
            return userdetail;
        }

        public void setUserDetail(UserDetail userdetail) {
            this.userdetail = userdetail;
        }

        public void saveUserDetail(UserDetail userdetail) {
            xmlservice.addUserDetail(userdetail);
        }

    }
