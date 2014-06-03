/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.org.base.managedbeans;

import br.org.base.model.Model01;
import java.util.List;
import javax.ejb.EJB;
import javax.inject.Inject;

/**
 *
 * @author guilherme
 */
@javax.annotation.ManagedBean
public class MyBean {
    
    
    /*==================*/
    /*  Fields          */
    /*==================*/
    @Inject
    private br.org.base.bean.Bean01Local bean01;
    private List<Model01> modelList;
    private double num;
    private String oi;
    
    /*==================*/
    /*  Constructors    */
    /*==================*/
    public MyBean() {
    }
    
   
    /*==================*/
    /*  Methods         */
    /*==================*/

    public List<Model01> getEmployeeList() {
        modelList = bean01.lista();
        return modelList;
    }
    
    /*==================*/
    /*  Getters setters */
    /*==================*/

    public String getOi() {
        return oi;
    }
    
    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }

    public void setOi(String oi) {
        this.oi = oi;
    }

    public List<Model01> getModelList() {
        return modelList;
    }

    public void setModelList(List<Model01> modelList) {
        this.modelList = modelList;
    }
}
