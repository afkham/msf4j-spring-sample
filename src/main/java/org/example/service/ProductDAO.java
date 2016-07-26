/*
 *  Copyright (c) 2016 WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */
package org.example.service;


import org.springframework.stereotype.Component;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Component
public class ProductDAO {

    @PersistenceContext
    private EntityManager em;

    public void persist(Product product) {
        em.persist(product);
    }

    public List<Product> findAll() {
        return em.createQuery("SELECT p FROM Product p").getResultList();
    }

    public Product find(Integer id) {
        Query query = em.createQuery("SELECT p FROM Product p where id = :id");
        query.setParameter("id", id);
        return (Product) query.getSingleResult();
    }

}
