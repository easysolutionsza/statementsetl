package com.xmlprocess.service;


import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.persistence.EntityManager;
        import javax.persistence.PersistenceContext;

        import com.xmlprocess.service.XmlProcessService;
        import com.xmlprocess.model.UserDetail;

@Stateless
public class XmlProcessServiceImpl  implements XmlProcessService {

    @PersistenceContext(name="xmlprocessPU")
    private EntityManager em;

   @Override
   @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void addUserDetail(UserDetail user) {

        em.persist(user);

    }
}