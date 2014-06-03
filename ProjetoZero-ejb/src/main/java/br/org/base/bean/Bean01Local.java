/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.org.base.bean;

import br.org.base.model.Model01;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author guilherme
 */
@Local
public interface Bean01Local {

    String businessMethod(String parameter);
    List<Model01> lista();
    
}
